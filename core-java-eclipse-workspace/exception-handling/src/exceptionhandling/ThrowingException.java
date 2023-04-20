package exceptionhandling;

import java.util.Scanner;

public class ThrowingException {
	
	static int age;
	static String name;
	static Scanner scan;
	
	public static void readUserDetails() throws Exception {
		scan = new Scanner(System.in);
		System.out.println("Enter name and age : ");
		name = scan.nextLine();
		age = scan.nextInt();
		if(name.length()<3) {
			throw new Exception("Name should have atleast 3 characters");
		}
		if(age <= 0) {
			throw new InvalidAgeException("Age should be a positive value");
		}
	}

	public static void main(String[] args) {
		try {
			readUserDetails();
			System.out.println("Age = "+age);
		}
		catch (Exception e) {
			System.err.println(e);
		}
		finally {
			System.out.println("Closing resources..");
			scan.close();
		}
		
		
	}
	
}
