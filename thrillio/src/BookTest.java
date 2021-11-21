import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import thrillio.constants.BookGenre;
import thrillio.entities.Book;
import thrillio.managers.BookmarkManager;

class BookTest {

	@Test
	void testIsKidFriendlyEligable() {
		
		//Test 1 - If genre = philosophy, return false
		Book book = BookmarkManager.getInstance().createBook(4000,	"Walden",	1854,	"Wilder Publications",	new String[] {"Henry David Thoreau"},	BookGenre.SELF_HELP,	4.3	);
		
		boolean isKidFriendlyEligable = book.isKidFriendlyEligable();
		
		Assertions.assertFalse(isKidFriendlyEligable, "For Book genre = Philisophy, return false");
		
		
		//Test 2 - If genre = self-help, return false
		BookmarkManager.getInstance().createBook(4000,	"Walden",	1854,	"Wilder Publications",	new String[] {"Henry David Thoreau"},	BookGenre.PHILOSOPHY,	4.3	);
		
		isKidFriendlyEligable = book.isKidFriendlyEligable();
		
		Assertions.assertFalse(isKidFriendlyEligable, "For Book genre = Self-help, return false");

	}
	
}
