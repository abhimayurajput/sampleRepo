package com.numbers;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayToString {
	public static void main(String[] args) {
		String[] arr= {"abhi","akshay","swapil"};
		String str =Arrays.toString(arr);
		System.out.println("str: "+str);
		StringBuilder sb =new StringBuilder();
		for(int i=0;i<arr.length;i++) {
			sb.append(arr[i]);
		}
		System.out.println("StringBuilder: "+sb.toString());
		
		System.out.println("string join: "+String.join(" ", arr));
		
	String strJoining =	Arrays.stream(arr).collect(Collectors.joining());
	System.out.println("strJoining: "+strJoining);
		
	}

}
