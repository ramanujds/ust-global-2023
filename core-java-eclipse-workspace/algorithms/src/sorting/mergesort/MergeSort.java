package sorting.mergesort;

public class MergeSort {
	
	
	
	public static void main(String[] args) {
		int []arr= {10,5,6,8,9};
		
		sort(arr);
		
		for(int element:arr) {
			System.out.print(element+"    ");
		}
	}
	
	public static void sort(int []inputArr) {
		sort(inputArr,0,inputArr.length-1);
	}

	public static void sort(int[] inputArr, int start, int end) {
		if(end<=start) {
			return;
		}
		
		int mid=(start+end)/2;
		sort(inputArr,start,mid);
		sort(inputArr, mid+1,end);
		
		merge(inputArr, start, mid, end);
		
	}
	
	
	public static void merge(int[] inputArr, int start, int mid, int end) {
		
		int[] tempArray=new int[(end-start)+1];
		
		int leftSlot=start;
		int rightSlot=mid+1;
		int k=0;
		
		while(leftSlot<=mid && rightSlot<=end) {
			if(inputArr[leftSlot]<inputArr[rightSlot]) {
				tempArray[k]=inputArr[leftSlot];
				leftSlot++;
			}
			else {
				tempArray[k]=inputArr[rightSlot];
				rightSlot++;
			}
			k++;
			
		}
		
		 
			while(leftSlot<=mid) {
				tempArray[k]=inputArr[leftSlot];
				leftSlot++;
				k++;
			}
		
		
			while(rightSlot<=end) {
				tempArray[k]=inputArr[rightSlot];
				rightSlot++;
				k++;
			}
		
		
		for(int i=0; i<tempArray.length; i++) {
			inputArr[start+i]=tempArray[i];
		}
		
	}
	
	
}
