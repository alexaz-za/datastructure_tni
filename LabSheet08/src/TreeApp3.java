
public class TreeApp3 {

	public static void main(String[] args) {
		System.out.println("------------------------------\n"
						 + "Binary Tree from createTree5()\n"
						 + "------------------------------");
		BinaryTree tree = new BinaryTree();
		tree.createTree5();
		tree.printTree(tree.getRoot(), 0);
		
		tree.searchDelete(60);
		System.out.println("\nDelete Node = " + tree.getDeleteNode().data);
		System.out.println("Parent = " + tree.getParent().data);
		
		System.out.println("------------------------------\n"
				 		 + " Delete Node from Binary Tree\n"
				 		 + "------------------------------");
		
		int target = 60;
		tree.delete(target);
		tree.printTree(tree.getRoot(), 0);
		System.out.println("\nDeleted Only Child Node = " + target);
		
		System.out.println("------------------------------\n"
		 		 		 + " Delete Node from Binary Tree\n"
		 		 		 + "------------------------------");

		int TwoChildrenTarget = 30;
		tree.delete(TwoChildrenTarget);
		tree.printTree(tree.getRoot(), 0);
		System.out.println("\nDeleted Both Child Node = " + TwoChildrenTarget);
	}

}
