package Collections.sets;

import java.util.HashMap;
//import java.util.Iterator;
//import java.util.ListIterator;
import java.util.Map;
import java.util.TreeMap;

public class maps {
	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<Integer, String>();
		Map<Integer,String> m1 = new TreeMap<Integer, String>();
		m.put(1,"one");
		m.put(2, "two");
		m.put(3, "three");
		System.out.println(m); 
		System.out.println(m.get(3));
		System.out.println(m.containsKey(3));
		System.out.println(m.containsValue("six"));
		m.remove(3);
		System.out.println(m);
		m1.put(4, "four");
		m1.put(5, "five");
		System.out.println(m1);
//		System.out.println(m.);
		
	}

}
