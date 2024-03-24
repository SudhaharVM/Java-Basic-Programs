
package com.javaPrograms;
import java.util.Random;

public class RandomNum {
    public static void main(String [] args) {
		Random random = new Random();
		int x=random.nextInt(800000);
		System.out.println(x);
		System.out.println(Math.random());
	}
}
