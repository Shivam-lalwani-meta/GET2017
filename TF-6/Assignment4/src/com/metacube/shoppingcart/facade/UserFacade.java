/**
 * @Date 22-October-2017
 * @author Shivam
 * @version 1.0
 * @Project Product implementation using Spring MVC and hibernate
 */
package com.metacube.shoppingcart.facade;

import com.metacube.shoppingcart.dto.UserDto;

/**
 * The Interface UserFacade.
 */
public interface UserFacade {
	
	/**
	 * Gets the all users.
	 *
	 * @return the all users
	 */
	Iterable<UserDto> getAllUsers();
	
	/**
	 * Gets the user by id.
	 *
	 * @param username the username
	 * @return the user by id
	 */
	UserDto getUserById(String username);
	
	/**
	 * Authenticate.
	 *
	 * @param username the username
	 * @param password the password
	 * @return true, if successful
	 */
	boolean authenticate(String username, String password);
}
