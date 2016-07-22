package com.java.anagrams;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AnagramsStr {
	public static void main(String args[]){
		
		String str1 = "Souro";
		str1=str1.toUpperCase();
		String str2 = "oruos";
		str2=str2.toUpperCase();
		int len1=str1.length();
		int len2=str2.length();
		if(len1!=len2){
			System.out.println("NOT");
			return;
		}
		else{
			int i;
			for(i=0;i<len1;i++){
				if(!str2.contains(""+str1.charAt(i))){
					System.out.println("NOT");
					break;
				}
			}
			if(i==len1){
				System.out.println("YES");
			}
		}
	}
}
