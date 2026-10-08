import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

public class linearSearch03 {

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.sampleTree();
		tree.printTree(tree.getRoot(), 0);
		
		System.out.println("\nTraversal order : " + traversal(tree.getRoot()));
		
		int[] arr = new int[traversal(tree.getRoot()).size()];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = traversal(tree.getRoot()).get(i);
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nInput a target number: ");
		int target = sc.nextInt();
		
		int index = linearSearch(arr, target);
		
		if (index != -1) {
			System.out.println("The target (" + target + ") at index " + index);
		} else {
			System.err.println("Cannot found " + target + " in this tree");
		}
	}
	
	public static ArrayList<Integer> traversal(Node node) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (node != null) {
			Queue<Node> queue = new ArrayDeque<Node>();
            queue.add(node);
            
            while (!queue.isEmpty()) {
            	int levelSize = queue.size();
            	
            	for (int i = 0; i<levelSize; i++) {
            		Node current_node = queue.poll();
            		
            		list.add(current_node.data);
            		
            		if (current_node.left != null) {
            			queue.add(current_node.left);
            		}
            		if (current_node.right != null) {
            			queue.add(current_node.right);
            		}
            	}
            }
		}
		return list;
	}
	
	public static int linearSearch(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			if (target == nums[i]) return i;
		}
		return -1;
	}
}
