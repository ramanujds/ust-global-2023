package lambdaexpression;

interface LengthFinder{
	int getLength(String str);
}

public class LambdaExample3 {

	public static void main(String[] args) {
		
		// Find the length of a string
		
		LengthFinder lf = str -> str.length();
		int length = lf.getLength("hello world");
		System.out.println("Length = "+length);
		
		
		// check if a number is even or odd
		
		// n -> n%2 == 0;
	
		// find if a number is divisible by another number
		
		// (x,y) -> x%y==0;
		
		
	}
	
}
