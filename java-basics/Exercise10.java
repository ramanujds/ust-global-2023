/*

Exercise 10:-
Write an algorithm for accepting the age of user and if the age is valid, check whether the user is a kid, a teenager, an adult or a senior citizen.

Consider
	min 1 max 120
	kid 1-12
	teen 13-19
	adult 20-60
	senior 60+

*/

class Exercise10{
  public static void main(String []args){
	int age = 5;
	String output = "";
	if(age<1){
		output = "Invalid Age";
	}
	else if(age <= 12){
		output = "Kid";
	}
	else if(age <= 19){
		output = "Teen-age";
	}
	else if(age < 60){
		output = "Adult";
	}
	else if(age <= 120){
		output = "Senior Citizen";
	}
	else{
		output = "Invalid Age";
	}
	
	System.out.println(output);
  }
}
