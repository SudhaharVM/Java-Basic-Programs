package com.javaPrograms;

public class SwapTwoNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=40;
        int b=80;
        
        a=a-b;
        b=a+b;
        a=b-a;
        
        System.out.println("a = "+a  + " b = "+b );
	}

}
