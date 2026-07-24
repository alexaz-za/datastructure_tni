import java.util.LinkedList;

public class ShoppingCart {

	public static void main(String[] args) {
		LinkedList<String> cart = new LinkedList<String>();
		
		cart.add("Wireless Mouse"); // No.1
		cart.add("Mechanical Keyboard"); // No.2
		cart.add("USB-C Hub"); // No.3
		System.out.println(cart); // No.4
		
		cart.add(1, "Mouse Pad"); // No.5
		System.out.println(cart); // No.6
		
		cart.removeLast(); // No.7
		System.out.println(cart); // No.8
		
		cart.remove("Mouse Pad"); // No.9
		System.out.println(cart); // No.10
		
		cart.addLast("Monitor"); // No.11
		System.out.println(cart); // No.12
		
		cart.set(2, "Phone Holder"); // No.13
		System.out.println(cart); // No.14
		
		System.out.println(cart.getLast()); // No.15
	}

}
