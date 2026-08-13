import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class QueueRotate {
	public static Queue<Integer> queue = new ArrayDeque<Integer>();
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		originalQueue();
		while (true) {
			System.out.print("\nPress 1 to rotate queue: ");
			int num = input.nextInt();
			if (num == 1) {
				rotateQueue();
				System.out.println("Queue => " + queue);
			} else break;
		}
		System.out.println("Exit");
	}
	
	public static void rotateQueue() {
		System.out.println("Calling queue: " + queue.peek());
		queue.add(queue.poll());
	}
	
	public static void originalQueue() {
		for (int i = 101; i <= 107; i++) {
			queue.add(i);
		}
		System.out.println("Queue => " + queue);
	}

}
