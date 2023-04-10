class ArraySort{

	public static void main(String []args){
		int []arr = {8,2,7,25,3};
		
		for(int i=0; i<arr.length-1; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i]>arr[j]){
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int num:arr){
			System.out.print(num+"   ");
		}
	}
}