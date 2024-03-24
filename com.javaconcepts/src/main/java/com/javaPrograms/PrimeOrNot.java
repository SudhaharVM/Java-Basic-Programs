package com.javaPrograms;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=12;
        boolean prime=true;
        
        for(int i=2;i<n;i++) {
        	
        	if(n%i==0) {
        		prime=false;
        		break;
        	}
        }
        System.out.println(prime);
	}

}
