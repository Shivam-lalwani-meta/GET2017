/**
 *
 * @author Shivam Lalwani
 * @version 1.0
 * @Date 30-August-2017
 * @project This class is used to declare the contents of a node in a tree,
 * here, a Node contains left child, right child, data and a index and its getters and setters are defined.
 * This class is used to make Nodes to be inserted in a tree.
 */

/**
 * The Class BSTNode 
 */
public class Node {
	
	/** The index. */
	int data, index;
	
	/** The left. */
	Node left;
	
	/** The right. */
	Node right;

	/**
	 * Instantiates a new node.
	 *
	 * @param data the data
	 * @param index the index
	 */
	public Node(int data, int index) {
		this.data = data;
		this.index = index;
		left = null;
		right = null;
	}

	/**
	 * Gets the data.
	 *
	 * @return the data
	 */
	public int getData() {
		return data;
	}

	/**
	 * Gets the index.
	 *
	 * @return the index
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * Sets the index.
	 *
	 * @param index the new index
	 */
	public void setIndex(int index) {
		this.index = index;
	}

	/**
	 * Sets the data.
	 *
	 * @param data the new data
	 */
	public void setData(int data) {
		this.data = data;
	}

}
