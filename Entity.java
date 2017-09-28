/**
 * The Class Entity.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Entity implements Node {

	/** The user name. */
	private String userName;

	/** The email id. */
	private String emailId;

	/** The entity type. */
	private String entityType;

	/** The name of entity. */
	private String nameOfEntity;

	/** The curr person. */
	private static Entity currPerson = null;

	/** The entity data. */
	private static HashMap<String, Entity> entityData = new HashMap<String, Entity>();

	/** The list of persons. */
	private static List<Entity> listOfPersons = new ArrayList<Entity>();

	/**
	 * Sets the current person.
	 *
	 * @param currentPerson
	 *            the new current person
	 */
	public static void setCurrentPerson(Entity currentPerson) {
		currPerson = currentPerson;
		if (currPerson != null) {
			System.out.println("***current logged in user "
					+ currPerson.getNameOfEntity());
		} else {
			System.out.println("----LOGGED OUT----");
		}
	}

	/**
	 * Gets the current person.
	 *
	 * @return the current person
	 */
	public static Entity getCurrentPerson() {
		return currPerson;
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
	 * @param userName
	 *            the new user name
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
	 * @param emailId
	 *            the new email id
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
	 * @param entityType
	 *            the new entity type
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
	 * @param nameOfEntity
	 *            the new name of entity
	 */
	public void setNameOfEntity(String nameOfEntity) {
		this.nameOfEntity = nameOfEntity;
	}

	/**
	 * Gets the entity data.
	 *
	 * @return the entity data
	 */
	public static HashMap<String, Entity> getEntityData() {
		return entityData;
	}

	/**
	 * Sets the entity data.
	 *
	 * @param entityData
	 *            the entity data
	 */
	public static void setEntityData(HashMap<String, Entity> entityData) {
		Entity.entityData = entityData;
	}

	/**
	 * Creates the person.
	 *
	 * @param personDetails
	 *            the person details
	 * @return the entity
	 */
	public static Entity createPerson(String[] personDetails) {
		Entity person = new Entity();
		person.setEntityType(personDetails[0]);
		person.setUserName(personDetails[1]);
		person.setEmailId(personDetails[2]);
		person.setNameOfEntity(personDetails[3]);
		entityData.put(person.getUserName(), person);
		return person;
	}

	/**
	 * Gets the list of persons.
	 *
	 * @return the list of persons
	 */
	public static List<Entity> getListOfPersons() {
		return listOfPersons;
	}

	/**
	 * Sets the list of persons.
	 *
	 * @param listOfPersons
	 *            the new list of persons
	 */
	public void setListOfPersons(List<Entity> listOfPersons) {
		this.listOfPersons = listOfPersons;
	}

	/**
	 * Display.
	 */
	public void display() {
		for (Entity e : Entity.getListOfPersons()) {
			System.out.println(e.getNameOfEntity() + "  " + e.getUserName());
			System.out.println("--------------------------------------");
		}

	}

}
