class StartMyDayWithSwitch{
  public static void main(String []args){
	int day;
	day = 1;
	String message="";
	
	switch(day){
	  case 1 : message = "Monday - it's time to start the week";
		    break;
	  case 2 : message = "Tuesday - Day 2 of the week";
		    break;
	  case 3 : message = "Wednesday - we reached mid of the week";
		    break;
	  case 4 : message = "Thursday - We are reaching towards the end of the week";
		    break;
	  case 5 : message = "Friday - Done with the week";
		    break;
	  case 6 : message = "Saturday - Enjoy your weekend";
	  	    break;
	  case 7 : message = "Sunday - Plan for the upcoming week";
		    break;
	  default : message = "Wrong option selected";
		     break;	 
	}
	
	System.out.println(message);
  }
}