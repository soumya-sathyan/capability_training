
public class MergeTwoSortedArray {

	public static void main(String[] args) {
		int num1[]= {3,8,12,23,100};
		int num2[]= {1,2,8,27,36,42,95};
		int m = num1.length;
		int n=num2.length;
		int mergedArray[]=new int[m+n];
		
		int i=0,j=0,k=0;
		while(i<num1.length&& j<num2.length) {
			if(num1[i]<num2[j]) {
				mergedArray[k]=num1[i];
				i++;
			}else {
				mergedArray[k]=num2[j];
				j++;
			}
			k++;
		}
		while(i<num1.length) {
			mergedArray[k]=num1[i];
			k++;
			i++;
		}
		while(j<num2.length) {
			mergedArray[k]=num2[j];
			k++;
			j++;
		}
		
		displayArray(mergedArray);

	}
	private static void displayArray(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		
	}

}
