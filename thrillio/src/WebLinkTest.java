import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import thrillio.entities.WebLink;
import thrillio.managers.BookmarkManager;

class WebLinkTest {
	//Requirements : False if adult website
	//  			Web link : url, host, 
	//				Bookmark class : title
	//Check for keywords in these fields "porn", "adult"
	// porn in {url,title} - false
	// adult in {host} - false
	// adult in {url, title} - true
	
	//Write test first, then logic
	
	@Test
	public void testIsKindFriendlyEligiable() {
		//test 1 : Porn in url  - false 
		
		//Create instance of Weblink
		WebLink weblink = BookmarkManager.getInstance().createWebLink(2000,	"Taming Tiger, Part 2", "http://www.javaworld.com/article/2072759/core-java/taming-porn--part-2.html", "http://www.javaworld.com");
		
		
		boolean isKidFriendlyEligible = weblink.isKidFriendlyEligable();
		
		//if the method returns true, the below message will be thrown
		Assertions.assertFalse(isKidFriendlyEligible, "For porn in url - is kidFirendlyEligible() must return false");

		//test 2 porn in title - false 
		
		weblink = BookmarkManager.getInstance().createWebLink(2000,	"Taming porn, Part 2", "http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html", "http://www.javaworld.com");
		
		
		isKidFriendlyEligible = weblink.isKidFriendlyEligable();
		
		//if the method returns true, the below message will be thrown
		Assertions.assertFalse(isKidFriendlyEligible, "For porn in title - is kidFirendlyEligible() must return false");

		
		//test 3 adult in host -- false
		weblink = BookmarkManager.getInstance().createWebLink(2000,	"Taming Tiger, Part 2", "http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html", "http://www.adult.com");
		
		
		isKidFriendlyEligible = weblink.isKidFriendlyEligable();
		
		//if the method returns true, the below message will be thrown
		Assertions.assertFalse(isKidFriendlyEligible, "For adult in host - is kidFirendlyEligible() must return false");
		
		//test 4 adult in url but not in host - true
		weblink = BookmarkManager.getInstance().createWebLink(2000,	"Taming Tiger, Part 2", "http://www.javaworld.com/article/2072759/core-java/taming-adult--part-2.html", "http://www.javaworld.com");
		
		
		isKidFriendlyEligible = weblink.isKidFriendlyEligable();
		
		//if the method returns false, the below message will be thrown
		Assertions.assertTrue(isKidFriendlyEligible, "For adult in url but not in host - is kidFirendlyEligible() must return true");
		
		//test 5 adult in title only -- true
		
		weblink = BookmarkManager.getInstance().createWebLink(2000,	"Taming adult, Part 2", "http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html", "http://www.javaworld.com");
		
		
		isKidFriendlyEligible = weblink.isKidFriendlyEligable();
		
		//if the method returns false, the below message will be thrown
		Assertions.assertTrue(isKidFriendlyEligible, "For adult in title only - is kidFirendlyEligible() must return true");
	}
	
}
