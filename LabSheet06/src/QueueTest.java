import java.util.ArrayDeque;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {

		QueueLinkedList q = new QueueLinkedList();

		q.enqueue(10);
		q.enqueue(11);
		q.enqueue(12);

		System.out.println("Next queue => " + q.peek());
		System.out.println("Call queue => " + q.dequeue());
		System.out.println("Next queue => " + q.peek());
		
		Queue<Integer> q2 = new ArrayDeque<Integer>();
	}

}
