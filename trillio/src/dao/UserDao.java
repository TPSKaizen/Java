package dao;

import DataStore.DataStore;
import trillio.entities.User;

public class UserDao {
	public User[] getUsers() {
		return DataStore.getUsers(); //substituting for SQL query
	}
}
