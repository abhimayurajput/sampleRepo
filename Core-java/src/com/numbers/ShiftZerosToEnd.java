package com.numbers;

public class ShiftZerosToEnd {
	public static void main(String[] args) {
	int[] arr = {1,0,1,0,0,1};
	int[] result=new int[arr.length];
	/*
	 * int i=0,j=0; while(arr[i]!=0) { result[j]=arr[i]; i++; j++; }
	 */
	int j=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==1) {
			result[j]=arr[i];
			j++;
		}
	}
	for(int num:result) {
		System.out.println(num);
	}
	}
}
