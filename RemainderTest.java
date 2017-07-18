/**
   @author shivam
   @version 1.0
   @date 2017-07-17 
   @description Class to test Remainder.java
    
*/
import static org.junit.Assert.*;

import org.junit.Test;
public class RemainderTest {
	@Test
	//case to check remainder returned by method is orret or not
	public void testcase() {
		int ans = Remainder.rem(3,2);
		assertEquals(1,ans);
	}
		
	@Test
	//case to check remainder returned by method is orret or not
	public void testcase1() {
		int ans = Remainder.rem(100,3);
		assertEquals(1,ans);	
	}
		
	@Test
	//case to check remainder returned by method is orret or not
	public void testcase2() {
		try {
			int ans = Remainder.rem(2,0);
				assertEquals(1,ans);
			}
			catch(Exception e){
				e.getMessage();
			}
		}
}
