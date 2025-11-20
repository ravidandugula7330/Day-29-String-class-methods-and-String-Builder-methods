package com.codegnan.stringexamples;

import java.util.Scanner;

public class SwappingTwoStringsWithoutThirdVariable {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter first String");
		String a=scanner.nextLine();//hello
		System.out.println("Enter second String");
		String b=scanner.nextLine();//world
		
		// combining string 1 and string2 ,storing in a
		
		a=a+b;//helloworld
		
		//extracting original a into b
		
		b=a.substring(0,a.length()-b.length());
	
	//extract original str2 into str1
		
		a=a.substring(b.length());
		System.out.println("After swappinga str1=" +a+ ",str2="+b);
		scanner.close();
	}
}
