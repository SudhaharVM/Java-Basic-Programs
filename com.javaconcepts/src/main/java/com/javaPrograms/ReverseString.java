package com.javaPrograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String g="";
		System.out.print("Enter the String to Reverse: ");
		
		Scanner sc =new Scanner(System.in);
		g=sc.nextLine();
		char [] ca=g.toCharArray();
		String r="";
		for(int i=ca.length-1;i>=0;i--) {
			r=r+ca[i];
			}
       System.out.println(r);
	}

}
