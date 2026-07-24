import java.util.LinkedList;

public class BrowserHistory {

	public static void main(String[] args) {
		LinkedList<String> history = new LinkedList<String>();
		
		history.add("google.com"); // No.1
		history.add("youtube.com"); // No.2
		history.add("github.com"); // No.3
		System.out.println(history); // No.4
		
		history.removeLast(); // No.5
		System.out.println(history); // No.6
		
		history.add("shopee.com"); // No.7
		history.add("wikipedia.org"); // No.8
		history.add("claude.ai"); // No.9
		System.out.println(history); // No.10
		
		history.remove("youtube.com"); // No.11
		System.out.println(history); // No.12
		
		System.out.println("current page = " + history.getLast()); // No.13
		
		System.out.println("Visited youtube.com = " + history.contains("youtube.com")); // No.14
		
		System.out.println("Go back to previous page = " + history.get(history.size() - 2)); // No.15
		
		System.out.println("Go back to previous page again = " + history.get(history.size() - 3)); // No.16
		
		history.clear(); // No.17
		System.out.println(history); // No.18
	}

}
