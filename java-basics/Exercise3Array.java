import java.util.Scanner;
import java.util.Arrays;
class Exercise3Array{
	public static void main(String []args){
	  Scanner scan = new Scanner(System.in);
	  System.out.println("Enter the size of the array : ");
	  int size = scan.nextInt();
	  int []numbers = new int[size];
	  System.out.println("Enter " +size+ " numbers");
          for(int count=0; count<size; count++){
	    numbers[count] = scan.nextInt();
          }
	  Arrays.sort(numbers);
	  System.out.println("Entered numbers are : ");
	  for(var num:numbers)
	  	System.out.print(num+"\t");

	  
   }
}