/** 
 * @author Shivam
 * @version 1.0
 * @Date 23-August-2017
 * @project Data Structure Assignment 3
 */
//Class Node to create nodes
public class Node {
	
	//Value in node
	int key;
	
	//right and left pointer
	Node left, right;

	/**
	 * Instantiates a new node 1.
	 *
	 * @param item the item
	 */
	public Node(int item) {
		key = item;
		left = right = null;
	}
}
