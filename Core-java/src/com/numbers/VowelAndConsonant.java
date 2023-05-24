package com.numbers;

public class VowelAndConsonant {
	public static void main(String[] args) {
		String str = "welcome to the neosoft";
		int[] counts = findCounts(str);
		System.out.println(counts[0]+" "+counts[1]);
	}
	
	public static int[] findCounts(String str) {
		int vowelCount = 0;
		int consonantCount = 0;
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(isVowel(ch) == true) {
				vowelCount+=1;
			}else
				consonantCount+=1;
		}
		return new int[] {vowelCount,consonantCount};
	}
	
	public static boolean isVowel(char ch) {
		Character cha = Character.toUpperCase(ch);
		return cha == 'A' || cha =='E' || cha =='I' || cha =='O' || cha == 'U';
	}

}
