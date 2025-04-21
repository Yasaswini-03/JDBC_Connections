package Collections.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ListIterators {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<String> li = new ArrayList<String>();
		a.add(100);
		a.add(200);
		a.add(300);
		a.add(400);
		a.add(500);
		a.add(600);
		a.add(700);
		li.add("one");
		li.add("two");
		li.add("three");
		li.add("four");
		li.add("five");
		System.out.println(li);
		System.out.println(a);
		Iterator<Integer> i = a.iterator();
		while(i.hasNext()) {
			Integer i1 = i.next();
			System.out.println(i1);
			if(i1 == 200) {
				System.out.println("removing the element 200");
				i.remove();
			}
		}
		System.out.println(a);
		Iterator<String> s = li.iterator();
		while(s.hasNext()) {
			String s1 = s.next();
			if(s1.equals("one")) {
				s.remove();
				
			}
			}
		System.out.println(li);
	}

}
