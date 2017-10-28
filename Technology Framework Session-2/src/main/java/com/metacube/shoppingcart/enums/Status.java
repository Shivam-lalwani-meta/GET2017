/**
 * The Class ProductController.
 *
 * @author Shivam
 * @version 1
 * @date 30-Sep-2017
 * The Enum Status.
 *
 * This is used to give status of different different operations
 * 
 */
package com.metacube.shoppingcart.enums;

public enum Status {

	/**
	 * The NOT found. If entity not found
	 */
	NOT_Found,
	/**
	 * The Found. If entity found
	 */
	Found,
	/**
	 * The Duplicate. In case if Entity is Duplicate
	 */
	Duplicate,
	/**
	 * The Added. In case if entity is added
	 */
	Added,
	/**
	 * The Error_Occured ,In case of Error
	 */
	Error_Occured,
	/**
	 * The Success In case of Successful operation
	 */
	Success
}
