package com.codegnan.stringexamples;

import java.util.Scanner;

public class IsPlindromeOrNot {

	public static void main(String[] args) {
		//from end user
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a String");
		//inputs
		String str=scanner.nextLine();
		String rev="";
		//for loop for rev printing
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
	
		if(str.equalsIgnoreCase(rev)) {
			System.out.println(str+"is palindrome");
		}else {
			System.out.println(str+"not a palindrome");
		}
		scanner.close();
	}
}

