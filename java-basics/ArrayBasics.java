class ArrayBasics{
	public static void main(String []args){
		
	//	int []nums = new int[5];
	 	int []nums = {20,10,55,18,32,66,86};
	//	for(int index=0; index<nums.length; index++)
	//		System.out.println(nums[index]);

		for(int index=0; index<nums.length; index++){
			nums[index] += 5;
		}	

		for(var item : nums){
			System.out.println(item);
		}	
				
	}
}