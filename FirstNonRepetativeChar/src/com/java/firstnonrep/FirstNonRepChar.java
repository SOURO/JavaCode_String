package com.java.firstnonrep;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FirstNonRepChar {
	public static void main(String args[]){
		String str = "Souro";
		char[] strArr = str.toCharArray();
		Map<Character, Integer> strMap = new LinkedHashMap<Character, Integer>();
		for(char ch:strArr){
			if(strMap.containsKey(ch)){
				strMap.put(ch, strMap.get(ch)+1);
			}
			else{
				strMap.put(ch,1);
			}
		}
		Set<Map.Entry<Character, Integer>> entrySets = strMap.entrySet();
		for(Entry<Character, Integer> entrySet:entrySets){
			if(entrySet.getValue()==1){
				System.out.println("First no repeatetive charecter :"+entrySet.getKey());
				break;
			}
		}
	}
}
