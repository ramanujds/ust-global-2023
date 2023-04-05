/*

Exercise 9:-
Write an algorithm for accepting three numbers and display the highest number among the three numbers.

*/

class Exercise9{
 public static void main(String []args){

	int num1=100, num2=20, num3=25;
	int largest;
	
	if(num1>num2){
		largest = num1;
	}
	else{
		largest = num2;
	}

	if(num3>largest){
		largest = num3;
	}

	System.out.println(largest);

   }
}