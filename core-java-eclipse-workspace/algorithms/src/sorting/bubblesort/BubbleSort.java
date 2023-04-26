package sorting.bubblesort;

public class BubbleSort {

	public static void main(String[] args) {
		
		int []arr= {5,2,6,1,3};
		System.out.println("Before Sorting.. ");
		for(int element:arr) {
			System.out.print("    "+element);
		}
		System.out.println();
		int[] sortedArr=bubbleSort(arr);
		System.out.println("After Sorting.. ");
		for(int element:sortedArr) {
			System.out.print("    "+element);
		}
		System.out.println();
		
	}
	
	public static int[] bubbleSort(int []arr) {
		
		int length=arr.length;
		
		for(int i=0; i<length-1; i++) {
			for(int j=i+1; j<length; j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		return arr;
	}
	
}
