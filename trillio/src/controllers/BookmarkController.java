package controllers;

import managers.BookmarkManager;
import trillio.entities.Bookmark;
import trillio.entities.User;

public class BookmarkController {
		//singleton design
	
	private static BookmarkController instance = new BookmarkController();
	
	private BookmarkController() {};
	
	public static BookmarkController getInstance() {
		return instance;
	}

	public void saveUserBookmark(User user, Bookmark bookmark) {
		// TODO Auto-generated method stub
		BookmarkManager.getInstance().saveUserBookmark(user, bookmark);
	}
}
