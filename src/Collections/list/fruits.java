package Collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class fruits {  
	public static void main(String[] args) {
		List<String> l1 = new ArrayList<String>();
		List<String> l2 = new ArrayList<String>();
		l1.add("apple");
		l1.add("mango");
		l1.add("orange");
		l1.add("grapes");
		l1.add("kiwi");
		l1.addAll(Arrays.asList("watermelon","muskmelon","avacado"));
		
		l2.add("spinach");
		l2.add("brinjal");
		l2.add("cucumber");
		l2.add("tomato");
		l2.add("onions");
		l2.add("apple");
		System.out.println(l1);
		System.out.println(l2);
//		for (int i = 0;i<l1.size();i++) {
//			System.out.println(l1.get(i));
//		}
		
		l1.addAll(l2);
		System.out.println(l1);
		Collections.sort(l1);
		System.out.println(l1);
		
		
		l1.retainAll(l2);
		System.out.println(l1);

//		System.out.println(l1.isEmpty());
//		System.out.println(l2.size());
		System.out.println(l1.indexOf("apple"));
		System.out.println(l1.contains("apple"));
	}

}
