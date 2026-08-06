import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class LabQueue01 {

	public static void main(String[] args) {
		Queue<Integer> enqueue = new ArrayDeque<Integer>();
		
		for (int i=101; i<=105; i++) {
			System.out.println("Enqueue: " + i);
			enqueue.add(i);
		}
		
		System.out.println("Queue => " + enqueue);
		
		while (enqueue.isEmpty() == false) {
			System.out.println("\nCalling number: " + enqueue.peek());
			System.out.println("Providing service number: " + enqueue.poll());
		}
		System.out.println("\nQueue => " + enqueue);
	}

}
