public class FirstNonRepeatedChar {

	public static void main(String[] args) {
		String str = "bbcdddeecfghikkll";
		
		int index=-1;
		for (int i = 0; i < str.length(); i++) {
			boolean flag=false;
			for(int j=0;j< str.length(); j++) {
				if(str.charAt(i)==str.charAt(j) && i!=j) {
					flag =true;
					break;
				}
				
			}
			if(!flag) {
				index=i;
				break;

			}
			

		}
		if(index>0) {
			System.out.println("First nonrepeated char="+str.charAt(index));
		}else {
			System.out.println("First nonrepeated char= ");
		}
		
		

	}

}
