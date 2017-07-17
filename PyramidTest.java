//to test Pyramid class
package nww;

import static org.junit.Assert.*;

import org.junit.Test;


public class PyramidTest {

	@Test
	//method to test number of spaces returned
	public void noOfSpacesReturn() {
		Pyramid object = new Pyramid();
		int ans = object.space(1, 5);
		assertEquals(5,ans);
	}
	
	@Test
	//method to test number method
	public void noOfNumberReturn() {
		Pyramid object = new Pyramid();
		int ans = object.no(1, 5);
		assertEquals(1,ans);
	}
	

}