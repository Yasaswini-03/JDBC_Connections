package Collections.sets;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class queues {
	public static void main(String[] args) {
		Queue<String> q = new LinkedList<String>();
		q.add("apple");
		q.add("banana");
		q.offer("kiwi");
		q.offer("orange");
		q.offer("grapes");
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.contains("watermelon"));
		Iterator<String> q1 = q.iterator();
		while (q1.hasNext()) {
			System.out.println(q1.next());
			
		}
		
	}

}
