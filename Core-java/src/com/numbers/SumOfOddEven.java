package com.numbers;

public class SumOfOddEven {
	public static void main(String[] args) {
		int[] arr = {2,5,4,11,6,9};
		int even = 0;
		int odd = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				even+=arr[i];
			}else {
				odd+=arr[i];
			}
		}
		
		System.out.println(even+" "+odd);
	}
}
