package com.numbers;

import java.util.HashMap;
import java.util.Map;

public class LongestSubtring {
	public static void main(String[] args) {
		String str = "ababc";
		int longestLength = 0;
		String longestSubstring = "";
		Map<Character,Integer> map = new HashMap<>();
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(!map.containsKey(ch)) {
				map.put(ch, 1);
			}else {
				i = map.put(ch, map.get(ch)+1);
				map.clear();
				System.out.println("i: "+i);
			}
			if(longestLength<map.size()) {
				longestLength=map.size();
				longestSubstring = map.keySet().toString();
			}
		}
		System.out.println("longestLength: "+longestLength);
		System.out.println("longestSubstring: "+longestSubstring);
	}

}
