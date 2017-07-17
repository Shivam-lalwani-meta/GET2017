package assignment;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class LongestSequenceTest {
	
	
	@Test
	public void testCase(){
		LongestSequence obj=new LongestSequence();
		
		int[] input={1,2,3,4,1,2,4,5,6,7,8,1,2};
		int[] ans={1,2,4,5,6,7,8};
		//int[] expected = obj.findLongestSequence(input);
		assertArrayEquals(ans,obj.findLongestSequence(input));
	
		}

	
}
