package launcher;

import thrillio.UI.View;
import thrillio.dataStore.DataStore;
import thrillio.entities.Bookmark;
import thrillio.entities.User;
import thrillio.managers.BookmarkManager;
import thrillio.managers.UserManager;

public class launchProgram {
	//DS to hold data returned from Manager layer
	private static User[] users;
	private static Bookmark[][] bookmarks;
	
	
	private static void loadData() {
		System.out.println("1. Loading data..");
		DataStore.loadData();
		
		//Populating DS from manager layer
		users = UserManager.getInstance().getUsers();
		bookmarks = BookmarkManager.getInstance().getBookmarks();
		
		System.out.println("Printing data..");
		//Remember to override toString in each entity class
		printUserData();
		printBookmarkData();
	}

	private static void printBookmarkData() {
		// TODO Auto-generated method stub
		for(Bookmark[] bookmarkList : bookmarks) {
			for(Bookmark bookmark : bookmarkList) {
				System.out.println(bookmark);
			}
		}
	}

	private static void printUserData() {
		// TODO Auto-generated method stub
		for(User user : users) {
			System.out.println(user);
		}
	}
	
	private static void startBrowsing() {
		// TODO Auto-generated method stub
		//This will be done for all users
		
		for(User users: users) {
			View.browse(users, bookmarks);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loadData(); // Comes from the Model layer
		startBrowsing(); //Comes from the View layer
	}

	

}
