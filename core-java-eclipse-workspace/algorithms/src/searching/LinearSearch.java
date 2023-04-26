package searching;

public class LinearSearch {

	public static void main(String[] args) {
		
		int []arr= {10,5,6,2,8,9};
		int index=linearSearch(arr, 7);
		System.out.println(index);
		

	}
	
	public static int linearSearch(int []arr, int item) {
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==item) {
				return i;
			}
		}
		
		return -1;
	}

}
