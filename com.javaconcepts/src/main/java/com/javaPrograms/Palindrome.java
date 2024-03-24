package com.javaPrograms;

public class Palindrome {

	public static void main(String[] args) {
		String g="MADAM";
		char [] ca=g.toCharArray();
		String r="";
		for(int i=ca.length-1;i>=0;i--) {
			r=r+ca[i];
			
		}
		
		if(g.equals(r)) {
			System.out.println(g +" is a Palindrome");
		}
		else {
			System.out.println(g +" is not a Palindrome");
		}

	}

}
