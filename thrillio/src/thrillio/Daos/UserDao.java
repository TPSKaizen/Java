package thrillio.Daos;

import thrillio.dataStore.DataStore;
import thrillio.entities.User;

public class UserDao {
	
	//Implement getUsers which originates in Datastore
	public User[] getUsers() {
		return DataStore.getUsers();
	}
}
