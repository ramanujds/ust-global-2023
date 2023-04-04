/*
Write an algorithm for accepting two numbers, divide the first number by second and display their quotient
*/


import java.util.Scanner;

class Exercise1{
	public static void main(String []args){

		Scanner scan = new Scanner(System.in);
		System.out.println("Input two numbers :");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int result = num1/num2;
		System.out.println("Result = "+result);

	}
}