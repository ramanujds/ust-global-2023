class MultiArray{
	public static void main(String []args){
	// int [][]matrix = new int[3][3];
	   int [][]matrix = {{2,3,5},{7,8,10},{12,13,15}};
	   for(int i=0; i<3; i++){
		for(int j=0; j<3; j++){
			System.out.print("\t"+matrix[i][j]);
		}
		System.out.println();
	  }

	// Enhanced for loop

		for(int []row:matrix){
			for(int value: row){
				System.out.print("\t"+value);
			}
		System.out.println();
	  }	
	}
}