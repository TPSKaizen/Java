package thrillio.UI;

import thrillio.entities.User;
import thrillio.entities.Bookmark;
import thrillio.Controllers.BookmarkController;
import thrillio.dataStore.DataStore;


public class View {
	public static void bookmark(User user, Bookmark[][] bookmarks) {
		//Assumption : The user is presented will all the bookmarks in the system
		//           : The user randomly selects 5 of them
		
		System.out.println("\n" + user.getEmail() + " is bookmarking..");
		
		//Each user bookmarks 5 bookmarks:
		for(int i = 0; i < DataStore.getUserBookmarkLimit(); i++) {
			//getting one of the bookmarkTypes
			int typeOffset = (int) (Math.random() * DataStore.getBookmarkTypesCount()); 
			//getting one of the bookmarks in a particular type
			int bookmarkOffset = (int) (Math.random() * DataStore.getBookmarkCountPerType());
			
			Bookmark bookmark = bookmarks[typeOffset][bookmarkOffset];
			//At this point user has randomly chosen a bookmark and saved it
			
			/*
			 *  In the real world, the next steps would be: 
			 *  1. Invoke Controller
			 *  2. Invoke Service/Manager Layer
			 *  3. Invoke Dao
			 *  4. Save to DataStore
			 */	
			BookmarkController.getInstance().saveUserBookmark(user, bookmark);
			
			System.out.println(bookmark);
		}
	}
}
