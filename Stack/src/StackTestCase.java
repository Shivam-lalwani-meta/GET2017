
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StackTestCase {

	Stack<Integer> stackTest;
	
	@Before
	public void initialize() {
		stackTest = new Stack<Integer>();
	}

	@Test
	public void pushTestCase() {
		stackTest.push(1);
		int actual = stackTest.top.data;
		assertEquals(actual, 1);
	}

	@Test
	public void popTestCase() {
		stackTest.push(1);
		int actual = stackTest.pop();
		assertEquals(actual, 1);
	}
	
	@Test
	public void convertInfixToPostfixTestCase() {
		String[] expected = stackTest.convertInfixToPostfix("5+5+5+5");
		String[] actual = {"5", "5", "+", "5", "+", "5", "+"};
		assertArrayEquals(actual, expected);
	}

	@Test
	public void convertInfixToPostfixTestCaseWithParanthesis() {
		String[] actual = stackTest.convertInfixToPostfix("3+(5+7)-3*5*7/(5/4)*3");
		for(int i=0;i<actual.length;i++) {
			System.out.print(actual[i]);
		}
		String[] expected = {"3", "5", "7", "+", "+", "3", "5", "*", "7", "*", "5", "4", "/", "/", "3", "*", "-", null, null, null, null};
		assertArrayEquals(actual, expected);
	}
	
	@Test
	public void pushTestCaseNegative() {
		stackTest.push(1);
		int actual = stackTest.top.data;
		assertFalse(actual == 2);
	}

	@Test
	public void popTestCaseNegative() {
		stackTest.push(1);
		int actual = stackTest.pop();
		assertFalse(actual == 2);
	}
	
	@Test
	public void convertInfixToPostfixTestCaseNegative() {
		String[] expected = stackTest.convertInfixToPostfix("5+5+5+5");
		String[] actual = {"5", "5", "+", "5", "+", "5"};
		assertFalse(actual == expected);
	}

	@Test
	public void convertInfixToPostfixTestCaseWithParanthesisNegative() {
		String[] actual = stackTest.convertInfixToPostfix("3+(5+7)-3*5*7/(5/4)*3");
		for(int i=0;i<actual.length;i++) {
			System.out.print(actual[i]);
		}
		String[] expected = {"3", "5", "7", "+", "+", "3", "5", "*", "7", "*", "5", "4", "/", "/", "3", "*", "-"};
		assertFalse(actual == expected);
	}
}
