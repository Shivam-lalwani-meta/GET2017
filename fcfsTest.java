//to check fcfs class
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class fcfsTest {
	
	@Test
	public void testCase(){
		
		fcfs object=new fcfs();
		int[] arrival_time={1,5,9,25};
		int[] job_size={12,7,2,5};
		
		int[][] expected={{1,1,0,1,12},{2,5,8,13,19},{3,9,11,20,21},{4,25,0,25,29}};  //expected result
		int [][] output=object.getInfoOfJob(arrival_time, job_size);				//actual result
		fcfsTest.isArrayEqual(expected,output);		
		
		
		
	}
	
	public static void isArrayEqual(int expected[][], int output[][]){
		
		assertArrayEquals(expected, output);   //to check whether expected and actual results are same or not
		
	}
}
