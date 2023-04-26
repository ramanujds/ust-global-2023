package maps;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {

	public static void main(String[] args) {

		String str = "harsha";
		char[] chars = str.toCharArray();

		Map<Character, Integer> occurrences = new HashMap();

		for (char c : chars) {
			if (!occurrences.containsKey(c)) {
				occurrences.put(c, 1);
			} else {
				int count = occurrences.get(c) + 1;
				occurrences.put(c, count);
			}

		}
		System.out.println(occurrences);

	}
}
