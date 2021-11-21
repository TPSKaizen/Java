package thrillio.Controllers;

import thrillio.entities.Bookmark;
import thrillio.entities.User;
import thrillio.managers.BookmarkManager;

public class BookmarkController {
	
	//Implement Singleton Pattern
	
	private static BookmarkController instance = new BookmarkController();
	private BookmarkController() {}
	
	public static BookmarkController getInstance() {
		return instance;
	}

	public void saveUserBookmark(User user, Bookmark bookmark) {
		// TODO Auto-generated method stub
		//We need to invoke the Manager from here
		
		BookmarkManager.getInstance().saveUserBookmark(user,bookmark);
	}

	public void setKidFriendlyStatus(User user, Bookmark bookmark, String kidFriendlyStatus) {
		// TODO Auto-generated method stub
		BookmarkManager.getInstance().setKidFriendlyStatus(user, bookmark, kidFriendlyStatus);
	}
	
	public User getUserWhoBookmarked(Bookmark bookmark) {
		return BookmarkManager.getInstance().getUserWhoBookmarked(bookmark);
	}

	public void share(User user, Bookmark bookmark) {
		// TODO Auto-generated method stub
		BookmarkManager.getInstance().share(user, bookmark);
	}
	
	
}	
