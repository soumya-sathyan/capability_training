import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {

	public static void main(String[] args) {
		//String actulString ="aaaaasssBBcccccbbtkkknnn";
		//String actulString ="aallkkkkk";
		String actulString="XXYYZZ";
		String str=actulString.toLowerCase();
		Map<Character,Integer> charsCountMap=new HashMap<Character,Integer>();
		String startingStr = "", centerString = "", endingStr = ""; 
	        for (int i = 0; i < str.length(); i++) { 
	        	if(charsCountMap.containsKey(str.charAt(i))) {
	        		charsCountMap.put(str.charAt(i),charsCountMap.get(str.charAt(i)).intValue()+1);
	        	}else {
	        		charsCountMap.put(str.charAt(i),1);
	        	}
	        }
	        char ch  =getCentralCharacter(charsCountMap);
	        
	        centerString = String.valueOf(ch);
		
		for (Map.Entry<Character, Integer> mapEntry : charsCountMap.entrySet()) {
			
			int len = mapEntry.getValue() / 2;
			
			if(mapEntry.getKey().equals(ch)) {
				len = (mapEntry.getValue()-1) / 2;
			}
			for (int i = 0; i < len; i++) {
				startingStr += mapEntry.getKey();
			}

		}
	       
	        endingStr = reverseString(startingStr); 
	        int len = (startingStr+centerString.trim()+endingStr).length();
	        System.out.println("Largest Palindrom="+startingStr+centerString.trim()+endingStr);
	        System.out.println("Length of largest Palindrome="+len);

	}

	

	private static char getCentralCharacter(Map<Character, Integer> charsCountMap) {
		 int oddNumStringCount=0;
		 char centralCh = 0;
		for (Map.Entry<Character, Integer> mapEntry : charsCountMap.entrySet()) {
			if (mapEntry.getValue() % 2 == 1 && (oddNumStringCount==0 || oddNumStringCount > mapEntry.getValue())) {
				centralCh = mapEntry.getKey();
				oddNumStringCount = mapEntry.getValue();
			}
			
			
		}
		return centralCh;
	}



	private static String reverseString(String endingStr) {
		// TODO Auto-generated method stub
		StringBuilder st = new StringBuilder();
		
		for (int i = endingStr.length() - 1; i >= 0; i--) {
			st.append(endingStr.charAt(i));
		}
        return st.toString(); 
	}

}
