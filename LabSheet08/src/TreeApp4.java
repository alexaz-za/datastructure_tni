import java.util.Scanner;

public class TreeApp4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("------------------------------\n" 
						 + "Binary Tree from createTree6()\n"
						 + "------------------------------");
		BinaryTree tree = new BinaryTree();
		tree.createTree6();
		tree.printTree(tree.getRoot(), 0);

		System.out.print("\nInput target: ");
		int target = sc.nextInt();

		System.out.println("------------------------------");

		tree.searchDelete(target);
		Node found = tree.getSearch();

		if (found != null) {
			if (found.left != null) {
				System.out.println("Left Child : " + found.left.data);
			} else {
				System.out.println("No Left Child");
			}

			if (found.right != null) {
				System.out.println("Right Child : " + found.right.data);
			} else {
				System.out.println("No Right Child");
			}

			if (found.left == null && found.right == null) {
				System.out.println("[" + found.data + "] is Leaf Node");
			} else {
				System.out.println("[" + found.data + "] is not Leaf Node");
			}
		} else {
			System.out.println("Cannot found Node(data=[" + target + "])");
		}
		System.out.println("------------------------------");
	}

}
