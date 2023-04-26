package maps;

import java.util.HashMap;
import java.util.Map;

public class MapsExample {

	public static void main(String[] args) {
		
		Map<Integer, String> numberMap = new HashMap<>();
		
		numberMap.put(1, "Anil");
		numberMap.put(20, "Rohit");
		numberMap.put(100, "Suraj");
		numberMap.put(4, "Rohit");
		numberMap.put(1, "Mohit");
		numberMap.put(15, "Harsh");
		
		for(int key:numberMap.keySet()) {
			System.out.println(key+" - "+numberMap.get(key));
		}
		
	}
}
