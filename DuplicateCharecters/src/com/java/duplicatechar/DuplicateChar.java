package com.java.duplicatechar;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateChar {
	public static void main(String args[]){
		String ipstr = "jebfbbbcsacvafdvs c k";
		Map<Character, Integer> charMap=new HashMap<Character, Integer>();
		char[] ipstrArr = ipstr.toCharArray();
		for(Character ch:ipstrArr){
			if(charMap.containsKey(ch)){
				charMap.put(ch, charMap.get(ch)+1);
			}
			else{
				charMap.put(ch, 1);
			}
		}
		Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
		for(Map.Entry<Character, Integer> entry : entrySet){
			if(entry.getValue()>1){
				System.out.println(entry.getKey()+" "+entry.getValue());
			}
		}
	}
}
