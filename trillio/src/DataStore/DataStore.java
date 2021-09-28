package DataStore;
import constants.BookGenre;
import constants.Gender;
import constants.MovieGenre;
import constants.UserType;
import managers.BookmarkManager;
import managers.UserManager;
import trillio.entities.Bookmark;
import trillio.entities.User;
import trillio.entities.UserBookmark;
//TO retrieve this data, we need a DAO. In this case, we will use getter methods in place of SQL queries since
// we are storing the data locally and not on an actual DB yet
public class DataStore {

	public static final int USER_BOOKMARK_LIMIT = 5;
	public static final int BOOKMARK_COUNT_PER_TYPE = 5;
	public static final int BOOKMARK_TYPES_COUNT = 3;
	public static final int TOTAL_USER_COUNT = 5;
	
	// array for holding the user information
	private static User[] users = new User[TOTAL_USER_COUNT];
	// array for holding bookmark info (1 dimension for type, other for actual
	// bookmark)
	private static Bookmark[][] bookmarks = new Bookmark[BOOKMARK_TYPES_COUNT][BOOKMARK_COUNT_PER_TYPE];
	// array to hold user bookmark. Each user can utilize 5 bookmarks
	private static UserBookmark[] userBookmarks = new UserBookmark[TOTAL_USER_COUNT * USER_BOOKMARK_LIMIT];
	private static int bookmarkIndex = 0;
	
	public static User[] getUsers() {
		return users;
	}

	public static Bookmark[][] getBookmarks() {
		return bookmarks;
	}

	//used to populated the data structures
	public static void loadData() {
		loadUsers();
		loadWeblinks();
		loadMovies();
		loadBooks();
	}

	private static void loadUsers() {
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
	}

	private static void loadWeblinks() {
		bookmarks[0][0] = BookmarkManager.getInstance().createWebLink((long)2000,	"Taming Tiger, Part 2", "http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html", "http://www.javaworld.com");
		bookmarks[0][1] = BookmarkManager.getInstance().createWebLink((long)2001,  "How do I import a pre-existing Java project into Eclipse and get up and running?",	"http://stackoverflow.com/questions/142863/how-do-i-import-a-pre-existing-java-project-into-eclipse-and-get-up-and-running","http://www.stackoverflow.com");
		bookmarks[0][2] = BookmarkManager.getInstance().createWebLink((long)2002, "Interface vs Abstract Class", "http://mindprod.com/jgloss/interfacevsabstract.html",	"http://mindprod.com");
		bookmarks[0][3] = BookmarkManager.getInstance().createWebLink((long)2003, "NIO tutorial by Greg Travis","http://cs.brown.edu/courses/cs161/papers/j-nio-ltr.pdf",	"http://cs.brown.edu");
		bookmarks[0][4] = BookmarkManager.getInstance().createWebLink((long)2004, "Virtual Hosting and Tomcat", "http://tomcat.apache.org/tomcat-6.0-doc/virtual-hosting-howto.html",	"http://tomcat.apache.org");
	}

	private static void loadMovies() {
		bookmarks[1][0] = BookmarkManager.getInstance().createMovie((long)3000, "Citizen Kane","",	1941, new String[] {"Orson Welles","Joseph Cotten"}, new String[] {"Orson Welles"}	,MovieGenre.CLASSICS,8.5);
		bookmarks[1][1] = BookmarkManager.getInstance().createMovie((long)3001,	"The Grapes of Wrath","",	1940,	new String[] {"Henry Fonda","Jane Darwell"}, new String[] {"John Ford"}, MovieGenre.CLASSICS,8.2);
		bookmarks[1][2] = BookmarkManager.getInstance().createMovie((long)3002,	"A Touch of Greatness","",	2004,	new String[] {"Albert Cullum"}, new String[] {"Leslie Sullivan"}, MovieGenre.CLASSICS,	7.3);
		bookmarks[1][3] = BookmarkManager.getInstance().createMovie((long)3003,	"The Big Bang Theory","",	2007,	new String[] {"Kaley Cuoco", "Jim Parsons"}, new String[] {"Chuck Lorre,Bill Prady"},	MovieGenre.TV_SHOWS,	8.7);
		bookmarks[1][4] = BookmarkManager.getInstance().createMovie((long)3004,	"Ikiru","",	1952,	new String[] {"Takashi Shimura,Minoru Chiaki"}, new String[]{"Akira Kurosawa"},	"Foreign Movies",8.4);
	}
	
	private static void loadBooks() {
		bookmarks[2][0] = BookmarkManager.getInstance().createBook(4000,	"Walden",	1854,	"Wilder Publications",	new String[] {"Henry David Thoreau"},	BookGenre.PHILOSOPHY,	4.3	);
		bookmarks[2][1] = BookmarkManager.getInstance().createBook(4001,	"Self-Reliance and Other Essays",	1993,	"Dover Publications",	new String[] {"Ralph Waldo Emerson"},	BookGenre.PHILOSOPHY,	4.5	);
		bookmarks[2][2] = BookmarkManager.getInstance().createBook(4002,	"Light From Many Lamps",	1988,	"Touchstone", new String []{"Lillian Eichler Watson"},	BookGenre.PHILOSOPHY,	5.0	);
		bookmarks[2][3] = BookmarkManager.getInstance().createBook(4003,	"Head First Design Patterns",	2004,	"O'Reilly Media",	new String[] {"Eric Freeman","Bert Bates","Kathy Sierra","Elisabeth Robson"},	BookGenre.TECHNICAL,	4.5	);
		bookmarks[2][4] = BookmarkManager.getInstance().createBook(4004,	"Effective Java Programming Language Guide",	2007,	"Prentice Hall",	new String[] {"Joshua Bloch"},	BookGenre.TECHNICAL,	4.9	);
	}

	public static void add(UserBookmark userBookmark) {
		// TODO Auto-generated method stub
		userBookmarks[bookmarkIndex] = userBookmark;
		bookmarkIndex++; //so its ready for the next bookmark
	}

}
