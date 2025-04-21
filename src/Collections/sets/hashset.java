package Collections.sets;

import java.util.HashSet;

public class hashset {
	public static void main(String[] args) {
		HashSet<String> h = new HashSet<String>();
		h.add("sets");
		h.add("lists");
		h.add("tuples");
		h.add("queues");
		h.add("maps");
		System.out.println(h);
//		h.clone();
		System.out.println(h.clone());
		h.remove("lists");
		System.out.println(h);
//		h.forEach(e-> {
//			System.out.println(e);
//		});
		HashSet<String> h1 = new HashSet<String>();
		h1.add("Arrays");
		h1.add("yashu");
		h1.add("pavan");
		h1.addAll(h);
		System.out.println(h1);
		System.out.println(h1.hashCode());
		System.out.println(h.hashCode());
		h1.retainAll(h);
		System.out.println(h1);
		System.out.println(h.isEmpty());
		System.out.println(h.size());
		System.out.println(h.contains("sets"));
		
	} 

}
