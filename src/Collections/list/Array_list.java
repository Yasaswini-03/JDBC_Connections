package Collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Array_list {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		ArrayList<Integer> al = new ArrayList<Integer>();
		li.add(556);
		li.add(123);
		li.add(456);
		System.out.println(li);
//		for
		for(int i = 0;i<li.size();i++) {
			System.out.println(li.get(i));
		}
		
//		for-each approach
		li.forEach(e -> {
			System.out.println(e);
		});
//		iterator approach
		Iterator<Integer> i = li.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
//		listIterator
		ListIterator<Integer> i1 = li.listIterator(li.size());
		while(i1.hasPrevious()) {
			System.out.println(i1.previous());
		}
		li.add(1,789);
		System.out.println(li);
		li.remove(2);
		System.out.println(li);
		
		al.add(23);
		al.add(12);
		al.add(22);
		System.out.println(al);
//		li.addAll(al);
//		System.out.println(li);
//		li.addAll(2, al);
//		System.out.println(li);
//		li.retainAll(al);
//		System.out.println(li);
//		li.removeAll(al);
//		System.out.println(al);
		Collections.sort(li);
		System.out.println(li);
		Collections.sort(al);
		System.out.println(al);
		
		System.out.println(li.isEmpty());
		System.out.println(li.size());
		li.set(1, 807);
		System.out.println(li);
		
		System.out.println(li.indexOf(789));
		System.out.println(li.contains(15));
		li.clear();
		System.out.println(li);
	}

}
