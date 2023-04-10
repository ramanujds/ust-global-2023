class Prime{
	public static void main(String []args){
		int num = 55;
		boolean prime = true;
		for(int count = 2; count<num/2 ; count++){
		   if(num % count == 0){
				prime = false;
				break;
		   }
		}
		if(prime == true){
			System.out.println("Prime");
		}
		else{
			System.out.println("Not Prime");
		}
	}
}
