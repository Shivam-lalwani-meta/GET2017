
/** 
 * @author Shivam
 * @version 1.0
 * @Date 22-August-2017
 * @project Linked List menu-driven generic program.
 */

package com.metacube.usermanagement;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.json.simple.JSONObject;

/**
 * The Class UserDao.
 */
public class UserDao {
	
	/** The users details. */
	private List<JSONObject> usersDetails;
	
	/** The users list. */
	private Map<String, User> usersList;
	
	/** The user dao. */
	private static UserDao userDao;

	/**
	 * Instantiates a new user dao.
	 */
	private UserDao() {
		usersList = new HashMap<String, User>();
		usersDetails = JsonFilehandling.read();
		for (JSONObject obj : usersDetails) {
			usersList.put(obj.get("id").toString(), new User(obj.get("id").toString(),obj.get("name").toString(), obj.get("profession").toString()));
		}
	}

	/**
	 * Gets the single instance of UserDao.
	 *
	 * @return single instance of UserDao
	 */
	public static UserDao getInstance() {
		if (userDao == null) {
			synchronized (UserDao.class) {
				if (userDao == null) {
					userDao = new UserDao();
				}
			}
		}
		return userDao;
	}

	/**
	 * Gets the all users.
	 *
	 * @return the all users
	 */
	public String getAllUsers() {
		String s = "";
		Set<String> ids = usersList.keySet();
		for (String userId : ids) {
			s += "<b>UserId :</b> " + userId + "&nbsp<b> UserName : </b>" + usersList.get(userId).getName()
					+ "<b>&nbsp Profession :</b> " + usersList.get(userId).getProfession() + "<br><br>";
		}
		return s;

	}

	/**
	 * Gets the user.
	 *
	 * @param id the id
	 * @return the user
	 */
	public User getUser(String id) {
		if(usersList.containsKey(id))
		return usersList.get(id);
		else
			return null;
	}

	/**
	 * Adds the user.
	 *
	 * @param pUser the user
	 * @return true, if successful
	 */
	public boolean addUser(User pUser) {
		boolean action = false;
			if (!usersList.containsKey(pUser.getId())) {
				action = true;
				usersList.put(pUser.getId(),pUser);
			}
			else{
			
			//saveUserList(userList);
		}
		return action;
	}

	/**
	 * Delete user.
	 *
	 * @param id the id
	 * @return the int
	 */
	public int deleteUser(String id) {
		if(usersList.containsKey(id)) {
		usersList.remove(id);
		return 1;
		}
		return 0;
	}

	/**
	 * Save user list.
	 *
	 * @param userList the user list
	 */
	private void saveUserList(List<User> userList) {
		try {
			File file = new File("Users.txt");
			FileOutputStream fos;
			fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(userList);
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}