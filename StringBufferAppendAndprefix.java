package com.codegnan.stringexamples;

import java.util.Scanner;

public class StringBufferAppendAndprefix {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a string");
		String baseString=scanner.nextLine();
		
		//second string for prefix
		System.out.println("Enter a string for prefix");
		String prefix=scanner.nextLine();
		
		StringBuilder sb=new StringBuilder(prefix);
		
		sb.append(baseString);
		System.out.println(sb.toString());
	}

}
