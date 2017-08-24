/** 
 * @author Shivam
 * @version 1.0
 * @Date 23-August-2017
 * @project Data Structure Assignment 3
 */
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestTraversal {
	static Traversal tree;
	//defining object only once
	@BeforeClass
	public static void setUp() {
		tree = new Traversal();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
	}

	//Positive test Case
	@Test
	public void postfixTest() {
		String result = tree.printPostorder(tree.root);
		String expected = "12453";
		assertEquals(expected, result);
	}

	//Positive test Case
	@Test
	public void prefixTest() {
		String result = tree.printPreorder(tree.root);
		String expected = "45231";
		assertEquals(expected, result);
	}

	//Positive test Case
	@Test
	public void infixTest() {
		String result = tree.printInorder(tree.root);
		String expected = "42513";
		assertEquals(expected, result);
	}

	//Negative test Case
	@Test
	public void postfixTestNegative() {
		String result = tree.printPostorder(tree.root);
		String expected = "12543";
		assertFalse(expected == result);
	}

	//Negative test Case
	@Test
	public void prefixTestNegative() {
		String result = tree.printPreorder(tree.root);
		String expected = "45213";
		assertFalse(expected.equals(result));
	}

	//Negative test Case
	@Test
	public void infixTestNegative() {
		String result = tree.printInorder(tree.root);
		String expected = "24513";
		assertFalse(expected.equals(result));
	}
}
