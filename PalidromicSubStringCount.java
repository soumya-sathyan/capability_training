
public class PalidromicSubStringCount {

	public static void main(String[] args) {
		String str ="abbaacca";
		int count =0;
		for(int i=0;i<str.length()-1;i++) {
			for(int j=i;j<=str.length()-2;j++) {
				if(isPalindrome(str.substring(i, j+2))) {
					System.out.println(str.substring(i, j+2));
					count++;
				}
			}
		}
		System.out.println("Palindromic substring count="+count);
	}

	private static boolean isPalindrome(String str) {
		
		int j = str.length()-1;
		boolean isTrue = true;
		for(int i=0;i<str.length()/2;i++) {
			if(str.charAt(i)!=str.charAt(j)) {
				isTrue=false;
				break;
			}
			j--;
		}
		
		return isTrue;
	}

}
