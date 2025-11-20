package com.codegnan.stringexamples;

import java.util.Scanner;

public class StringSwapper {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter first String");
		String str1=scanner.next();
		System.out.println("Enter second string");
		String str2=scanner.next();
		System.out.println("Before swapping : str1=" +str1+ " str2 is" +str2);
		//concat str1 and str2 store str1
		str1=str1+str2;
		//extract the original str1 by taking substring from 0 to length of str1-length of str2 
		str2=str1.substring(0,str1.length()-str2.length());
		//extract the original str2 by taking substring from length of srt2 to end 
		str1=str1.substring(str2.length());
		System.out.println("After swapping : str1 is " +str1+ " str2 is" +str2);
		scanner.close();
	}

}
