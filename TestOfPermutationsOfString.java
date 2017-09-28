/**
 * 
 * @author Shivam
 * @date 19-09-2017
 * @description Class PermutationsOfString will take a String and displays all possible combinations of it
 */

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class TestOfPermutationsOfString {

	// Object declaration of PermutationsOfString class
		PermutationsOfString PermutaionsObject = new PermutationsOfString();

		@Test
		public void permutationsOfStringTest1() {
			List<String> permutations = PermutaionsObject.generatePermutations("ABC");
	        List<String> actualPermutations = Arrays.asList ( "ABC", "ACB", "BAC", "BCA",
	        		"CBA", "CAB" );
			// Compares expected and actual permutations of the string.
			assertThat(permutations, is(actualPermutations));
		}
		
		@Test
		public void permutationsOfStringTest2() {
			List<String> permutations = PermutaionsObject.generatePermutations("ABCD");
	        List<String> actualPermutations = Arrays.asList ( "ABCD", "ABDC", "ACBD",
	        		"ACDB", "ADCB", "ADBC", "BACD", "BADC", "BCAD", "BCDA", "BDCA",
	        		"BDAC", "CBAD", "CBDA", "CABD", "CADB", "CDAB", "CDBA", "DBCA", 
	        		"DBAC", "DCBA", "DCAB", "DACB", "DABC" );
			// Compares expected and actual permutations of the string.
			assertThat(permutations, is(actualPermutations));
		}
	
		@Test
		public void permutationsOfStringTest3() {
			List<String> permutations = PermutaionsObject.generatePermutations("AAB");
	        List<String> actualPermutations = Arrays.asList ( "AAB", "ABA", "BAA" );
			// Compares expected and actual permutations of the string.
			assertThat(permutations, is(actualPermutations));
		}
}
