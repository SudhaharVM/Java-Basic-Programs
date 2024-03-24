package com.javaPrograms;

public class FindLength {

	public static void main(String[] args) {
		String g="DravidRahul";
		char [] ca=g.toCharArray();
		int Length=0;
		
		for(char s:ca) {
			Length++;
		}
        System.out.println(Length);
	}

}
