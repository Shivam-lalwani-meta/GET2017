
/** 
 * @author Shivam
 * @version 1.0
 * @Date 22-August-2017
 * @project Data Structure  Assignment 1
 */

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.Dao.List;

//The JUnit test class to test singly linked list

public class ListTest<E> {
	static List<Integer> linkedList;

	// Loads before the class loads.
	@BeforeClass
	public static void  setUpClass(){
		linkedList = new List<Integer>();
	}

	// Positive Test Case.
	@Test
	public void addTestCase(){
		linkedList.addNode(5);
		String expected = linkedList.searchByValue(5);
		assertEquals("5 found at 0", expected);
	}

	// Positive Test Case.
	@Test
	public void addByIndexTestCase(){
		linkedList.addNode(5);
		linkedList.addNode(6);
		boolean expected = linkedList.addAtIndex(2, 7);
		assertEquals(true, expected);
	}

	// Positive Test Case.
	@Test
	public void removeElementByPositionTestCase(){
		linkedList.addNode(5);
		linkedList.addNode(6);
		linkedList.addNode(8);
		String expected =  linkedList.deleteNodeByIndex(1);
		assertEquals("Deleted Succesfully", expected );
	}

	// Positive Test Case.
	@Test
	public void removeElementTestCase(){
		linkedList.addNode(5);
		linkedList.addNode(6);
		linkedList.addNode(8);
		assertEquals("6Deleted Succesfully", linkedList.deleteNodeByValue(6));
	}
	
	// Negative Test Case.
	@Test
	public void addTestCaseNegtive(){
		linkedList.addNode(5);
		String expected = linkedList.searchByValue(6);
		assertFalse("6 not found".equals(expected));
	}

	// Negative Test Case.
	@Test
	public void addByIndexTestCaseNegtive(){
		linkedList.addNode(5);
		linkedList.addNode(6);
		boolean expected = linkedList.addAtIndex(2, 7);
		assertFalse(false == expected);
	}

	// Negative Test Case.
	@Test
	public void removeElementByPositionTestCaseNegtive(){
		linkedList.addNode(5);
		linkedList.addNode(6);
		linkedList.addNode(8);
		linkedList.deleteNodeByValue(6);
		E expected = (E) linkedList.searchByValue(6);
		assertFalse("1" == expected);
	}

	// Negative Test Case.
	@Test
	public void removeElementTestCaseNegtive(){
		linkedList.addNode(5);
		linkedList.addNode(6);
		linkedList.addNode(8);
		assertFalse("".equals(linkedList.deleteNodeByValue(8)));
	}
}