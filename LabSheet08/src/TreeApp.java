
public class TreeApp {

	public static void main(String[] args) {
		System.out.println("------------------------------\n"
						 + "Binary Tree from createTree1()\n"
						 + "------------------------------");
		
		BinaryTree tree1 = new BinaryTree();
		tree1.createTree1();
		tree1.printTree(tree1.getRoot(), 0);

		System.out.println("------------------------------\n"
				         + "Binary Tree from createTree2()\n"
				         + "------------------------------");

		BinaryTree tree2 = new BinaryTree();
		tree2.createTree2();
		tree2.printTree(tree2.getRoot(), 0);
		
		System.out.println("------------------------------\n"
		         		 + "Binary Tree from createTree3()\n"
		         		 + "------------------------------");

		BinaryTree tree3 = new BinaryTree();
		tree3.createTree3();
		tree3.printTree(tree3.getRoot(), 0);
	}

}
