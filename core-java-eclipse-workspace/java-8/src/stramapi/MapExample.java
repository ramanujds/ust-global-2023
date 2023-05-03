package stramapi;

import java.util.List;

public class MapExample {

	public static void main(String[] args) {
		
		List<Integer> nums = List.of(2,3,4,5,6);
		
		// Square all the numbers in the list
		
		// map(Function)
		
		// T apply(T arg)
		
		nums.stream()
					.map(e -> e*e)
						.forEach(e->System.out.println(e));
		
		
		List<String> names = List.of("Rahul", "Suraj", "Rohit", "Manish", "Raj");
	
		// Covert each name to uppercase
		
		names.stream().map(s->s.toUpperCase()).
						forEach(e->System.out.println(e));
		
		
		
	}
	
	
	
}
