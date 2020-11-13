
public class ReverseSentence {

	public static void main(String[] args) {
		String sentence= "Hi Good morning All";
		
		String[] strArray=sentence.split("\\s");
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=strArray.length-1;i>=0;i--) {
			sb.append(strArray[i]);
			if(i!=0) {
				sb.append(" ");
			}
		}
		System.out.println(sb.toString());

	}

}
