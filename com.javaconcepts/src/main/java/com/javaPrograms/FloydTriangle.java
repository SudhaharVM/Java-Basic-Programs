package com.javaPrograms;

public class FloydTriangle {

	public static void main(String[] args) {
		int row,col;
		int limit=5;
		
		for(row=0;row<=limit;row++) {
			for(col=0;col<row;col++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	}

}
