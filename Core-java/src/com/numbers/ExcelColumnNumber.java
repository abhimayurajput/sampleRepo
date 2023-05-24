package com.numbers;

public class ExcelColumnNumber {
	
	public static void main(String[] args) {
		String str = "AAA";
		int columnNumber =0;//should be 28
		int p=0;
		for(int i = str.length()-1;i>=0;i--) {
			char c = str.charAt(i);
			int val = (int)c-65+1;//2
			columnNumber+=val*(Math.pow(26, p));
			p++;
		}
		System.out.println(columnNumber);
	}

}
