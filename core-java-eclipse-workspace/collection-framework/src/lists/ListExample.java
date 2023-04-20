package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		
//		List<String> names = new ArrayList<>();
		
		// Creating a fixed list
		List<String> names = Arrays.asList("Harsh","Mohit","Suraj","Rahul","Priya");
		
//		names.add("Harsh");
//		names.add("Suraj");
//		names.add("Priya");
//		names.add("Manish");
//		names.add(1, "Rohit"); // insert a new name in the 1th index
//		names.remove(2); // remove index 2
		
		int total = names.size();
		System.out.println("Total items : "+total);
		
		System.out.println(names.get(3));
		// How to sort
		Collections.sort(names);
		
		System.out.println(names);
		
		boolean checkName = names.contains("Manish");
		System.out.println(checkName);
		
		System.out.println(names.get(3));
		
		
	}
}
