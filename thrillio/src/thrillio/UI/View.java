package thrillio.UI;

import thrillio.entities.User;
import thrillio.entities.Bookmark;
import partner.Shareable;
import thrillio.Controllers.BookmarkController;
import thrillio.constants.KidFriendlyStatus;
import thrillio.constants.UserType;
import thrillio.dataStore.DataStore;

public class View {

	public static void browse(User user, Bookmark[][] bookmarks) {
		// User presented with all bookmarks
		// User may bookmark an item
		// Editor/Chief editor can mark as kid friendly
		// share the bookmark

		/* METHOD DESCRIPTION */
		// 1. Allow single user to browse through ALL bookmarks
		// 2. Allow user to bookmark up to 5 bookmarks
		// 3. Determine if user will bookmark via a boolean determined by random
		// generation( less than x : true, greater than or equal to x = false)
		// 4. Allow user, if chief editor , to mark as kid-friendly
		// 5. Determine if user will mark as kid-friendly via randomly generated value
		// between some range x-y.
		System.out.println("\n" + user.getEmail() + " is browsing..");

		int bookmarkCount = 0;

		for (Bookmark[] bookmarkList : bookmarks) {
			for (Bookmark bookmark : bookmarkList) { // Go through every bookmark given in bookmark array
				if (bookmarkCount < DataStore.getUserBookmarkLimit()) { // we are limiting to 5 as a pretend Trial
																		// Version.
					boolean isBookmarked = fiftyFiftyDecision(bookmark);
					if (isBookmarked) {
						bookmarkCount++;

						BookmarkController.getInstance().saveUserBookmark(user, bookmark);

						System.out.println("New item bookmarked: " + bookmark);
					}
				}

				if (user.getUserType().equals(UserType.EDITOR) || user.getUserType().equals(UserType.CHIEF_EDITOR)) {

					// marking as kid friendly
					if (bookmark.isKidFriendlyEligable()
							&& bookmark.getKidFriendlyStatus().equals(KidFriendlyStatus.UNKNOWN)) {
						String kidFriendlyStatus = getKidFriendlyStatusDecision(bookmark);
						if (!kidFriendlyStatus.equals(KidFriendlyStatus.UNKNOWN)) { // if its not equal to unknown,
																					// update the status
							BookmarkController.getInstance().setKidFriendlyStatus(user, bookmark, kidFriendlyStatus);
							System.out.println("Kid friendly Status :" + kidFriendlyStatus + " ," + bookmark);

							//System.out.println("User who bookmarked is : "
							//		+ BookmarkController.getInstance().getUserWhoBookmarked(bookmark).getEmail());
						}
					}

					// Shareable implementation
					// Constraints : kidFriendlyStatus = approved. Only Book and WebLink can share
					// Check for instance of Shareable
					// It is up to the user to determine if they want to share, so represent this
					// via randomization
					if (bookmark.getKidFriendlyStatus().equals(KidFriendlyStatus.APPROVED)
							&& bookmark instanceof Shareable) {
						boolean willShare = fiftyFiftyDecision(bookmark);

						if (willShare) {
							BookmarkController.getInstance().share(user, bookmark);
						}
					}

				}
			}

		}

	}

			//TODO: Below methods simulate user import, After IO, we take input via console
	private static String getKidFriendlyStatusDecision(Bookmark bookmark) {
		// TODO Auto-generated method stub
		double rand = Math.random();
		return rand < 0.4 ? KidFriendlyStatus.APPROVED
				: (rand >= 0.4 && rand < 0.8) ? KidFriendlyStatus.REJECTED : KidFriendlyStatus.UNKNOWN;
	}

	// Function that returns true or false on a 50/50 basis
	private static boolean fiftyFiftyDecision(Bookmark bookmark) {
		// TODO Auto-generated method stub
		return Math.random() < 0.5 ? true : false;
	}
}
