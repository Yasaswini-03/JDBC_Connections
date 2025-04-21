package Collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class collection {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,50));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		Collections.shuffle(list);
		System.out.println(list);
		System.out.println(Collections.min(list));
		System.out.println(Collections.max(list));
		int index = Collections.binarySearch(list, 30);
		System.out.println(index);
		Collections.swap(list, 0, list.size()-1);
		System.out.println(list);
		List<String> list2 = new ArrayList<>(Arrays.asList("welcome","to","techm","training"));
		System.out.println(list2);
		Collections.fill(list2, "thankyou");
		System.out.println(list2);
		
		List<String> l3 = new ArrayList<>(Arrays.asList("ab","cd","ef","gh"));
		Collections.copy(l3, list2);
		System.out.println(l3);
		System.out.println(list2);
		
		System.out.println(Collections.frequency(list2, "thankyou"));
	}

}
