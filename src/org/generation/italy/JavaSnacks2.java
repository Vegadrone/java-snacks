package org.generation.italy;

import java.util.Random;

public class JavaSnacks2 {
	public static void main(String[] args) {
		/*
		 * SECONDO SNACK - GRANDE GATSBY LISTA INVITATI
		 */
		
		Random rnd = new Random ();
		
		String [] namesList = {"Gianni", "Pino", "Marco", "Francesco", "Pippo"};
		
		String [] surnamesList = {"Lollo", "Gozzari", "Arcano", "Orti", "Vialli"};
		
		String[] fullNames = new String [3];
		
		for (int i = 0; i < namesList.length; i++) {
			
			int namesIndex = rnd.nextInt(namesList.length);
			
			String namesList = namesList[namesIndex];
			
			String fullName = namesList + " " + surnamesList;
		}
	}
}
