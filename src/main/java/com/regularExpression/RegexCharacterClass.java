package com.regularExpression;

import java.util.regex.Pattern;

public class RegexCharacterClass {

	public static void main(String[] args) {


		System.out.println(Pattern.matches("[purav]", "puravpatel")); //false
		//character class is only work for characters here we are passing String
		
		System.out.println(Pattern.matches("[mamamamama]", "m")); //true -here we are finding m in mentioned string 
		
		System.out.println(Pattern.matches("[puravpatel@gmail.com]", "@")); //true - finding @ in mentioned string

	}

}
