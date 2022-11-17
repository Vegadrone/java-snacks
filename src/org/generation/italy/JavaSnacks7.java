package org.generation.italy;

public class JavaSnacks7 {
	public static void main(String[] args) {
		String[] words = { "Lorem", "ipsum", "dolor", "sit", "amet", "consectetur", "adipisicing", "elit" };
		
		String phrase = "";
		String reversePhrase = "";
		
		String longest = words[0];
		String shortest = words[0];
		
		for(int i = 0; i < words.length; i++) {
			
			if (words[i].length() > longest.length()) {
				longest = words[i];
			} else if (words[i].length() < shortest.length()){
				shortest = words[i];
			}
			
			phrase += words[i] + " ";
			
		}
		
		System.out.println(phrase);
		System.out.println(longest);
		System.out.println(shortest);
		
		 for (int i = words.length - 1; i > -1; i--) {
			 reversePhrase += words[i] + " ";
		 }
		 
		 System.out.println(reversePhrase);
		 
		 
		
	}
}
