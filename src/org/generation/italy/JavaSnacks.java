package org.generation.italy;

import java.util.Scanner;

public class JavaSnacks {
	public static void main(String[] args) {
		/*
		 * PRIMO SNACK - INSERISCI UN NUMERO, STAMPA NUMERI PARI, SE DISPARI STAMPA IL NUMERO SUCCESSIVO.
		 */
		Scanner sc = new Scanner(System.in);
			System.out.print("Inserisci un numero:");
			int userNumber = sc.nextInt();
		sc.close();
		
		if(userNumber % 2 == 0 ) {
			System.out.println(userNumber);
		} else {
			System.out.println(userNumber + 1);
		}
		
	}
}
