package com.numbers;

public class ReverseInteger {
	public static void main(String[] args) {
		Integer num = -123;
		num = -(num);
		System.out.println(num);
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
	}

}
