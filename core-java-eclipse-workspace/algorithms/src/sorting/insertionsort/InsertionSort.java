package sorting.insertionsort;

public class InsertionSort {

	public static void main(String[] args) {
		
		int []arr= {10,2,6,1,3};
		System.out.println("Before Sorting.. ");
		for(int element:arr) {
			System.out.print("    "+element);
		}
		System.out.println();
		int[] sortedArr=insertionSort(arr);
		System.out.println("After Sorting.. ");
		for(int element:sortedArr) {
			System.out.print("    "+element);
		}
		System.out.println();

	}
	
	public static int[] insertionSort(int[] arr) {
		
		for(int i=1;i<arr.length; i++) {
			int element=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>element) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=element;
		}
		
		return arr;
	}

}
