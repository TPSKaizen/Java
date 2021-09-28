package managers;


import dao.BookmarkDao;
import trillio.entities.Book;
import trillio.entities.Bookmark;
import trillio.entities.Movie;
import trillio.entities.User;
import trillio.entities.UserBookmark;
import trillio.entities.WebLink;

public class BookmarkManager {

	// 1. Create Instance using Singleton approach from within the class
	// 2. Create and return bookmark obj

	private static BookmarkManager instance = new BookmarkManager();

	//DAO layer: 
	private static BookmarkDao dao = new BookmarkDao();
	
	private BookmarkManager() {
	}

	public static BookmarkManager getInstance() {
		return instance;
	}
	

	public Bookmark createBookmark(long id, String title, String profileUrl) {
		Bookmark bookmark = new Bookmark();

		bookmark.setId(id);
		bookmark.setTitle(title);
		bookmark.setProfileUrl(profileUrl);

		return bookmark;
	}

	public Movie createMovie(long id, String title, String profileUrl, int releaseYear, String[] cast,
			String[] directors, String genre, double imbdbRating) {

		Movie movie = new Movie();

		movie.setCast(cast);
		movie.setDirectors(directors);
		movie.setGenre(genre);
		movie.setId(id);
		movie.setProfileUrl(profileUrl);
		movie.setImbdbRating(imbdbRating);
		movie.setReleaseYear(releaseYear);
		movie.setTitle(title);
		return movie;
	}

	public Book createBook(long id, String title, int publicationYear, String publisher,
			String[] authors, String genre, double amazongRating) {
		Book book = new Book();
		
		book.setId(id);
		book.setAmazongRating(amazongRating);
		book.setAuthors(authors);
		book.setGenre(genre);
		book.setPublicationYear(publicationYear);
		book.setPublisher(publisher);
		book.setTitle(title);
	
		return book;
	}

	public WebLink createWebLink(long id, String title, String host, String url) {
		WebLink weblink = new WebLink();

		weblink.setHost(host);
		weblink.setUrl(url);
		
		return weblink;
	}
	
	public Bookmark[][] getBookmarks() {
		return dao.getBookmarks();
	}

	public void saveUserBookmark(User user, Bookmark bookmark) {
		// TODO Auto-generated method stub
		UserBookmark userBookmark = new UserBookmark();
		userBookmark.setUser(user);
		userBookmark.setBookmark(bookmark);
		
		dao.saveUserBookmark(userBookmark);
	}

}
