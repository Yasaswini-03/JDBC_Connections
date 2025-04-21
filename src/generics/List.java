package generics;

import java.io.InputStream;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class List {
	public static void main(String[] args) {
		java.util.List<String> L = Arrays.asList("name","yasaswini","preethi","joshnavi");
		Stream<Integer> I = Stream.of(1,2,3);
		IntStream t = IntStream.range(1,2);
		L.stream()
		.map(String::toUpperCase)
		.sorted()
		.filter(name -> name.startsWith("Y"))
		.forEach(System.out::println);
		System.out.println();
		
		
	}

}
