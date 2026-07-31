import java.util.Stack;

public class LabStack02 {

	public static void main(String[] args) {
		int[] cart = {1,2,3,4,5};
		
		Stack<Integer> stacks = new Stack<>();
		
		for (int carts : cart) {
			stacks.push(carts);
			System.out.println("Push in track : " + carts);
		}
		
		System.out.println("Train car after into dead-end track : " + stacks + "\n");
		
		for (int i = 0; i < cart.length; i++) {
			System.out.println("Pop from track: " + stacks.pop());
		}
		
		System.out.println("Train car after out of dead-end track : " + stacks);
	}

}
