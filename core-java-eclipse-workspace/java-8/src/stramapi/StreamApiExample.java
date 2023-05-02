package stramapi;

import java.util.ArrayList;
import java.util.List;

// List of numbers



// Show the final output

// 3 6 5 4 2 7
// 6 4 2
// 18 12 6
// 36


public class StreamApiExample {
	
	public static void main(String[] args) {
		
		List<Integer> arr = List.of(3, 6, 5, 4, 2, 7);
		System.out.println("Original List "+arr);
		List<Integer> evens = arr.stream().filter(i->i%2==0).toList();
		System.out.println("Filtered List "+evens);
		List<Integer> multiplied = evens.stream().map(i->i*3).toList();
		System.out.println("Modified List "+multiplied);
		int result = multiplied.stream().reduce((x,y)->x+y).get();
		System.out.println("Final output");
		System.out.println(result);
		
	}
	
}
