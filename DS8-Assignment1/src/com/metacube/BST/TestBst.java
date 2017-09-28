/**
* @author Shivam Lalwani
 * @version 1.0
 * @Date 30-August-2017
 * @project Binary Search
 *
 */
package com.metacube.BST;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * The Class TestBst.
 */
public class TestBst{
	
	/** The bst obj. */
	static CreateBST bstObj;
	
	/** The expected. */
	private int expected;
	
	/** The to check. */
	private boolean toCheck;
	
	/** The in order. */
	private String inOrder = "";
	
	/**
	 * Setup.
	 */
	@BeforeClass
	public static void setup(){
		bstObj = new CreateBST();
		bstObj.insert(114);
		bstObj.insert(116);
		bstObj.insert(112);
		bstObj.insert(110);
		bstObj.insert(119);
		bstObj.insert(119);
	}

	/**
	 * Test add positive.
	 */
	//Positive Test-Case
	@Test
	public void testAddPositive() {
		toCheck = bstObj.insert(113);
		assertEquals(true, toCheck);
	}

	/**
	 * Test add negative.
	 */
	//Negative Test-Case
	@Test
	public void testAddNegative() {
		toCheck = bstObj.insert(113);
		assertFalse(false == toCheck);
	}

	/**
	 * Test search positive.
	 */
	//Positive Test-Case
	@Test
	public void testSearchPositive() {
		expected = bstObj.searchElement(114);
		assertEquals(expected, 0);
	}

	/**
	 * Test search negative.
	 */
	//Negative Test-Case
	@Test
	public void testSearchNegative() {
		expected = bstObj.searchElement(119);
		assertFalse(expected == 1);
	}

	/**
	 * Test search not found positive.
	 */
	//Positive Test-Case
	@Test
	public void testSearchNotFoundPositive() {
		expected = bstObj.searchElement(10);
		assertEquals(expected, -1);
	}

	/**
	 * Test search not found negative.
	 */
	//Negative Test-Case
	@Test
	public void testSearchNotFoundNegative() {
		expected = bstObj.searchElement(12);
		assertFalse(expected == 1);
	}

	/**
	 * Test search left occurence positive.
	 */
	//Positive Test-Case
	@Test
	public void testSearchLeftOccurencePositive() {
		expected = bstObj.searchElement(119);
		assertEquals(expected, 4);
	}

	/**
	 * Test search left occurence negative.
	 */
	//Negative Test-Case
	@Test
	public void testSearchLeftOccurenceNegative() {
		expected = bstObj.searchElement(12);
		assertFalse(expected == 1);
	}

	/**
	 * Test inorder positive.
	 */
	//Positive Test-Case
	@Test
	public void testInorderPositive() {
		inOrder = bstObj.inorder();
		assertEquals(inOrder, "110112114116119119");
	}

	/**
	 * Test inorder negative.
	 */
	//Negative Test-Case
	@Test
	public void testInorderNegative() {
		assertFalse(inOrder.equals("1404245440425"));
	}
}