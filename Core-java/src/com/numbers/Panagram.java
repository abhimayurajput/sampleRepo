package com.numbers;

public class Panagram {
	public static void main(String[] args) {
		System.out.println(findPanagram("abcdefghijklmnopqrstuvwxab"));
	}

	private static boolean findPanagram(String str) {
		// TODO Auto-generated method stub
		if(str.length()<26) {
			return false;
		}
		for(char ch='a';ch<='z';ch++) {
			if(str.indexOf(ch)<0) {
				return false;
			}
		}
		return true;
	}

}
