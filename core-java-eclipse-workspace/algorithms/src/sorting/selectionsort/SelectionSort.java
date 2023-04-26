package sorting.selectionsort;

public class SelectionSort {

	public static void main(String[] args) {
		
		int []arr= {5,2,6,1,3};
		System.out.println("Before Sorting.. ");
		for(int element:arr) {
			System.out.print("    "+element);
		}
		System.out.println();
		int[] sortedArr=selectionSort(arr);
		System.out.println("After Sorting.. ");
		for(int element:sortedArr) {
			System.out.print("    "+element);
		}
		System.out.println();
	}
	
	public static int[] selectionSort(int []arr) {
		int length=arr.length;
		
		for(int i=0; i<length; i++) {
			int min=i;
			for(int j=i+1;j<length; j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		
		
		return arr;
	}
	
	
}

