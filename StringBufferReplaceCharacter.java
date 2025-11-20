package com.codegnan.stringexamples;

import java.util.Scanner;

public class StringBufferReplaceCharacter {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//1st string
		System.out.println("Enter first String");
		String a=scanner.nextLine();
		//Integer for start index
		System.out.println("Enter start index");
		int b=scanner.nextInt();
		scanner.nextLine();
		//Integer for end index
		System.out.println("Enter end index");
		int c=scanner.nextInt();
		scanner.nextLine();
		//2nd string for replacing string character
		System.out.println("Enter second index for replacing");
		String d=scanner.nextLine();
		
		
		//string builder object and storing a value
		StringBuffer sb=new StringBuffer(a);
		sb.replace(b, c, d);
		System.out.println(sb.toString());
		scanner.close();

	}

}
