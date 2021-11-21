package thrillio.managers;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

import thrillio.Daos.BookmarkDao;
import thrillio.entities.Book;
import thrillio.entities.Bookmark;
import thrillio.entities.Movie;
import thrillio.entities.User;
import thrillio.entities.UserBookmark;
import thrillio.entities.WebLink;
import thrillio.util.HttpConnect;
import thrillio.util.IOUtil;

public class BookmarkManager {
	//Create Singleton
	
	private static BookmarkManager instance = new BookmarkManager();
	private BookmarkManager() {}
	
	public static BookmarkManager getInstance() {
		return instance;
	}
	
	/* DAO Layer Instantiation */
	private static BookmarkDao dao = new BookmarkDao();
	 
	
	//Method for instantiating Bookmarks
	// TODO : Book, Movie, WebLink
	
	public Book createBook(long id, String title, int publicationYear, String publisher, String[] authors, String genre, double amazonRating) {
		Book book = new Book();
		
		book.setId(id);
		book.setTitle(title);
		book.setPublicationYear(publicationYear);
		book.setPublisher(publisher);
		book.setAuthors(authors);
		book.setGenre(genre);
		book.setAmazonRating(amazonRating);
		
		return book;
	}
	
	public Movie createMovie(long id, String title, String profileUrl, int releaseYear, String[] cast, String[] directors, String genre, double imdbRating) {
		Movie movie = new Movie();
		
		movie.setId(id);
		movie.setTitle(title);
		movie.setProfileUrl(profileUrl);
		movie.setReleaseYear(releaseYear);
		movie.setCast(cast);
		movie.setDirectors(directors);
		movie.setGenre(genre);
		movie.setImdbRating(imdbRating);
		
		return movie;
	}
	
	public WebLink createWebLink(long id, String title, String url, String host) {
		WebLink weblink = new WebLink();
		
		weblink.setId(id);
		weblink.setTitle(title);
		weblink.setUrl(url);
		weblink.setHost(host);
		
		return weblink;
	}
	
	//Dao Method Invocation
	
	public Bookmark[][] getBookmarks(){
		return dao.getBookmarks();
	}

	public void saveUserBookmark(User user, Bookmark bookmark) {
		// TODO Auto-generated method stub
		UserBookmark userbookmark = new UserBookmark();
		userbookmark.setUser(user);
		userbookmark.setBookmark(bookmark);
		
		//Downloading bookmark
		if(bookmark instanceof WebLink) {
			try {
				String url = ((WebLink) bookmark).getUrl();
				if(!url.endsWith(".pdf")) {
					String webpage = HttpConnect.download(((WebLink) bookmark).getProfileUrl());
					if(webpage != null) {
						IOUtil.write(webpage, bookmark.getId());
					}
				}
			} catch(MalformedURLException e) {
				e.printStackTrace();
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//Pass this object to DAO
		dao.saveUserBookmark(userbookmark); //Passing the entity
	}
	
	public User getUserWhoBookmarked(Bookmark bookmark) {
		return bookmark.getKidFriendlyMarkedBy();
	}

	public void setKidFriendlyStatus(User user, Bookmark bookmark, String kidFriendlyStatus) {
		// TODO Auto-generated method stub
		bookmark.setKidFriendlyStatus(kidFriendlyStatus);
		bookmark.setKidFriendlyMarkedBy(user);
	}

	public void share(User user, Bookmark bookmark) {
		// TODO Auto-generated method stub
		bookmark.setSharedBy(user);
		
		if(bookmark instanceof Book) {
			System.out.println(((Book) bookmark).getItemData());
			System.out.println(" ");
		}
		
		if(bookmark instanceof WebLink) {
			System.out.println(((WebLink) bookmark).getItemData());
			System.out.println(" ");
		}
	}
	

	private void hello() {
		System.out.println("Hello");
	}
	
}
