package com.ust.app;

import java.util.regex.Pattern;

public class BasicRegularExpressions {

	public static void main(String[] args) {
		
		
		String inputPattern;
		inputPattern = "[abc]{2,5}";
		String input;
		input= "abccaa";
		boolean check;
		
		// any char from a-z
		inputPattern = "[a-zA-Z]+";
		input = "Javed";
		
		// any digit
		inputPattern = "[0-9]+";
		input = "892828";
		
		// word then space then word
		inputPattern = "\\w+\\s{1}\\w+";
		input = "Steve Jobs";
		
		check = Pattern.matches(inputPattern, input);
		
		
		
		String passwordPattern = "^(?=.*\\d)(?=.*[@#$])(?=.*[a-b])(?=.*[A-B])[\\w@#$]{6,20}$";
				
				
		
		String password = "1111Bb@@@@";
		
		check = Pattern.matches(passwordPattern, password);
		System.out.println(check);
		
		
	}
	
}
