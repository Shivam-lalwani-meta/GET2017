/**
   @author shivam
   @version 1.0
   @date 2017-07-17 
   @description Class to test Binarysearch.java
    
*/
import static org.junit.Assert.*;
import org.junit.Test;

public class LinearsearchTest {
	@Test
	//check whether the returned value is correct or not
	public void testcase() {
		int[] array = {2,5,8,9,10, 77, 55};
		int toBeSearch = 88;
		int expected = Linearsearch.search( array, 0, 5, toBeSearch);
		assertEquals(-1,expected);
	}
	
	@Test
	//check whether the returned value is correct or not
	public void testcase1() {
		int[] array = {2,5,8,9,10,77,55,11};
		int toBeSearch = 77;
		int expected = Linearsearch.search( array, 0, 5, toBeSearch);
		assertEquals(5,expected);
	}
}
