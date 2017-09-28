
/**
 * The Class MirrorTree.
 */
public class MirrorTree {
	
	/** The root. */
	Node root;
	
	/**
	 * Instantiates a new mirror tree.
	 */
	public MirrorTree() {
		root = null;
	}
	
	/**
	 * Checks if is mirror.
	 *
	 * @param tree1 the tree 1
	 * @param tree2 the tree 2
	 * @return true, if is mirror
	 */
	public boolean isMirror(Node tree1, Node tree2) {
		//check till Both trees are not null
		if(tree1 == null && tree2 == null) {
			return true;
		}
		//returns false only if one of them is null
		if(tree1 == null || tree2 == null) {
			return false;
		}
		//returns true if key value is same and recalled data are same 
		return (tree1.key == tree2.key) && (isMirror(tree1.left, tree2.right)) && (isMirror(tree1.right, tree2.left));
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		MirrorTree obj = new MirrorTree();
		Node tree1 = new Node(1);
		Node tree2 = new Node(1);
		tree1.left = new Node(2);
		tree1.right = new Node(3);
		tree1.left.left = new Node(4);
		tree1.left.right = new Node(5);
		tree2.left = new Node(3);
		tree2.right = new Node(2);
		tree2.right.left = new Node(5);
		tree2.right.right = new Node(4);

		if(obj.isMirror(tree1, tree2) != false) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
