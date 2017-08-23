
/** 
 * @author Shivam
 * @version 1.0
 * @Date 22-August-2017
 * @project Data Structure  Assignment 1
 */
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

/**
 * The Class TestMyArrayList.
 */
public class TestMyArrayList {

	/**
	 * Test add.
	 */
	@Test
	public void testAdd(){
		MyArrayList<Integer> obj = new MyArrayList<Integer>();
		obj.addElement(5);
		assertEquals(1,obj.getElement(5));
	}

	/**
	 * Test add negative.
	 */
	@Test
	public void testAddNegative(){
		MyArrayList<Integer> obj = new MyArrayList<Integer>();
		obj.addElement(6);
		int expected = 1;
		assertFalse(expected == obj.getElement(7));
	}

	/**
	 * Test add by index.
	 */
	@Test
	public void testAddByIndex(){
		MyArrayList<Integer> obj = new MyArrayList<Integer>();
		obj.addElement(5);
		obj.addElement(6);
		obj.addElementByIndex(2, 7);
		assertEquals(3, obj.getElement(7));
	}

	/**
	 * Test add by index negative.
	 */
	@Test
	public void testAddByIndexNegative(){
		MyArrayList<Integer> obj = new MyArrayList<Integer>();
		obj.addElement(5);
		obj.addElement(6);
		obj.addElementByIndex(2, 7);
		assertFalse(1 == obj.getElement(7));
	}

	/**
	 * Test size.
	 */
	@Test
	public void testSize(){
		MyArrayList<Integer> obj = new MyArrayList<Integer>();
		obj.addElement(5);
		obj.addElement(6);
		obj.addElement(8);
		assertEquals(3, obj.getSize());
	}

	/**
	 * Test size negative.
	 */
	@Test
	public void testSizeNegative(){
		MyArrayList<Integer> obj = new MyArrayList<Integer>();
		obj.addElement(5);
		obj.addElement(6);
		obj.addElement(8);
		assertFalse(4 == obj.getSize());
	}

	/**
	 * Test remove element by position.
	 */
	@Test
	public void testRemoveElementByPosition(){
		MyArrayList<Integer> obj = new MyArrayList<Integer>();
		obj.addElement(5);
		obj.addElement(6);
		obj.addElement(8);
		obj.removeElementFromPosition(1);
		assertEquals(-1, obj.getElement(6));
	}

	/**
	 * Test remove element by position negative.
	 */
	@Test
	public void testRemoveElementByPositionNegative(){
		MyArrayList<Integer> obj = new MyArrayList<Integer>();
		obj.addElement(5);
		obj.addElement(6);
		obj.addElement(8);
		obj.removeElementFromPosition(1);
		assertFalse(1 == obj.getElement(6));
	}

	/**
	 * Test remove element.
	 */
	@Test
	public void testRemoveElement(){
		MyArrayList<Integer> obj = new MyArrayList<Integer>();
		obj.addElement(5);
		obj.addElement(6);
		obj.addElement(8);
		assertEquals(true, obj.removeElement(8));
	}

	/**
	 * Test remove element negative.
	 */
	@Test
	public void testRemoveElementNegative(){
		MyArrayList<Integer> obj = new MyArrayList<Integer>();
		obj.addElement(5);
		obj.addElement(6);
		obj.addElement(8);
		assertFalse(false == obj.removeElement(8));
	}

	/**
	 * Test clear.
	 */
	@Test
	public void testClear(){
		MyArrayList<Integer> obj = new MyArrayList<Integer>();
		obj.addElement(5);
		obj.addElement(6);
		obj.addElement(8);
		obj.clearArrayList();
		assertEquals(-1, obj.getElement(5));
	}

	/**
	 * Test clear negative.
	 */
	@Test
	public void testClearNegative(){
		MyArrayList<Integer> obj = new MyArrayList<Integer>();
		obj.addElement(5);
		obj.addElement(6);
		obj.addElement(8);
		obj.clearArrayList();
		assertFalse(1 == obj.getElement(5));
	}

	/**
	 * Test reverse array.
	 */
	@Test
	public void testReverseArray(){
		MyArrayList<Integer> obj = new MyArrayList<Integer>();
		obj.addElement(5);
		obj.addElement(6);
		obj.addElement(8);
		Object expected[] = obj.printArrayList();
		obj.reverseArrayList();
		Object actual[] = obj.printArrayList();
		assertFalse(actual == expected);
	}
}
