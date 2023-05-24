package com.numbers;

import java.util.Arrays;

//Input:  arr[] = {1, 5, 7, -1}, sum = 6
public class SubArrayOfTarget {
	public static void main(String[] args) {
		int[] arr = {1, 5, 7, -1,5};
		Arrays.stream(arr).distinct();
		int sum = 6,count = 0;
		
		for(int i=0;i<arr.length;i++) {
			//j=i+1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==sum) {
					count++;
					System.out.println("arr[i] "+arr[i]+" arr[j]:"+arr[j]);
				}
			}
			
		}
		System.out.println("count: "+count);
	}

}
