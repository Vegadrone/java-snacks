package org.generation.italy;

public class JavaSnacks7 {
	public static void main(String[] args) {
		String[] words = { "Lorem", "ipsum", "dolor", "sit", "amet", "consectetur", "adipisicing", "elit" };
		
		String phrase = "";
		
		for(int i = 0; i < words.length; i++) {
			phrase += words[i] + " ";			
		}
		System.out.println(phrase);
		
	}
}
