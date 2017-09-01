/**
 * @author Shivam Lalwani
 * @version 1.0
 * @Date 30-August-2017
 * @project Test Cases of Binary Search using BST
 *
 */
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestBst{
	static CreateBST bstObj;
	private int expected;
	private boolean toCheck;
	
	@BeforeClass
	public static void setup(){
		bstObj = new CreateBST();
		bstObj.insert(4);
		bstObj.insert(6);
		bstObj.insert(2);
		bstObj.insert(0);
		bstObj.insert(9);
		bstObj.insert(9);
	}

	//Positive Test-Case
	@Test
	public void testAddPositive() {
		toCheck = bstObj.insert(3);
		assertEquals(true, toCheck);
	}

	//Negative Test-Case
	@Test
	public void testAddNegative() {
		toCheck = bstObj.insert(3);
		assertFalse(false == toCheck);
	}

	//Positive Test-Case
	@Test
	public void testSearchPositive() {
		expected = bstObj.searchElement(4);
		assertEquals(expected, 0);
	}

	//Negative Test-Case
	@Test
	public void testSearchNegative() {
		expected = bstObj.searchElement(9);
		assertFalse(expected == 1);
	}

	//Positive Test-Case
	@Test
	public void testSearchNotFoundPositive() {
		expected = bstObj.searchElement(10);
		assertEquals(expected, -1);
	}

	//Negative Test-Case
	@Test
	public void testSearchNotFoundNegative() {
		expected = bstObj.searchElement(12);
		assertFalse(expected == 1);
	}

	//Positive Test-Case
	@Test
	public void testSearchLeftOccurencePositive() {
		expected = bstObj.searchElement(9);
		assertEquals(expected, 4);
	}

	//Negative Test-Case
	@Test
	public void testSearchLeftOccurenceNegative() {
		expected = bstObj.searchElement(12);
		assertFalse(expected == 1);
	}
}