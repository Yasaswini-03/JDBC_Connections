package Collections.sets;

import java.util.Iterator;
import java.util.TreeSet;

public class tree_set {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(1);
		ts.add(5);
		ts.add(10);
		ts.add(15);
		System.out.println(ts);
//		ts.pollFirst();
//		System.out.println(ts);
//		ts.pollLast();
//		System.out.println(ts);
		System.out.println(ts.higher(5));
		System.out.println(ts.lower(10));
		System.out.println(ts.headSet(10,true));
		System.out.println(ts.tailSet(5));
		System.out.println(ts.subSet(5, 15));
		System.out.println(ts.ceiling(12));
		System.out.println(ts.floor(12));
		System.out.println(ts.descendingSet());
		System.out.println(ts.last());
		System.out.println(ts.first());
		Iterator<Integer> it = ts.descendingIterator();
		while (it.hasNext()) {
		    System.out.println(it.next());
		}

	}

}
