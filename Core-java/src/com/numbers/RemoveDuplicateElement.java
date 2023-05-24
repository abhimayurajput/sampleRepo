package com.numbers;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElement {
	public static void main(String[] args) {
		String str= "welcome";
		List<Character> list =Arrays.asList('w','e','l','c','o','m','e');
		//list.stream().filter(c->Collections.frequency(list, c)<2).forEach(System.out::println);
		int[] arr= {1,2,3,2,5};
		Arrays.stream(arr).distinct().forEach(System.out::println);
	}

}
