/*

Exercise 8:-
Write an algorithm for accepting a character and then display whether it is a vowel or a consonant.

 input = 'x';

 if input belong to a,e,i,o,u is vowel

 else consonant
 

*/

import java.util.Scanner;
class Exercise8{
 public static void main(String []args){
	Scanner scan = new Scanner(System.in);
	
	char input;
	System.out.print("Enter a character : ");
	input = scan.next().toLowerCase().charAt(0);
	String output = "";
	if(input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u'){
		output = "Vowel";
	}
	else{
		output = "Consonant";
	}
	System.out.println(output);
  }
}


