
/** 
 * @author Shivam
 * @version 1.0
 * @Date 23-August-2017
 * @project Data Structure Assignment 3
 */
public class Traversal {
	//Strings to hold results
	String resultpre = "";
	String resultpost = "";
	String resultIn = "";
	//Root of Binary Tree
	Node root;

	Traversal() {
		root = null;
	}

	//postorder traversal in recursive manner
	String printPostorder(Node node) {
		if(node == null) {
			return resultpost;
		}	
		//first print data of node and appending the key values in String
		resultpost += node.key;
		// then recur on left sutree
		printPostorder(node.left);
		// now recur on right subtree 
		printPostorder(node.right);
		//returning result string
		return resultpost;

	}

	//inorder traversal in recursive manner
	String printInorder(Node node) {
		if(node == null) {
			return resultIn;
		}	
		// first recur on left child
		printInorder(node.left);
		// then print the data of node and appending the key values in String
		resultIn += node.key;
		// now recur on right child
		printInorder(node.right);
		//returning result string
		return resultIn;
	}

	//preorder traversal in recursive manner
	String printPreorder(Node node) {
		if(node == null) {
			return resultpre;
		}	
		// first recur on left subtree
		printPreorder(node.left);
		// then recur on right subtree
		printPreorder(node.right);
		// now deal with the node and appending the key values in String
		resultpre += node.key;
		//returning result string
		return resultpre;
	}
}