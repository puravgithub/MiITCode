package com.stringMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringConcatColJoining {

	public static void main(String[] args) {
		List<String> studentList = Arrays.asList("purav","kishan","sukh","princy","dwijen","saini","mitesh","neel"); //list of array
		
		String list = studentList.stream().collect(Collectors.joining("-")); //joining class join all name with -
		System.out.println(list.toString());

	}

}
