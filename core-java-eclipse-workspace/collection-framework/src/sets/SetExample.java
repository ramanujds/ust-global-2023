package sets;

import java.util.HashSet;
import java.util.Set;


public class SetExample {

	public static void main(String[] args) {
		
		// HashSet is unique
		// It doesn't follow any order
		
		Set<Integer> nums = new HashSet<>();
		
		// In TreeSet all the elements will be sorted
		
		// LinkedHashSet follows the order of insertion
		
		nums.add(10);
		nums.add(100);
		nums.add(20);
		nums.add(500);
		nums.add(150);
		nums.add(20);
		nums.add(500);
		nums.add(150);
		
		System.out.println(nums);
		
		
	}
	
}
