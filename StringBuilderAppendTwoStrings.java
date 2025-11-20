package com.codegnan.stringexamples;

import java.util.Scanner;

public class StringBuilderAppendTwoStrings {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter first string");
		String a=scanner.nextLine();
		System.out.println("Enter second string");
		String b=scanner.nextLine();
		//creating object
		StringBuffer sb=new StringBuffer(a);
		sb.append(b);
		System.out.println(sb.toString());
		scanner.close();
	}

}
