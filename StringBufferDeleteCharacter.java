package com.codegnan.stringexamples;

import java.util.Scanner;

public class StringBufferDeleteCharacter {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//String value
		System.out.println("Enter String");
		String a=scanner.nextLine();
		//integer for start index
		System.out.println("Enter start index position");
		int b=scanner.nextInt();
		scanner.nextLine();
		//second integer for second index
		System.out.println("Enter end inex position");
		int c=scanner.nextInt();
		
		//object for String Buffer and storing a
		StringBuffer sb=new StringBuffer(a);
		
		sb.delete(b, c);
		System.out.println(sb.toString());
		scanner.close();
	}

}
