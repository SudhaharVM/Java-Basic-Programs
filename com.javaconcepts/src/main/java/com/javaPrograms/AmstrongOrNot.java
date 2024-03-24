package com.javaPrograms;

public class AmstrongOrNot {

	public static void main(String args[]) {
		int g=370;
		double temp,amst=0;
		int original=g;
		
		while(g>0) {
			temp=g%10;
			temp=Math.pow(temp, 3);
			amst=amst+temp;
			g=g/10;
		}
		if(original==amst) {
			System.out.println(original +" is Amstrong Number");
		}
		else {
			System.out.println(original +" is not Amstrong Number");
		}
	}

}
