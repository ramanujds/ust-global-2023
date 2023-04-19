package exceptionhandling;

public class MultiCatchDemo {

	public static void main(String[] args) {

		int[] arr = { 2, 5, 0, 1 };
		try {
			int output = arr[1] / arr[2];
			System.out.println(output);
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}
