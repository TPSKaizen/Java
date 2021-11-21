package thrillio.dataStore;

import thrillio.entities.User;
import thrillio.entities.Bookmark;
import thrillio.entities.UserBookmark;
import thrillio.managers.*;
import thrillio.util.IOUtil;
import thrillio.constants.*;

//This class is a stand-in for a real life database
//The DAO will be a representation of our SQL Queries
public class DataStore {
	// Create datastructures to hold data

	private static final int USER_BOOKMARK_LIMIT = 5;

	private static final int BOOKMARK_COUNT_PER_TYPE = 5;

	private static final int BOOKMARK_TYPES_COUNT = 3;

	private static final int TOTAL_USER_COUNT = 5;

	// DS for User Data
	private static User[] users = new User[TOTAL_USER_COUNT];

	public static User[] getUsers() {
		return users;
	} // returns array of data

	// DS for Bookmark data
	// 2d array since there are different types of bookmarks
	// 3 types, up to 5 bookmarks
	private static Bookmark[][] bookmarks = new Bookmark[BOOKMARK_TYPES_COUNT][BOOKMARK_COUNT_PER_TYPE];

	public static Bookmark[][] getBookmarks() {
		return bookmarks;
	} // returns 2d array of data

	// DS for UserBookmarks
	// 5 users can bookmark 5 things, so 5*5 limit
	private static UserBookmark[] userBookmarks = new UserBookmark[TOTAL_USER_COUNT * USER_BOOKMARK_LIMIT];
	private static int bookmarkIndex = 0;
	// Since different users will be bookmarking, we need to an index which
	// increments with every
	// insertion thats made in a "global" sense. So we created bookmarkIndex which
	// increments with every add operation

	// Method for loading all the data

	public static void loadData() {
		// TODO : Load data for User, Movies, Weblinks, books

		loadUsers();
		loadBooks();
		loadMovies();
		loadWebLinks();
	}

	private static void loadUsers() {
	// Hard coded
		/*
		users[0] = UserManager.getInstance().createUser((long) 1000, "user0@semanticsquare.com", "test", "John", "M",
				Gender.MALE, UserType.USER);
		users[1] = UserManager.getInstance().createUser((long) 1001, "user1@semanticsquare.com", "test", "Sam", "M",
				Gender.MALE, UserType.USER);
		users[2] = UserManager.getInstance().createUser((long) 1002, "user2@semanticsquare.com", "test", "Anita", "M",
				Gender.MALE, UserType.EDITOR);
		users[3] = UserManager.getInstance().createUser((long) 1003, "user3@semanticsquare.com", "test", "Sara", "M",
				Gender.FEMALE, UserType.EDITOR);
		users[4] = UserManager.getInstance().createUser((long) 1004, "user4@semanticsquare.com", "test", "Dheeru", "M",
				Gender.MALE, UserType.CHIEF_EDITOR);
		*/
		String[] data = new String[TOTAL_USER_COUNT];
		IOUtil.read(data, "User"); //reading the data from file
		int rowNum = 0;
		for (String row : data) { //read a single line
			String[] values = row.split("\t"); // delimit by tabs
			
			int gender = Gender.MALE;
			if(values[5].equals("f")) {
				gender = Gender.FEMALE;
			} else if (values[5].equals("t")){
				gender = Gender.TRANSGENDER;
			} 
			users[rowNum++] = UserManager.getInstance().createUser(Long.parseLong(values[0]), values[1], values[2], values[3], values[4], gender, values[6]);
		}
	}

	private static void loadWebLinks() {
		// Hard coded
		/*
		bookmarks[0][0] = BookmarkManager.getInstance().createWebLink(2000, "Taming Tiger, Part 2",
				"http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html",
				"http://www.javaworld.com");
		bookmarks[0][1] = BookmarkManager.getInstance().createWebLink(2001,
				"How do I import a pre-existing Java project into Eclipse and get up and running?",
				"http://stackoverflow.com/questions/142863/how-do-i-import-a-pre-existing-java-project-into-eclipse-and-get-up-and-running",
				"http://www.stackoverflow.com");
		bookmarks[0][2] = BookmarkManager.getInstance().createWebLink(2002, "Interface vs Abstract Class",
				"http://mindprod.com/jgloss/interfacevsabstract.html", "http://mindprod.com");
		bookmarks[0][3] = BookmarkManager.getInstance().createWebLink(2003, "NIO tutorial by Greg Travis",
				"http://cs.brown.edu/courses/cs161/papers/j-nio-ltr.pdf", "http://cs.brown.edu");
		bookmarks[0][4] = BookmarkManager.getInstance().createWebLink(2004, "Virtual Hosting and Tomcat",
				"http://tomcat.apache.org/tomcat-6.0-doc/virtual-hosting-howto.html", "http://tomcat.apache.org");
				*/
		
		//Reading from File
		String[] data = new String[BOOKMARK_COUNT_PER_TYPE];
		IOUtil.read(data, "WebLink");
		int count = 0;
		
		for(String row : data) {
			String[] values = row.split("\t");
			
			bookmarks[0][count++] = BookmarkManager.getInstance().createWebLink(Long.parseLong(values[0]), values[1], values[2], values[3]);
		}
	}

