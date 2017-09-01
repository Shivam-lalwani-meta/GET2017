/**
 * @author Shivam Lalwani
 * @version 1.0
 * @Date 30-August-2017
 * @project CreateBST class is used to insert elements/nodes in a tree by using Insert method, searching operation
 * using search method and a index counter to assign Nodes a index value.
 *
 */

/**
 * The Class BuildBST.
 */
public class CreateBST {

	/** The root. */
	Node root;

	/** The indexCounter to assign index numbers to Nodes */
	private static int indexCounter;

	/** The index to be returned as a result of binary search */
	int index;

	/**
	 * Instantiates a new builds the BST.
	 */
	public CreateBST() {
		root = null;
	}

	/**
	 * Insert.
	 *
	 * @param key, data to be inserted
	 */
	public boolean insert(int key) {
		root = insertInTree(root, key);
		indexCounter++;
		return true;
	}

	/**
	 * Builds the tree.
	 *
	 * @param root, the root
	 * @param data, the data
	 * @return the BST node
	 */
	private Node insertInTree(Node root, int data) {
		//if the element is first element, create a node and return it
		if (root == null) {
			return new Node(data, indexCounter);
		}
		//if the value is less than root value, insert on left-node
		if (data < root.data) {
			root.left = insertInTree(root.left, data);
		}
		//if the value is more than root value, insert on right-node
		else if (data > root.data) {
			root.right = insertInTree(root.right, data);
		}
		return root;
	}

	/**
	 * Search element.
	 *
	 * @param value, the value
	 * @return the, the result as index
	 */
	public int searchElement(int value) {
		Node node = root;
		return search(node, value);
	}

	/**
	 * Search.
	 *
	 * @param root
	 *            the root
	 * @param val
	 *            the value
	 * @return the result as index
	 */
	private int search(Node root, int val) {
		//search till null is not encountered
		while ((root != null)) {
			//if value is less than root, make left node as a new root
			if (val < root.getData()) {
				root = root.left;
			}
			//if value is more than root, make right node as a new root
			else if (val > root.getData()) {
				root = root.right;
			}
			//if value found return its index
			else {
				return root.getIndex();
			}
			//recursion point
			search(root, val);
		}
		return -1;
	}

}
