package com.javaPrograms;

public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String g= "I love My Country";
        String [] t=g.split(" ");
        String r="";
        
        for(int i=t.length-1;i>=0;i--) {
        	r=r+t[i]+ " ";
        	
        }
        System.out.println(r);
        
	}

}
