package Collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Listiterator_1 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<Integer> l = new ArrayList<>(Arrays.asList(10,20,30,40,50));
		al.add(454);
		al.add(225);
		al.add(312);
		al.add(798);
		al.add(243);
		System.out.println(al);
		System.out.println(l );
		Collections.sort(al);
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
		Collections.shuffle(al);
		System.out.println(al);
		System.out.println(Collections.min(al));
		System.out.println(Collections.max(al));
	}
}
