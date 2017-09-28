/** 
 * @author Shivam
 * @version 1.0
 * @Date 29-August-2017
 * @project Data Structure Assignment 6
 */

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.LinkedHashMap;

import org.junit.Before;
import org.junit.Test;

public class UniqueCharacterTestCase {

	// Initialize LinkedHashMap.
	@Before
	public void init() {
		UniqueCharacters.strings = new LinkedHashMap<String, Integer>();
	}

	// Positive Test Case.
	@Test
	public void uniqueCharactersTestCase1() {
		int output = UniqueCharacters.uniqueCharacters("asdsad..sdasdasd");
		assertEquals(output, 4);
	}

	// Positive Test Case.
	@Test
	public void uniqueCharactersTestCase2() {
		int output = UniqueCharacters.uniqueCharacters("asd asd asd");
		assertEquals(output, 4);
	}
	
	@Test
	public void uniqueCharactersTestCase3() {
		int output = UniqueCharacters.uniqueCharacters("asdsadasdasdasd");
		assertEquals(output, 3);
	}
	
	// Negative Test case.
	@Test
	public void uniqueCharactersTestCase4() {
		int output = UniqueCharacters.uniqueCharacters("asdsadasdasdasd");
		assertFalse(output == 15);
	}

	// Negative Test case.
	@Test
	public void uniqueCharactersTestCase5() {
		int output = UniqueCharacters.uniqueCharacters("asd asd asd");
		assertFalse(output == 11);
	}
}