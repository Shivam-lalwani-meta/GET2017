/** 
 * @author Shivam Lalwani
 * @version 1.0
 * @Date 28-August-2017
 * @project Data Structure Assignment 5
 */
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.LinkedList;
import java.util.List;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestSortedLinkedList {

	static SortedLinkedList listObject;
	static List<Integer> list;
	String result = "", expected = "";
	
	@Before
	public void setup(){
		listObject = new SortedLinkedList();
		list = new LinkedList<Integer>();
		listObject.add(2);
		listObject.add(25);
		listObject.add(23);
		listObject.add(27);
		listObject.add(20);
		listObject.add(3);
		listObject.add(32);
		listObject.add(5);
	}

	//Positive test Case
	@Test
	public void testPositive1(){
		list = listObject.getListObj();
		result = list.toString();
		expected = "[2, 3, 5, 20, 23, 25, 27, 32]";
		assertEquals(result, expected);
	}

	//Negative test Case
	@Test
	public void testNegative2(){
		list = listObject.getListObj();
		result = list.toString();
		expected = "[2, 3, 5, 20, 23, 25, 27, 35]";
		assertFalse(result.equals(expected));
	}

	//Positive test Case
	@Test
	public void testRepeatedElementsPositive3(){
		listObject.add(27);
		list = listObject.getListObj();
		result = list.toString();
		expected = "[2, 3, 5, 20, 23, 25, 27, 27, 32]";
		assertEquals(result, expected);
	}

	//Negative test Case
	@Test
	public void testRepeatedElementsNegative4(){
		list = listObject.getListObj();
		result = list.toString();
		expected = "[2, 3, 5, 20, 23, 25, 27, 35]";
		assertFalse(result.equals(expected));
	}
}
