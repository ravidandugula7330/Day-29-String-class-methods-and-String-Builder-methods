package com.codegnan.stringexamples;

import java.util.Scanner;

public class ReverseOfAString {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=scanner.nextLine();
		String rev="";
		//logic for reverse of a number using for loop
		for(int i=str.length()-1;i>=0;i--) {//read length of string -1
			rev=rev+str.charAt(i);  //to pick the position
		}
		System.out.println(rev);
		scanner.close();
	}

}
