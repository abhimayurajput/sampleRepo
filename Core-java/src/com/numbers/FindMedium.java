package com.numbers;

import java.util.Arrays;

public class FindMedium {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,60,70,80,90,100};
		//Arrays.sort(arr);
		System.out.println(findMedium(arr));
	}
	public static int findMedium(int[] arr) {
		/*
		 * int medium = arr.length/2; if(arr.length%2 == 0) { int val1 = arr[medium];
		 * int val2 = arr[medium-1]; return (val1+val2)/2; }else { medium =
		 * arr.length/2+1; return arr[medium]; }
		 */
		if(arr.length%2 == 0) {
			return arr[arr.length/2-1];
		}else {
			return arr[arr.length/2];
		}
	}

}
