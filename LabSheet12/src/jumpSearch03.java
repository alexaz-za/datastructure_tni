import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;

public class jumpSearch03 {

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
		
		int index = jumpSearch(arr, target);
		
		if (index != -1) {
			System.out.println("The target (" + target + ") at index " + index);
		} else {
			System.err.println("Cannot found " + target + " in this tree");
		}

	}

	public static ArrayList<Integer> traversal(Node node) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Deque<Node> stack = new ArrayDeque<Node>();

		Node current_node = node;

		while (!stack.isEmpty() || current_node != null) {
			while (current_node != null) {
				stack.push(current_node);
				current_node = current_node.left;
			}
			current_node = stack.pop();
			list.add(current_node.data);
			current_node = current_node.right;
		}
		return list;
	}

	public static int[] sorting(int[] nums) {
		Sorting sort = new Sorting(nums);
		sort.bubbleSort();
		return sort.getArray();
	}
	
	public static int jumpSearch(int[] nums, int target) {
		int jump_size = (int) Math.floor(Math.sqrt(nums.length));
		int start = 0, m = 0;
		
		while (m < nums.length) {
			if (target == nums[m]) {
				return m;
			} else if (target > nums[m]) {
				start = m;
				m += jump_size;
			} else {
				for (int i = start; i < m; i++) {
					if (target == nums[i]) return i;
				}
				return -1;
			}
		}
		for (int i = start; i < nums.length; i++) {
			if (target == nums[i]) return i;
		}
		return -1;
	}
}
