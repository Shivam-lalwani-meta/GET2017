/** 
 * @author Shivam
 * @version 1.0
 * @Date 23-August-2017
 * @project Data Structure Assignment 3
 */
import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestMirrorTree {
	static MirrorTree obj;
	static Node tree1;
	static Node tree2;
	static Node tree3;
	//defining object only once
	@BeforeClass
	public static void setUp() {
		obj = new MirrorTree();
		tree1 = new Node(1);
		tree2 = new Node(1);
		tree3 = new Node(1);
		tree1.left = new Node(2);
		tree1.right = new Node(3);
		tree1.left.left = new Node(4);
		tree1.left.right = new Node(5);
		tree2.left = new Node(3);
		tree2.right = new Node(2);
		tree2.right.left = new Node(5);
		tree2.right.right = new Node(4);
	}

	//Positive test Case
	@Test
	public void mirrorTest() {
		boolean result = obj.isMirror(tree1, tree2);
		assertEquals(true, result);
	}

	//Negtive test Case
	@Test
	public void mirrorTestNegtive() {
		boolean result = obj.isMirror(tree1, tree3);
		assertEquals(false, result);
	}

}
