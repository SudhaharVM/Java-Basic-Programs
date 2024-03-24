package com.javaPrograms;

public class RemoveSpace {

	public static void main(String[] args) {
		String g="I  like to  Sing   national  Anthem";
		String s=g.replaceAll("\\s", "");
		System.out.println(s);

	}

}
