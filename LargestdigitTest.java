/**
   @author shivam
   @version 1.0
   @date 2017-07-17 
   @description Class will test Largestdigit
    
*/
import static org.junit.Assert.*;
import org.junit.Test;

public class LargestdigitTest {
	@Test
	//case will check the returned value by largedigit() is coreect or not
	public void tetcase() {
		int number = 2;
		int expected = Largestdigit.largeDigit(number);
		assertEquals(2,expected);
	}
	
	@Test
	//case will check the returned value by largedigit() is coreect or not
	public void tetcase1() {
		int number = 1257369;
		int expected = Largestdigit.largeDigit(number);
		assertEquals(9,expected);
	}
	
	@Test
	//case will check the returned value by largedigit() is coreect or not
	public void tetcase3() {
		int number = 444;
		int expected = Largestdigit.largeDigit(number);
		assertEquals(4,expected);
	}
}
