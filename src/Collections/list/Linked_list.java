package Collections.list;

import java.util.LinkedList;
import java.util.List;

public class Linked_list {
	public static void main(String[] args) {
		List<String> l = new LinkedList<String>();
		l.add("yashu");
		l.add("Yasaswini");
		System.out.println(l);
		l.addFirst("vijji");
		System.out.println(l);
		l.addLast("pavan");
		System.out.println(l);
		l.removeFirst();
		System.out.println(l);
		l.removeLast();
		System.out.println(l);
	}

}
