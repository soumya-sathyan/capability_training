import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortMatrixDiagonally {

	public static void main(String[] args) {
		         
		
		int a[][]= {{2,3,5,1},{2,4,1,2},{1,8,1,3},{5,3,4,7}};
		
		Map<Integer,List<Integer>> diagMap= new HashMap<Integer,List<Integer>>();
		
		int m=3,n=4;
		System.out.println("Matrix before sorting");
		displayMatrix(a,m,n);
		//Storing diagonal elements in a map
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(diagMap.containsKey(j-i)) {
					 diagMap.get(j-i).add(a[i][j]);
				}else {
					List<Integer> arrayList =new ArrayList<Integer>();
					arrayList.add(a[i][j]);
					diagMap.put(j-i, arrayList);
				}
			}
			
			
		}
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				List<Integer> arrayList =diagMap.get(j-i);
				Collections.sort(arrayList);
				a[i][j]=arrayList.get(0);
				arrayList.remove(0);
				diagMap.put(j-i, arrayList);
			}
			
		}
		System.out.println("\nMatrix After sorting");
		displayMatrix(a,m,n);
		

	}

	private static void displayMatrix(int[][] a, int m, int n) {
		for(int i=0;i<m;i++) {
			System.out.println();
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j]+" ");
			}
		}
		
	}

}
