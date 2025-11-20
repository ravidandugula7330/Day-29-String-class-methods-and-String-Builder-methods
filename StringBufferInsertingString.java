package com.codegnan.stringexamples;

import java.util.Scanner;

public class StringBufferInsertingString {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//1st string
		System.out.println("Enter first string");
		String a=scanner.nextLine();
		//integer position
		System.out.println("Enter integer position");
		int b=scanner.nextInt();
		scanner.nextLine();
		//2nd string for insertion
		System.out.println("Enter secound string for insertion");
		String c=scanner.nextLine();
		
		//creating string builder object storing a in it
		StringBuffer sb=new StringBuffer(a);
		sb.insert(b,c);
		System.out.println(sb.toString());
		scanner.close();
	}

}
