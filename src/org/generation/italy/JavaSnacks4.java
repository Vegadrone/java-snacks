package org.generation.italy;

import java.util.Random;

public class JavaSnacks4 {
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int [] numbers = new int [5];
		int [] numbers2 = new int [15];
		
		int arrayDiff = numbers2.length - numbers.length;
		
		for ( int i = 0; i < arrayDiff; i++) {
			System.out.println(rnd.nextInt(11));
		}
	}
}
