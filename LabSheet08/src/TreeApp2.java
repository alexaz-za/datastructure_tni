
public class TreeApp2 {

	public static void main(String[] args) {
		System.out.println("------------------------------\n"
		         	 	 + "Binary Tree from createTree4()\n"
		         		 + "------------------------------");
		
		BinaryTree tree4 = new BinaryTree();
		tree4.createTree4();
		tree4.printTree(tree4.getRoot(), 0);

		System.out.println("------------------------------\n"
        	 	 		 + "Binary Tree from createTree5()\n"
        	 	 		 + "------------------------------");
		
		BinaryTree tree5 = new BinaryTree();
		tree5.createTree5();
		tree5.printTree(tree5.getRoot(), 0);
		
		System.out.println("------------------------------\n"
						 + "Binary Tree from createTree6()\n"
						 + "------------------------------");

		BinaryTree tree6 = new BinaryTree();
		tree6.createTree6();
		tree6.printTree(tree6.getRoot(), 0);
	}

}
