package exceptionhandling;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		System.out.println("Hello..");
		
		int x,y;
		x=10;
		y=0;
		System.out.println("Dividing "+x+" by "+y);
		try {
			int result = x/y;
			System.out.println("Result = "+result);
		}
		catch(ArithmeticException ex) {
			System.out.println("Error : "+ex.getMessage());
		}
		
		System.out.println("Program execution completed");
		System.out.println("Bye");
		
	}
	
}
