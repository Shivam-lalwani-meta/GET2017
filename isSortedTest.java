

import static org.junit.Assert.*;

import org.junit.Test;

public class isSortedTest {
	
	@Test					//test case 1, for ascending
	public void testCase(){
		
		isSorted object=new isSorted();
		int[] arr={1,2,3,4,5,6,7};
		
		int expected=1;
		int output=object.isSort(arr);
		assertEquals(1,output);
		
		
		
	}@Test					//test case 2, for descending
	public void testCase1(){
		
		isSorted object=new isSorted();
		int[] arr={7,6,5,4,3,2,1};
		
		int expected=2;
		int output=object.isSort(arr);
		assertEquals(2,output);
		
		
		
	}@Test					//test case 1, for non sorted array
	public void testCase2(){
		
		isSorted object=new isSorted();
		int[] arr={1,2,4,3,7,6};
		
		int expected=0;
		int output=object.isSort(arr);
		assertEquals(0,output);
		
		
		
	}
	
	
}

