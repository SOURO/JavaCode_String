package com.reversestring;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		  //IF you want to initialize
		  //String string="Souro";
		  
		  //IF you want to take the string as an i/p
		  String string;
		  System.out.println("Enter One String : ");
		  string=scanner.nextLine();
		  
	      
		  //Using reverse() method
		 // String reverse = new StringBuffer(string).reverse().toString();
		  
		  //Another Logic if you dont wnat to use reverse() method
		  
		  String reverse = "";
		  final int len = string.length();
		  for(int i=len-1;i>=0;i--){
			  reverse += string.charAt(i);
		  }
		  
	      System.out.println("\nString before reverse:"+string);
	      System.out.println("String after reverse:"+reverse);
	   }

}
