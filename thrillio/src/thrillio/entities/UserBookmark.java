package thrillio.entities;

public class UserBookmark {
//maintains relationship between User and Bookmark
//if a user bookmarks a particular bookmark, that info is stored here
	
	private User user;
	private Bookmark bookmark;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Bookmark getBookmark() {
		return bookmark;
	}

	public void setBookmark(Bookmark bookmark) {
		this.bookmark = bookmark;
	}

	@Override
	public String toString() {
		return "UserBookmark [user=" + user + ", bookmark=" + bookmark + "]";
	}
	
}
