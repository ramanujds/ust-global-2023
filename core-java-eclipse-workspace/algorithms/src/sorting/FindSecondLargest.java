package sorting;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		int []arr= {4,8,22,5,15};
		
		int max2=findSecondLargest(arr);
		System.out.println("Result = "+max2);

	}
	
	public static int findSecondLargest(int []arr) {
		
		int max1=arr[0],max2=arr[0];
		for(int i:arr) {
			if(i>max1) {
				max1=i;
			}
		}
		
		for(int i:arr) {
			if(i>max2 && i<max1) {
				max2=i;
			}
		}
		
		return max2;
	}
	

}
