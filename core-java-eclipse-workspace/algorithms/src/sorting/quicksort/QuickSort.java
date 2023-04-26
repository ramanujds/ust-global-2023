package sorting.quicksort;

public class QuickSort {

	public static void main(String[] args) {
		int []arr= {10,5,6,8,9};
		
		quickSort(arr,0,arr.length-1);
		
		for(int element:arr) {
			System.out.print(element+"    ");
		}

	}
	
	
	public static void quickSort(int []inputArr, int start, int end) {
		if(start<end) {
			int q=partition(inputArr, start, end);
			quickSort(inputArr, start, q-1);
			quickSort(inputArr, q+1, end);
		}
		
	}
	
	public static int partition(int []inputArr, int start, int end) {
		
		int pivot=inputArr[end];
		
		int i=start-1;
		for(int j=start; j<=end-1; j++) {
			if(inputArr[j]<=pivot) {
				i++;
				int iVal=inputArr[i];
				int jVal=inputArr[j];
				inputArr[i]=jVal;
				inputArr[j]=iVal;
			}
		}
		i++;
		int iVal=inputArr[i];
		inputArr[end]=iVal;
		inputArr[i]=pivot;
		
		return i;
	}
	
	

}
