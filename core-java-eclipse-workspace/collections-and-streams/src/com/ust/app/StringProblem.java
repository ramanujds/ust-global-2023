package com.ust.app;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringProblem {

	public static void main(String[] args) {
		
//		String str = "Tata Consultancy Service";
//		
//
//		Stream<String> strs=Stream.of(str.split(" "));
//		
//		String output = strs.map(s->""+s.charAt(0))
//							.reduce((s1,s2)->s1+"."+s2)
//							.get();
//		
//		System.out.println(output);
		
		String str = "hello abc";
		int count = str.replaceAll("[^(aeiouAEIOU)]","").length();
		System.out.println(count);
		
		String output = str.replaceAll("[aeiouAEIOU]","");
		System.out.println(output);
		
		
		
//		int count = 0;
//		for(char c:str.toCharArray()) {
//			if(Pattern.matches("[aeiouAEIOU]",String.valueOf(c))) {
//				count++;
//			}
//		}
//
////		Pattern p = Pattern.compile("[aeiouAEIOU]");
////		Matcher m=p.matcher(str);
////		int count = 0;
////		while(m.find()) {
////			count++;
////		}
//		System.out.println(count);
		
		
		
		
		
	}
	
}
