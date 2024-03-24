package com.javaPrograms;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int g=82903;
        int r=0;
        
    while(g!=0) {    
        r=r*10;
        r=r+g%10;
        g=g/10;
    }
    System.out.println(r);
        
}

}
