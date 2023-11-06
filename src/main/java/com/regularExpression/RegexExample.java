package com.regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
The Java Regex or Regular Expression is an API to define a pattern for searching or manipulating strings.
Java Regex API provides 1 interface and 3 classes in java.util.regex package.


java.util.regex package

MatchResult interface
Matcher class -provides facility if regular expression
Pattern class -provides facility if regular expression
PatternSyntaxException class


*/
public class RegexExample {

	public static void main(String[] args) {
		// 1st way
		Pattern p = Pattern.compile(".s");// (.) represents single character ..s == ass (finding s at 3rd position) true
		Matcher m = p.matcher("as");
		boolean b = m.matches();

		// 2nd way
		boolean b2 = Pattern.compile(".s").matcher("as").matches();

		// 3rd way
		boolean b3 = Pattern.matches(".s", "as");

		System.out.println(b + " " + b2 + " " + b3);

		System.out.println(Pattern.matches(".s", "as"));// true (2nd char is s)
		System.out.println(Pattern.matches(".s", "mk"));// false (2nd char is not s)
		System.out.println(Pattern.matches(".s", "mst"));// false (has more than 2 char)
		System.out.println(Pattern.matches(".s", "amms"));// false (has more than 2 char)
		System.out.println(Pattern.matches("..s", "mas"));// true (3rd char is s)
	}
}
