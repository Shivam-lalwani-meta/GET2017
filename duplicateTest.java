
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
public class duplicateTest {
@Test
public void evaluatesExpression(){
	duplicate array = new duplicate();
	int[] input = {1,2,3,4,5,2,3,4,2,3,6,7,8};
	int[] expected = {1,2,3,4,5,6,7,8};
	int[] result = array.removeDuplicates(input);
	assertArrayEquals(expected, result);
}
}
