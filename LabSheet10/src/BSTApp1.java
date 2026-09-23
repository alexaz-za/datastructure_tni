
public class BSTApp1 {

	public static void main(String[] args) {
		// Display sampleTree1()
		BinarySearchTree tree = new BinarySearchTree();
		tree.sampleTree1();
		tree.printTree(tree.getRoot(), 0);

		System.out.println("\nMinimum Node is " + tree.findMinimumBST(tree.getRoot()).data);
		System.out.println("Maximum Node is " + tree.findMaximumBST(tree.getRoot()).data);

		int findNode = 20;
		System.out.println("Is " + findNode + " in BST => " + tree.findSpecificData(findNode));

		int delNode = 20;
		tree.searchDeleteNode(delNode);
		System.out.println("Parent is " + tree.getParent().data);
		System.out.println("Delete Node is " + tree.getDeleteNode().data + "\n");

		tree.delete(delNode);
		tree.printTree(tree.getRoot(), 0);
	}

}
