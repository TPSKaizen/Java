package thrillio.Daos;

import thrillio.dataStore.DataStore;
import thrillio.entities.Bookmark;
import thrillio.entities.User;
import thrillio.entities.UserBookmark;

//SQL Queries would be in here
public class BookmarkDao {
	//Implement getBookmarks which originates in Datastore
	
	public Bookmark[][] getBookmarks(){
		return DataStore.getBookmarks();
	}

	public void saveUserBookmark(UserBookmark userbookmark) {
		// TODO Auto-generated method stub
		DataStore.add(userbookmark); //Replicating adding to the DB
	}

	/*
	public void setKidFriendlyStatus(User user, Bookmark bookmark, String kidFriendlyStatus) {
		// TODO Auto-generated method stub
		DataStore.updateBookmarkKidFriendlyStatus(user, bookmark,kidFriendlyStatus);
	}

	public User getUserWhoBookMarked(Bookmark bookmark) {
		// TODO Auto-generated method stub
		return DataStore.getUserWhoBookmarked(bookmark);
	}
*/
}
