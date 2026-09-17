import java.util.ArrayDeque;
import java.util.Queue;

public class BinaryTree {

	private Node root;
	private Node parent; // parent of deleteNode
	private Node deleteNode;
	private Node search;

	public BinaryTree() {
		root = null;
		deleteNode = null;
	}

	public Node getRoot() {
		return root;
	}

	public Node getParent() {
		return parent;
	}

	public Node getDeleteNode() {
		return deleteNode;
	}
	
	public Node getSearch() {
		return search;
	}

	public void printTree(Node node, int depth) {
		if (node != null) {
			printTree(node.right, depth + 1);
			System.out.println("    ".repeat(depth) + node.data);
			printTree(node.left, depth + 1);
		}
	}

	public void createTree1() {
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
	}

	public void createTree2() {
		root = new Node(15);
		root.left = new Node(8);
		root.right = new Node(23);
		root.left.left = new Node(4);
		root.left.right = new Node(11);
		root.left.left.left = new Node(2);
		root.right.left = new Node(19);
		root.right.left.right = new Node(20);
	}

	public void createTree3() {
		root = new Node(50);
		root.left = new Node(10);
		root.right = new Node(22);
		root.left.left = new Node(11);
		root.left.right = new Node(12);
		root.right.right = new Node(24);
		root.right.right.left = new Node(23);
	}

	public void createTree4() {
		int[] nums = { 10, 8, 15, 2, 9, 18, 14, 20, 11, 17 };

		for (int num : nums) {
			insert(num);
		}
	}

	public void createTree5() {
		int[] nums = { 50, 30, 70, 10, 20, 25, 40, 45, 60, 55, 65 };

		for (int num : nums) {
			insert(num);
		}
	}

	public void createTree6() {
		int[] nums = { 40, 20, 70, 30, 25, 35, 32, 55, 85, 80 };

		for (int num : nums) {
			insert(num);
		}
	}

	public void insert(int new_data) {
		if (root == null) {
			root = new Node(new_data);
		} else {
			Node current_node = root;

			while (true) {
				if (new_data < current_node.data) {
					if (current_node.left == null) {
						current_node.left = new Node(new_data);
						break;
					}
					current_node = current_node.left;
				} else {
					if (current_node.right == null) {
						current_node.right = new Node(new_data);
						break;
					}
					current_node = current_node.right;
				}
			} // end while
		} // end outer-else
	} // end method

	public void searchDelete(int target) {
		Queue<Node> queue = new ArrayDeque<Node>();
		queue.add(root);

		while (!queue.isEmpty()) {
			int levelSize = queue.size();
			

			for (int i = 0; i < levelSize; i++) {
				Node current_node = queue.poll();
				parent = current_node;
				
				if (parent.data == target) {
					deleteNode = parent;
					search = parent;
					break;
				}
				if (current_node.left != null) {
					if (current_node.left.data == target) {
						deleteNode = current_node.left;
						search = current_node.left;
						queue.clear();
						break;
					} 
					queue.add(current_node.left);
				}
				if (current_node.right != null) {
					if (current_node.right.data == target) {
						deleteNode = current_node.right;
						search = current_node.right;
						queue.clear();
						break;
					}
					queue.add(current_node.right);
				}
			} // end for
		} // end while
	} // end method
	
	public void delete(int target) {
		searchDelete(target);
		if (root == null) {
			System.out.println("Empty Tree");
		} else if (deleteNode == null) {
			System.out.println("Cannot found the delete node");
		} else {
			// Case 1: Delete Leaf Node
			if (deleteNode.left == null && deleteNode.right == null) {
				if (parent.left != null && parent.left.data == target) {
					parent.left = null;
				} else {
					parent.right = null;
				}
			}
			// Case 2: Delete a node with only 2 children
			else if (deleteNode.left != null && deleteNode.right != null) {
				Node successorParent = deleteNode;
				Node successor = deleteNode.right; // focus on right-subtree
				
				while (successor.left != null) { // find the left-leaf node
					successorParent = successor;
					successor = successor.left;
				}
				
				deleteNode.data = successor.data; 
				
				if (successorParent.left == successor) {
					successorParent.left = successor.right;
				} else {
					successorParent.right = successor.right;
				}
			}
			// Case 3: Delete a node with only 1 child
			else {
				if (deleteNode.left != null) { // has a left child
					if (parent.left != null && parent.left.data == deleteNode.data) {
						parent.left = deleteNode.left;
					} else {
						parent.right = deleteNode.left;
					}
				} else {
					if (parent.left != null && parent.left.data == deleteNode.data) {
						parent.left = deleteNode.right;
					} else {
						parent.right = deleteNode.right;
					}
				}
			}
		}
	}
}
