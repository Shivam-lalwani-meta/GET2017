/** 
 * @author Shivam Lalwani
 * @version 1.0
 * @Date 28-August-2017
 * @project Data Structure Assignment 5
 */
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class characterConcordance{

	static Map<Character, Set<Integer>> concordance(String input) {
		//map of character and set of indices
		Map<Character, Set<Integer>> concordance = new HashMap<Character, Set<Integer>>();

		//exception handling for null values
		try{
			if(input == null) {
				throw new NullPointerException();
			}
			//iterate till the string length and set the character set to the set
			for (int i = 0; i < input.length(); i++) {
				char charAt = input.charAt(i);
				if (charAt == ' ') {
					continue; // ignore spaces
				}
				//to check whether the character is in map or not
				Set<Integer> set = concordance.get(charAt);
				//if the character is not in the map, create new set for new character
				if (set == null) {
					set= new HashSet<Integer>();
				}
				set.add(i + 1); // used to start indexing from 1
				concordance.put(charAt, set);
			}
		} catch(NullPointerException e) {
			e.printStackTrace();
		}
		return concordance;
	}
}