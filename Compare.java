
/**
 * The Class Compare.
 */
public class Compare {

	/**
	 * Checks if is exist.
	 *
	 * @param userName
	 *            the user name
	 * @return true, if is exist
	 */
	public static boolean isExist(String userName) {

		for (Entity e : Entity.getListOfPersons()) {
			if (userName.equals(e.getUserName())) {
				if (Entity.getCurrentPerson() == null) {
					System.out.println("***Welcome" + userName);
					Entity.setCurrentPerson(Entity.getEntityData()
							.get(userName));
					return true;
				} else {
					System.out.println("----User is already logged in----");
					return true;
				}
			}
		}
		for (Organization e : Organization.getListOfOrganization()) {
			if (userName.equals(e.getUserName())) {
				if (Organization.getCurrentOrganization() == null) {
					System.out.println("***Welcome" + userName);
					Organization.setCurrentOrganization(Organization
							.getOrganizationData().get(userName));
					return true;
				} else {
					System.out.println("----User is already logged in----");
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Checks if is exist name.
	 *
	 * @param entityName
	 *            the entity name
	 * @return true, if is exist name
	 */
	public static boolean isExistName(String entityName) {

		for (Entity e : Entity.getListOfPersons()) {
			if (entityName.equals(e.getNameOfEntity())) {
				Connection.makeConnectionPerson(Entity.getCurrentPerson(),
						e.getNameOfEntity());
			}
		}
		for (Organization e : Organization.getListOfOrganization()) {
			if (entityName.equals(e.getNameOfEntity())) {
				Connection.makeConnectionOrganization(
						Organization.getCurrentOrganization(),
						e.getNameOfEntity());
			}
		}
		return false;
	}
}
