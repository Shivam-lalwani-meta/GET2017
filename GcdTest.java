/**
   @author shivam
   @version 1.0
   @date 2017-07-17 
   @description Class to test Binarysearch.java
    
*/

import static org.junit.Assert.*;
import org.junit.Test;

public class GcdTest {
	@Test
	//case will check the gcd of two number is correct or not
	public void testcase() {
		int x = 2, y = 1;
		int expected = Gcd.gcd_calculate(x,y);
		assertEquals(1,expected);
	}
	
	@Test
	//case will check the gcd of two number is correct or not
	public void testcase1() {
		int x = 12, y = 18;
		int expected = Gcd.gcd_calculate(x,y);
		assertEquals(6,expected);
	}
	
	@Test
	//case will check the gcd of two number is correct or not
	public void testcase2() {
		int x = 100, y = 3;
		int expected = Gcd.gcd_calculate(x,y);
		assertEquals(1,expected);
	}
}
