
/** 
 * @author Shivam
 * @version 1.0
 * @Date 22-August-2017
 * @project Data Structure  Assignment 1
 */

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

//The JUnit test class
public class DoublyLinkedListTest<E> {
	static DoublyLinkedList<Integer> linkedList;

	//Loads before the class loads.
	@BeforeClass
	public static void  setUpClass(){
		linkedList = new DoublyLinkedList<Integer>();
	}

	//Positive Test Case
	@Test
	public void addTestCase(){
		linkedList.addNode(5);
		int expected = linkedList.getElementFromPosition(0);
		assertEquals(5, expected);
	}

	//Positive Test Case
	@Test
	public void addByIndexTestCase(){
		linkedList.addNode(5);
		linkedList.addNode(6);
		boolean expected = linkedList.addNodeAtLocation(2, 7);
		assertEquals(true, expected);
	}

	//Positive Test Case
	@Test
	public void sizeTestCase(){
		linkedList.addNode(5);
		linkedList.addNode(6);
		linkedList.addNode(8);
		int expected = linkedList.getSize();
		assertEquals(18, expected);
	}

	//Positive Test Case
	@Test
	public void removeElementByPositionTestCase(){
		linkedList.addNode(5);
		linkedList.addNode(6);
		linkedList.addNode(8);
		boolean expected =  linkedList.removeItemFromPosition(1);
		assertEquals(true, expected );
	}

	//Positive Test Case
	@Test
	public void removeElementTestCase(){
		linkedList.addNode(5);
		linkedList.addNode(6);
		linkedList.addNode(8);
		assertEquals(true, linkedList.removeItem(8));
	}
	
	//Negative Test Case
	@Test
	public void addTestCaseNegative(){
		linkedList.addNode(5);
		int expected = linkedList.getElementFromPosition(0);
		assertFalse(0 == expected);
	}

	//Negative Test Case
	@Test
	public void addByIndexTestCaseNegative(){
		linkedList.addNode(5);
		linkedList.addNode(6);
		boolean expected = linkedList.addNodeAtLocation(2, 7);
		assertFalse(false == expected);
	}

	//Negative Test Case
	@Test
	public void sizeTestCaseNegative(){
		linkedList.addNode(5);
		linkedList.addNode(6);
		linkedList.addNode(8);
		int expected = linkedList.getSize() - 1;
		assertFalse(0 == expected);
	}

	//Negative Test Case
	@Test
	public void removeElementByPositionTestCaseNegative(){
		linkedList.addNode(5);
		linkedList.addNode(6);
		linkedList.addNode(8);
		linkedList.removeItemFromPosition(1);
		E expected = (E) linkedList.getElementFromPosition(6);
		assertFalse("1" == expected);
	}

	//Negative Test Case
	@Test
	public void removeElementTestCaseNegative(){
		linkedList.addNode(5);
		linkedList.addNode(6);
		linkedList.addNode(8);
		assertFalse(false == linkedList.removeItem(8));
	}
}