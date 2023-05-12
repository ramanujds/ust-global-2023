package stramapi;

import java.util.List;
import java.util.stream.Stream;

public class StreamFilter {

	public static void main(String[] args) {

		// Stream<Integer> nums = Stream.of(10,20,30,40,50);

		List<Integer> nums = List.of(10, 20, 30, 40, 50);

		Stream<Integer> numStream = nums.stream();

		// filter(Predicate)
		// boolean test(arg)
		// i -> i%20==0
		

		numStream.filter(i -> i % 20 == 0).forEach(i -> System.out.println(i));

		List<String> names = List.of("Rahul", "Suraj", "Rohit", "Manish", "Raj");

		// Print all the names start with R

		names.stream().filter(s -> s.startsWith("R"))
						.map(String::toUpperCase)
						.filter(s -> s.length() >= 5)
						.forEach(System.out::println);

		// Print all the names Having more than 5 chars
//
//		names.stream().filter(s -> s.length() >= 5)
//						.forEach(s -> System.out.println(s));

	}

}
