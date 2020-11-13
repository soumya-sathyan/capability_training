
public class ReverseStringReursion {

	public static void main(String[] args) {
		String s = "Niharika";
		
		String reverse=reverseRecusrive(s);
		System.out.println(reverse);

	}

	private static String reverseRecusrive(String s) {
		if(s.length()<=0) {
			return s;
		}
		
		return (new StringBuilder(reverseRecusrive(s.substring(1))).append(s.charAt(0)).toString());
	}

}
