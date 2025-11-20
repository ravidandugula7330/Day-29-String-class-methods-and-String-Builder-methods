package com.codegnan.stringexamples;

import java.util.Scanner;

public class PalindromStringChecker {

		public static boolean isPalindrome(String str) {//madam
			int left=0;// 0 index
			int right=str.length()-1;//n-1 index
			while(left<right) {
				if(str.charAt(left)!=str.charAt(right)) {   //we can write double equals method
					return false;
				}
				left++;
				right--;
			}
		return true;
		}
	
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter string");
		String input=scanner.next();
		boolean result=isPalindrome(input);
		if(result) {
			System.out.println(input+" is a palindrome");
		}else {
			System.out.println(input+" is not a palindrome");
		}
		scanner.close();
	}

}
