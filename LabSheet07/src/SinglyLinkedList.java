
class Node {
	public int data;
	public Node next;

	public Node(int value) {
		this.data = value;
		this.next = null;
	}
}

public class SinglyLinkedList {
	private Node head;
	private Node tail;

	public SinglyLinkedList() {
		head = null;
		tail = null;
	}

	public String displayList() {
		boolean first = true;
		String display = "[";
		for (Node current = head; current != null; current = current.next) {
			display += (!first ? ", " : "") + current.data;
			first = false;
		}
		display += "]";
		return display;
	}

	public void clear() {
		head = null;
		tail = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void append(int value) {
		Node new_node = new Node(value);
		if (head == null) {
			head = new_node;
			tail = new_node;
		} else {
			tail.next = new_node;
			tail = new_node;
		}
	}

	public Object get(int position) {
		Node current_node = head;
		int current_position = 0;

		if (!isEmpty()) {
			while (current_node != null && current_position < position) {
				current_node = current_node.next;
				current_position++;
			}
			if (current_node == null) return null;
			return current_node.data;
		} else {
			return null;
		}
	}

	public void set(int position, int value) {
		Node current_node = head;
		int current_position = 0;

		while (current_node != null && current_position < position) {
			current_node = current_node.next;
			current_position++;
		}
		if (current_node != null) {
			current_node.data = value;
			System.out.println("Updated data success!!");			
		} else System.out.println("Updated data fail...");
	}

	public boolean contains(int value) {
		Node current_node = head;
		if (!isEmpty()) {
			while (current_node != null && current_node.data != value) {
				current_node = current_node.next;	
			}
			if (current_node != null) return true;
			return false;
		}
		return false;
	}

	public void addAll(SinglyLinkedList otherlist) {
		if (head == null) {
			head = otherlist.head;
			tail = otherlist.tail;
		}
		else if (!isEmpty() && !otherlist.isEmpty()) {
			tail.next = otherlist.head;
			tail = otherlist.tail;
		}

	}

}
