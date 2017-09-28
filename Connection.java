import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * The Class Connection.
 */
public class Connection {

	/** The connected friends. */
	static List<String> connectedFriends = new ArrayList<String>();

	/**
	 * Make connection person.
	 *
	 * @param currentUser
	 *            the current user
	 * @param userName
	 *            the user name
	 */
	public static void makeConnectionPerson(Entity currentUser, String userName) {

		if (currentUser.getNameOfEntity() == userName) { // check if source and
															// destination are
															// same
			System.out.println("----Connection to self not possible----");
			return;
		} else {
			String connected = currentUser.getNameOfEntity();
			connected += userName;
			connectedFriends.add(connected);
		}
	}

	/**
	 * Make connection organization.
	 *
	 * @param currentUser
	 *            the current user
	 * @param userName
	 *            the user name
	 */
	public static void makeConnectionOrganization(Organization currentUser,
			String userName) {

		if (currentUser.getNameOfEntity() == userName) { // check if source and
															// destination are
															// same
			System.out.println("----Connection to self not possible----");
			return;
		} else {
			String connected = currentUser.getNameOfEntity();
			connected += userName;
			connectedFriends.add(connected);
		}
	}

	/**
	 * Show.
	 */
	public static void show() {
		Iterator<String> iterator = connectedFriends.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
