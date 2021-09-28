package launcherMain;

import DataStore.DataStore;
import managers.BookmarkManager;
import managers.UserManager;
import trillio.entities.Bookmark;
import trillio.entities.User;
import view.View;

public class Launch {
	private static User[] users;
	private static Bookmark[][] bookmarks;
	
	private static void printUserData() {
		for(User user : users) 
			System.out.println(user);
	}
	
	private static void printBookmarkData() {
		for(Bookmark[] bookmarkList : bookmarks) {
			for (Bookmark bookmark : bookmarkList) {
				System.out.println(bookmark);
			}
		}
	}

	private static void loadData() {
		// TODO Auto-generated method stub
		System.out.println("Loading data...");
		DataStore.loadData();
		
		users = UserManager.getInstance().getUsers();
		bookmarks = BookmarkManager.getInstance().getBookmarks();
		
		System.out.println("Printing data..");
		printUserData();
		printBookmarkData();
		
	}
	
	private static void startBookmarking() {
		System.out.println("2. Bookmarking");
		for(User user: users) {
			View.bookmark(user, bookmarks);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		loadData();
		startBookmarking();
	}

}
