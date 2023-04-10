import java.util.Scanner;
class Exercise3{
	public static void main(String []args){
	  Scanner scan = new Scanner(System.in);
	  int sum = 0;
	  System.out.println("Enter 5 numbers");
        for(int count=0; count<5; count++){
	    int num = scan.nextInt();
	    	if(num<0) continue; // negative numbers will be skipped
	    sum += num ;
       }
	  System.out.println("Sum = "+sum);
   }
}

