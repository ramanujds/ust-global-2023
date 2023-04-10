class StartMyDay{
  public static void main(String []args){
	int day;
	day = 10;
	String message="";
	if(day == 1){
	   message = "Monday - it's time to start the week";
	}
	else if(day == 2){
	   message = "Tuesday - Day 2 of the week";
	}
	else if(day == 3){
	   message = "Wednesday - we reached mid of the week";
	}
	else if(day == 4){
	   message = "Thursday - We are reaching towards the end of the week";
	}
	else if(day == 5){
	   message = "Friday - Done with the week";
	}
	else if(day == 6){
	   message = "Saturday - Enjoy your weekend";
	}
	else if(day == 7){
	   message = "Sunday - Plan for the upcoming week";
	}
	else{
	   message = "Wrong option selected";
	}	 
	System.out.println(message);
  }
}
