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
	// Find all the even numbers
	static List<Integer> findAllEven(List<Integer> a) {
		List<Integer> evenArr = new ArrayList<>();
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) % 2 == 0) {
				evenArr.add(a.get(i));
			}
		}
		return evenArr;
	}
	// Multiply the even numbers by 3
	static List<Integer> multiplyEven(List<Integer> a) {
		List<Integer> mulArr = new ArrayList<>();
		for (int i = 0; i < a.size(); i++) {
			int num = a.get(i) * 3;
			mulArr.add(num);
		}
		return mulArr;
	}
	// Add the numbers after multiplication
	static int add(List<Integer> a) {
		int sum = 0;
		for (int i = 0; i < a.size(); i++) {
			sum = sum + a.get(i);
		}
		return sum;
	}

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
