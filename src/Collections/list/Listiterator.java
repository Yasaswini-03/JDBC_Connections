package Collections.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class Listiterator {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		System.out.println(al);
		ListIterator<Integer> li = al.listIterator();
		while(li.hasNext()) {
			System.out.println("Index:"+li.nextIndex() + "Name:" + li.next());
		}
		while(li.hasPrevious()) {
			System.out.println("Index:"+li.previousIndex() + "Name:" + li.previous());
		}
		while(li.hasNext()) {
			Integer i = li.next();
			if(i == 4) {
				li.set(7);
				li.add(13);
			}
			if(i == 3) {
				li.remove();
			}
		}
		System.out.println(al);
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("yasaswini");
		arr.add("preethi");
		arr.add("jansi");
		arr.add("sindhu");
		arr.add("prasanna");
		arr.add("harshitha");
		System.out.println(arr);
		ListIterator<String> l1 = arr.listIterator();
		while(l1.hasNext()) {
			System.out.println("Index:"+l1.nextIndex() + "Name:" +l1.next());
		}
		while(l1.hasPrevious()) {
			System.out.println("Index:"+l1.hasPrevious() + "Name:" +l1.previous());
		}
		while(l1.hasPrevious()) {
			String s = l1.previous();
			if(s.equals("harshitha")) {
				l1.set("riya");
			}
		}
		System.out.println(arr);
	}

}
