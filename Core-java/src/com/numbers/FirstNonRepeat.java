package com.numbers;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeat {
	public static void main(String[] args) {
		String str = "helloh world";
		str=str.replaceAll("\\s", "");
		System.out.println(str);
		
		
	Character firstNonRepeat =	str.chars()
			.mapToObj(c->(char)c)
		    .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
		    .entrySet().stream()
		    .filter(entry->entry.getValue()==1)
		    .map(entry->entry.getKey())
		    .findFirst().get();
	
	System.out.println("firstNonRepeat: "+firstNonRepeat);
	
	Character firstRepeatedChar = str.chars()
									 .mapToObj(c->(char)c)
									 .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
									 .entrySet().stream().filter(e->e.getValue()>1)
									 .map(entry->entry.getKey())
									 .findFirst().get();
	System.out.println("firstRepeatedChar: "+firstRepeatedChar);
	}

}
