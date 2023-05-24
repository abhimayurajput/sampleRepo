package com.numbers;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		System.out.println(findAnagram("face","cafe"));
	}
	
	public static boolean findAnagram(String str1,String str2 ) {
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		return Arrays.equals(arr1, arr2);
	}

}
