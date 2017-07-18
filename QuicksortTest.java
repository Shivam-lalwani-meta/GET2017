import org.junit.Assert;
import org.junit.Test;

public class QuicksortTest {
	@Test
	public void testcase() {
		int arr[] = {10,7,8,9,1,5};
		int expected[] = {1,5,7,8,9,10};
		QuickSort.sort(arr, 0, arr.length-1);
		Assert.assertArrayEquals(expected, arr );
	}
}
