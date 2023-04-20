package lists;
import java.util.*;

public class CollectionExample {

	public static void main(String[] args) {
		
		Collection<Integer> items = new ArrayList<>();
		items.add(100);
		items.add(200);
		items.add(300);
		items.add(200);
		items.add(300);
		items.add(200);
		items.add(300);
		items.remove(500);
		
		
		for(int num:items) {
			System.out.println(num);
		}
		
		
	}
	
}
