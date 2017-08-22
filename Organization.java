import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 * The Class Organization implements Node as it is a part of Node. This class is having the attributes of an Organization
 * and its getters setters.
 */

public class Organization implements Node{

	/** The user name  of Organization. */
	private String userName;	

	/** The email id of Organization. */
	private String emailId;	

	/** The entity type of Organization. */
	private String entityType;	//type 

	/** The name of entity of Organization. */
	private String nameOfEntity;	 

	/** The current organization. */
	private static Organization currOrganization = null;

	/** The organization data. */
	private static HashMap<String, Organization> organizationData = new HashMap<String, Organization>();

	/** The list of organization. */
	static List<Organization> listOfOrganization = new ArrayList<Organization>();

	/**
	 * Sets the current organization to current logged in organization.
	 *
	 * @param currentOrganization the new current organization
	 */
	public static void setCurrentOrganization(Organization currentOrganization) {
		currOrganization = currentOrganization;
		if(currOrganization != null) {
			System.out.println("***current logged in Organization "+currOrganization.getNameOfEntity());
		} else {
			System.out.println("----LOGGED OUT----");
		}
	}

	/**
	 * Gets the current organization that is logged in.
	 *
	 * @return the current organization
	 */
	public static Organization getCurrentOrganization(){
		return currOrganization;
	}

	/**
	 * Gets the user name.
	 *
	 * @return the user name
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * Sets the user name.
	 *
	 * @param userName the new user name
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * Gets the email id.
	 *
	 * @return the email id
	 */
	public String getEmailId() {
		return emailId;
	}

	/**
	 * Sets the email id.
	 *
	 * @param emailId the new email id
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	/**
	 * Gets the entity type.
	 *
	 * @return the entity type
	 */
	public String getEntityType() {
		return entityType;
	}

	/**
	 * Sets the entity type.
	 *
	 * @param entityType the new entity type
	 */
	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	/**
	 * Gets the name of entity.
	 *
	 * @return the name of entity
	 */
	public String getNameOfEntity() {
		return nameOfEntity;
	}

	/**
	 * Sets the name of entity.
	 *
	 * @param nameOfEntity the new name of entity
	 */
	public void setNameOfEntity(String nameOfEntity) {
		this.nameOfEntity = nameOfEntity;
	}

	/**
	 * Gets the list of organization.
	 *
	 * @return the list of organization
	 */
	public static List<Organization> getListOfOrganization() {
		return listOfOrganization;
	}

	/**
	 * Sets the list of organization.
	 *
	 * @param listOfOrganization the new list of organization
	 */
	public void setListOfOrganization(List<Organization> listOfOrganization) {
		this.listOfOrganization = listOfOrganization;
	}

	/**
	 * Creates the organization object for each Organization.
	 *
	 * @param tempLine the temp line
	 * @return the organization
	 */
	public static Organization createOrganization(String[] tempLine) {
		Organization object = new Organization();
		object.setEntityType(tempLine[0]);
		object.setUserName(tempLine[1]);
		object.setEmailId(tempLine[2]);
		object.setNameOfEntity(tempLine[3]);
		organizationData.put(object.getUserName(), object);
		return object;

	}

	/**
	 * Gets the organization data.
	 *
	 * @return the organization data
	 */
	public static HashMap<String, Organization> getOrganizationData() {
		return organizationData;
	}

	/**
	 * Sets the organization data.
	 *
	 * @param organizationData the organization data
	 */
	public static void setOrganizationData(
			HashMap<String, Organization> organizationData) {
		Organization.organizationData = organizationData;
	}

}
