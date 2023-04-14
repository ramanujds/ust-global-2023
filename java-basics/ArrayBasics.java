class ArrayBasics{
	
	static int findMin(int []arr){
		int min = arr[0];
		for(int index=0; index<arr.length; index++){
			if(arr[index]<min){
				min = arr[index];
			}
		}
		return min;
	}

	
	public static void main(String []args){
		

	 	int []nums = {20,10,55,18,32,66,86};
		int []secondArr = {77,24,88,95,15};
		int []thirdArr = {66,29,57,44,21};
	
		int min1 = findMin(nums);	 // method calling/invoking
		int min2 = findMin(secondArr);	
		int min3 = findMin(thirdArr);	

		System.out.println(min1);
		System.out.println(min2);
		System.out.println(min3);

				
	}
}