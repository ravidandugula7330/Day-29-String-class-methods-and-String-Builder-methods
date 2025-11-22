package com.codegnan.stringexamples;

import java.util.Scanner;

public class SringBufferAppendAndSuffix {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a String");
		String baseString=scanner.nextLine();
		System.out.println("Enter a number");
		int number=scanner.nextInt();
		scanner.nextLine();
		//entering a string for suffix
		System.out.println("Enter a suffix for adding");
		String suffix=scanner.nextLine();
		
		StringBuffer sb=new StringBuffer(baseString);
		sb.append(number);
		sb.append(suffix);
		System.out.println(sb.toString());
	}

}
