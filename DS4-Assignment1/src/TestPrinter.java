/** 
 * @author Shivam Lalwani
 * @version 1.0
 * @Date 22-August-2017
 * @project Data Structure Assignment 4
 */
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Before;
import org.junit.Test;

public class TestPrinter {
	private Printer department1, department2, department3, department4, department5;
	private Heap heap;
	private String result,expected;
	@Before
	public void setup() {
		heap = new Heap();
		department1 = new Printer("Chairman",4);
		department2 = new Printer("Professor",3);
		department3 = new Printer("ugraduate1",1);
		department4 = new Printer("graduate",2);
		department5 = new Printer("ugraduate2",1);
	}
	@Test
	//Positive test Case
	public void testCasePositive() {
		heap.insert(department1);
		heap.insert(department2);
		heap.insert(department3);
		heap.insert(department4);
		heap.insert(department5);
		for(int i = 0; i < Printer.getNoOfObjects(); i++) {
			result += heap.delete();
		}
		expected += "ChairmanProfessorgraduateugraduate1ugraduate2";
		assertEquals(result, expected);
	}
	
	@Test
	//Negative test Case
	public void testCaseNegative() {
		Printer.setNoOfObjects(5);
		heap.insert(department1);
		heap.insert(department2);
		heap.insert(department3);
		heap.insert(department4);
		heap.insert(department5);
		for(int i = 0; i < Printer.getNoOfObjects(); i++) {
			result += heap.delete();
		}
		expected += "ChairmanProfessorgraduateugraduate2ugraduate1";
		assertFalse(result.equals(expected));
	}
}
