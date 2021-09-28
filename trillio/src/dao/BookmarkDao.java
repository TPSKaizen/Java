package dao;

import DataStore.DataStore;
import trillio.entities.Bookmark;
import trillio.entities.UserBookmark;

public class BookmarkDao {
	public Bookmark[][] getBookmarks(){
		return DataStore.getBookmarks(); 
	}

	public void saveUserBookmark(UserBookmark userBookmark) {
		// TODO Auto-generated method stub
		DataStore.add(userBookmark); //like adding to the DB
	}
}
