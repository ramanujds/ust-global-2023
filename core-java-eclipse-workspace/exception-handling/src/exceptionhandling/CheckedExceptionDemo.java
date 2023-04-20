package exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class CheckedExceptionDemo {

	public static void main(String[] args) throws Exception {
		
		FileReader reader = new FileReader("hello1.txt");
		Scanner scan = new Scanner(reader);
		String line = scan.nextLine();
		System.out.println(line);
		
		
	}
	
}
