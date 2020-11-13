import java.util.HashMap;
import java.util.Map;

public class PrintDuplicateChars {

	public static void main(String[] args) {
		String str = "abbcdddeecfghikkll";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			} else {
				map.put(str.charAt(i), 1);
			}

		}
		System.out.println("Duplicate characters are");
		for (Map.Entry entry : map.entrySet()) {
			if ((Integer) entry.getValue() > 1) {
				System.out.println(entry.getKey());
			}

		}

	}

}
