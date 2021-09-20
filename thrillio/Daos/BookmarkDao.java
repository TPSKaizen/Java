package thrillio.Daos;

import thrillio.dataStore.DataStore;
import thrillio.entities.Bookmark;
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
}
