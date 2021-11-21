import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import thrillio.constants.MovieGenre;
import thrillio.entities.Movie;
import thrillio.managers.BookmarkManager;

class MovieTest {

	@Test
	public void testIsKidFriendlyEligable() {
		//testing for horror or thriller genre
		
		//TEST1
		Movie movie = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane","",	1941, new String[] {"Orson Welles","Joseph Cotten"}, new String[] {"Orson Welles"}	,MovieGenre.HORROR,8.5);
		
		boolean isKidFriendlyEligible =  movie.isKidFriendlyEligable();
		
		Assertions.assertFalse(isKidFriendlyEligible, "Horror genre - is kidFirendlyEligible() must return false");
		
		//TEST 2
		
		movie = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane","",	1941, new String[] {"Orson Welles","Joseph Cotten"}, new String[] {"Orson Welles"}	,MovieGenre.THRILLERS,8.5);
		
		isKidFriendlyEligible =  movie.isKidFriendlyEligable();
		
		Assertions.assertFalse(isKidFriendlyEligible, "Thriller genre - is kidFirendlyEligible() must return false");

	}
	
	//private String genre;
	// private title

}
