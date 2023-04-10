class Pattern1{
	public static void main(String []args){
		int lines = 5;
		for(int row = 1; row<=lines; row++){
		   for(int col = 1; col<=lines; col++){
			if(row%2==0){
				System.out.print("#   ");
			}
			else{
				System.out.print("*   ");
			}
		  }
		System.out.println();
		}
	}
}

// can be done with conditional operator statement also
// char ch = row%2==0 ? '#' : '*';