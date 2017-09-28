/** 
 * @author Shivam Lalwani
 * @version 1.0
 * @Date 28-August-2017
 * @project Data Structure Assignment 5
 */
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import java.util.Map;
import java.util.Set;
import org.junit.Before;
import org.junit.Test;


/**
 * The Class TestCharacterConcordance.
 */
public class TestCharacterConcordance {
	 
 	/** The concordance. */
 	Map<Character, Set<Integer>> concordance;
	 
 	/** The set. */
 	Set<Integer> set;
	 
 	/** The result. */
 	String result="";
	 
	 /**
 	 * Setup.
 	 */
 	@Before
	 public void setup(){
		 concordance = characterConcordance.concordance("Hello Metacube");
		 result = concordance.toString();
	 }
	 
 	//Positive test case
	 @Test
	 public void testPositive(){
		 String expected = "{a=[10], b=[13], c=[11], t=[9], e=[2, 8, 14], u=[12], H=[1], l=[3, 4], M=[7], o=[5]}";
		 assertEquals(result, expected);
	 }
	 
 	//Negative test case
	 @Test
	 public void testNegative(){
		 String expected = "{a=[1, 4], !=[13, 14], s=[7], c=[9], v=[3], i=[6], J=[1], l=[12], o=[10, 11]}";
		 assertFalse(result.equals(expected));
	 }
}
