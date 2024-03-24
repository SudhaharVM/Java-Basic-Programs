package com.javaPrograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a,b=0;
        int c=1;
        
        for(int i=2;i<=10;i++) {
        	a=b;
        	b=c;
        	c=a+b;
        	System.out.print(a + " ");
        }
	}

}
