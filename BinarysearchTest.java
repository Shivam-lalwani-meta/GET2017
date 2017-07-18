/**
   @author shivam
   @version 1.0
   @date 2017-07-17 
   @description Class to test Binarysearch.java
    
*/

import static org.junit.Assert.*;
import org.junit.Test;

public class BinarysearchTest {
	@Test
	//case will check whether the toBeSearch is found in inputArray or not, using binarysearch() method of Binarysearch class
	public void testcase() {
		int[] inputArray = {2,5,8,9,10,55,77};
		int toBeSearch = 88;
		int ans = Binarysearch.binarysearch(inputArray, 0, inputArray.length-1, toBeSearch);
		assertEquals(0,ans);	//evaluate actual and expected answers
	}
	
	@Test
	//case will check whether the toBeSearch is found in inputArray or not, using binarysearch() method of Binarysearch class
	public void testcase2() {
		int[] inputArray = {2,5,8,9,10,55,77};
		int toBeSearch = 77;
		int ans = Binarysearch.binarysearch(inputArray, 0, inputArray.length-1, toBeSearch);
		assertEquals(6,ans);	//evaluate actual and expected answers
	}
}
