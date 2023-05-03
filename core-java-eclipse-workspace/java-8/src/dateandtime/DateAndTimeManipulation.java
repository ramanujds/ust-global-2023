package dateandtime;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateAndTimeManipulation {

	public static void main(String[] args) {
		
		// Get the current system date
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		// Create a new date
		LocalDate date1 = LocalDate.of(2020, 4, 5);
		System.out.println(date1);
		
		// Create a date from string
		
		String str = "2019-10-15";
		LocalDate date2 = LocalDate.parse(str);
		System.out.println(date2);
		
		// Get Month Year and Day from a Date
		
		// Get month in words
		Month month = today.getMonth();
		// Get month in number
		int monthNum = today.getMonthValue();
		int year = today.getYear();
		int day = today.getDayOfMonth();
		
		System.out.println(monthNum);
		System.out.println(year);
		System.out.println(day);
		
		// Comapring two dates
		
		// Find out which date value is after the other
		
		boolean check = date1.isAfter(date2);
		System.out.println(check);
		
		boolean check2 = date1.isBefore(date2);
		System.out.println(check2);
		
		String dateStr = "03-05-2023";
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		LocalDate date3 = LocalDate.parse(dateStr,format);
		System.out.println(date3.format(format2));
		
	}
	
}
