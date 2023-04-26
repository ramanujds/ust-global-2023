package searching;

public class BinarySearch {

	public static void main(String[] args) {
		
		int []arr= {5,7,10,15,20,22,35};
		int index=binarySearch(arr, 35);
		System.out.println(index);
		

	}
	
	public static int binarySearch(int []arr, int item) {
		
		int p=0;
		int r=arr.length-1;
		int q;
		while(p<=r) {
			q=(p+r)/2;
			if(arr[q]==item) {
				return q;
			}
			else if(arr[q]>item) {
				r=q-1;
			}
			else {
				p=q+1;
			}
		}
		
		return -1;
	}

}
