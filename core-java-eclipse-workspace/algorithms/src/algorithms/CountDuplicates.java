package algorithms;

import java.util.Arrays;

public class CountDuplicates {

	public static void main(String[] args) {
		
		int []arr1= {2,5,3,6,7};	
		int []arr2= {4,2,6,8,9};
		
		
		
		int total=countDuplicate(arr1, arr2);
		System.out.println(total);
	}
	
	
	public static int countDuplicate(int []arr1, int []arr2) {
		
		int count=0;
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		
		for(int i=0,j=0; i<arr1.length && j<arr2.length; ) {
			
			if(arr1[i]==arr2[j]) {
				count ++;
				i++;
				j++;
			}
			else if(arr1[i]<arr2[j]) {
				i++;
			}
			else {
				j++;
			}
		}
		
		
		
//		for(int i:arr1) {
//			for(int j:arr2) {
//				if(i==j) {
//					count++;
//				}
//			}
//			
//		}
		
//		

		
		
		
		
		return count;
	}

}
