package com.ust.app;

import java.util.regex.Pattern;

public class RegexProblems {

	public static void main(String[] args) {

		/*
		 * PAN card number validation:
		 * 
		 * all letters should be in caps, should be of 8 chars. first three letters must
		 * be alphabets. next 4 letters should be digits and last letter should be an
		 * alphabet
		 */

		String regex = "[A-Z]{3}[0-9]{4}[A-Z]{1}";

		String pan1 = "CLD1234F"; // TRUE
		String pan2 = "CLDG234F"; // FALSE
		String pan3 = "ZLD5462D"; // TRUE
		String pan4 = "123ABC4F"; // FALSE

		check(regex, pan1);
		check(regex, pan2);
		check(regex, pan3);
		check(regex, pan4);

		/*
		 * 
		 * Email Validation String input1="test@gmail.com"
		 * 
		 * @ & . should be present;
		 * @ & . should not be repeated; 
		 * there should be five charcters between @ and .;
		 * there should be atleast 3 characters before @ ; 
		 * the end of mail id should be .com;
		 * 
		 * 
		 * 
		 * 
		 */
		
			String emailRegex = "^[a-zA-Z]{3,}@[a-zA-Z]{5}(\\.com)$";
			
			check(emailRegex, "test@gmail.com");
			check(emailRegex, "t@gmail.com");
			check(emailRegex, "test@g@mail.com");
			check(emailRegex, "abc@yahoo.com");

	}

	public static void check(String regex, String str) {

		System.out.println("For " + str + " matches = " + Pattern.matches(regex, str));

	}

}
