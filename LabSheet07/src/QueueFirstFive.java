import java.util.ArrayDeque;
import java.util.Queue;

public class QueueFirstFive {

	public static void main(String[] args) {
		Queue<Integer> n_queue = new ArrayDeque<Integer>();
		int count = 0;
		for (int i = 101; i <= 110; i++) {
			n_queue.add(i);
			count++;
		}
		System.out.println("Queue => " + n_queue);
		int i = 0;
		while (!n_queue.isEmpty()) {
			int currentQueue = n_queue.poll();
			
			if (i < 5) {
				System.out.println(currentQueue);
			}
			
			i++;
			n_queue.add(currentQueue);
			if (i == count) break;
		}
		System.out.println("Queue => " + n_queue);
	}

}