	private static void loadMovies() {
		// Hard coded
		/*
		bookmarks[1][0] = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", "", 1941,
				new String[] { "Orson Welles", "Joseph Cotten" }, new String[] { "Orson Welles" }, MovieGenre.CLASSICS,
				8.5);
		bookmarks[1][1] = BookmarkManager.getInstance().createMovie(3001, "The Grapes of Wrath", "", 1940,
				new String[] { "Henry Fonda", "Jane Darwell" }, new String[] { "John Ford" }, MovieGenre.CLASSICS, 8.2);
		bookmarks[1][2] = BookmarkManager.getInstance().createMovie(3002, "A Touch of Greatness", "", 2004,
				new String[] { "Albert Cullum" }, new String[] { "Leslie Sullivan" }, MovieGenre.CLASSICS, 7.3);
		bookmarks[1][3] = BookmarkManager.getInstance().createMovie(3003, "The Big Bang Theory", "", 2007,
				new String[] { "Kaley Cuoco", "Jim Parsons" }, new String[] { "Chuck Lorre,Bill Prady" },
				MovieGenre.TV_SHOWS, 8.7);
		bookmarks[1][4] = BookmarkManager.getInstance().createMovie(3004, "Ikiru", "", 1952,
				new String[] { "Takashi Shimura,Minoru Chiaki" }, new String[] { "Akira Kurosawa" }, "Foreign Movies",
				8.4);
			*/
		
		String[] data = new String[BOOKMARK_COUNT_PER_TYPE];
		IOUtil.read(data, "Movie");
		int count = 0;
		
		for(String row : data) {
			String[] values = row.split("\t");
			
			String[] cast  = values[3].split(","); // cast can have multiple values, so we split it
			String[] directors = values[4].split(","); // directors can have multiple values, so we split it
			
			bookmarks[1][count++] = BookmarkManager.getInstance().createMovie(Long.parseLong(values[0]), "", values[1], Integer.parseInt(values[2]), cast, directors, values[5], 	Double.parseDouble(values[6]));
		}
		
	}

	private static void loadBooks() {
		// Hard coded
		/*
		bookmarks[2][0] = BookmarkManager.getInstance().createBook(4000, "Walden", 1854, "Wilder Publications",
				new String[] { "Henry David Thoreau" }, BookGenre.PHILOSOPHY, 4.3);
		bookmarks[2][1] = BookmarkManager.getInstance().createBook(4001, "Self-Reliance and Other Essays", 1993,
				"Dover Publications", new String[] { "Ralph Waldo Emerson" }, BookGenre.PHILOSOPHY, 4.5);
		bookmarks[2][2] = BookmarkManager.getInstance().createBook(4002, "Light From Many Lamps", 1988, "Touchstone",
				new String[] { "Lillian Eichler Watson" }, BookGenre.PHILOSOPHY, 5.0);
		bookmarks[2][3] = BookmarkManager.getInstance().createBook(4003, "Head First Design Patterns", 2004,
				"O'Reilly Media", new String[] { "Eric Freeman", "Bert Bates", "Kathy Sierra", "Elisabeth Robson" },
				BookGenre.TECHNICAL, 4.5);
		bookmarks[2][4] = BookmarkManager.getInstance().createBook(4004, "Effective Java Programming Language Guide",
				2007, "Prentice Hall", new String[] { "Joshua Bloch" }, BookGenre.TECHNICAL, 4.9);
			*/
		
		String[] data = new String[BOOKMARK_COUNT_PER_TYPE]; //set space
		IOUtil.read(data, "Book"); //read data from source into space
		int count = 0;
		
		for(String row : data) {
			String[] values = row.split("\t");
			String[] authors = values[4].split(",");
			
			bookmarks[2][count++] = BookmarkManager.getInstance().createBook(Long.parseLong(values[0]), values[1], Integer.parseInt(values[2]), values[3], authors, values[5], Double.parseDouble(values[6]));
		}
		
	}

	public static int getUserBookmarkLimit() {
		return USER_BOOKMARK_LIMIT;
	}

	public static int getBookmarkCountPerType() {
		return BOOKMARK_COUNT_PER_TYPE;
	}

	public static int getBookmarkTypesCount() {
		return BOOKMARK_TYPES_COUNT;
	}

	public static int getTotalUserCount() {
		return TOTAL_USER_COUNT;
	}

	public static UserBookmark[] getUserBookmark() {
		return userBookmarks;
	}

	public static void add(UserBookmark userbookmark) {
		// TODO Auto-generated method stub
		userBookmarks[bookmarkIndex] = userbookmark;
		bookmarkIndex++;
	}
	/*

	public static void updateBookmarkKidFriendlyStatus(User user, Bookmark bookmark, String kidFriendlyStatus) {
		// TODO Auto-generated method stub

		boolean userExists = false;

		for (User usr : users) {
			if (user == usr)
				userExists = true;
		}

		// Search and see if user is actually existing

		// Search and make sure bookmark is actually existing
		for (Bookmark[] bookmarkList : bookmarks) {
			for (Bookmark bm : bookmarkList) {
				if (bookmark == bm && userExists) {// == is used here because we are checking if its pointing to the
													// same memory address
					bm.setKidFriendlyStatus(kidFriendlyStatus);
					bm.setKidFriendlyMarkedBy(user);
					break;
				}
			}
		}
	}

	public static User getUserWhoBookmarked(Bookmark bookmark) {
		return bookmark.getKidFriendlyMarkedBy();
	}

*/
}
