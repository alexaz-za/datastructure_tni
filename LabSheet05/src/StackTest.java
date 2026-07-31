import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		
		StackLinkedList stacks = new StackLinkedList();
		
		stacks.push(10);
		stacks.push(11);
		stacks.push(12);
		
		System.out.println(stacks.peek());
		System.out.println(stacks.pop()); // return top element and remove
		System.out.println(stacks.peek()); // show top element
	}

}
