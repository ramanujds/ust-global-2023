class DescendingPattern{
	public static void main(String []args){
		int lines = 5;
		for(int row = 1; row <= lines; row++){
			for(int col=1; col<=row; col++){
				int output = lines-(col-1);
				System.out.print(output+ "  ");
			}
		System.out.println();
	}
   }
}
