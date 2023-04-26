package recursion;

public class PrintNumRecursive {

	public static void main(String[] args) {
		
		printNum(10);
		
	}
	 
	
	public static void printNum(int n) {
		if(n>0) {
			
		printNum(n-1);
		System.out.println(n);
		
		}
	}
	
}
