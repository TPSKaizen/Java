package view;

import trillio.entities.Bookmark;
import trillio.entities.User;
import DataStore.DataStore;
import controllers.BookmarkController;


public class View {
	public static void bookmark(User user, Bookmark[][] bookmarks) {
		System.out.println("\n " + user.getEmail() + " is bookmarking");
		for(int i = 0; i < DataStore.USER_BOOKMARK_LIMIT; i++) {
			int typeOffSet = (int) (Math.random() * DataStore.BOOKMARK_TYPES_COUNT);
			int bookmarkOffset = (int) (Math.random() * DataStore.BOOKMARK_TYPES_COUNT);
			
			Bookmark bookmark = bookmarks[typeOffSet][bookmarkOffset];   
			
			BookmarkController.getInstance().saveUserBookmark(user,bookmark);
		}
		
		
	}
}
