// Program to count hard words in a sentence.

import java.util.*; 

public class mainClass{
	public static void main(String args[]){	
		// variable declaration
		int hardWord=0, easyWord=0, x,result;
		String sentence = "Difficulty of sentence";		
	
		// splitting the sentence
		String[] word = sentence.split("\\s");
	
		//counter loop
		for (x=0; x<word.length; x++){
			
			if(fourConsecutiveConsonants(word[x])){
				hardWord++;
				continue;
			}

			if(nConsonant(word[x]) > nVowel(word[x]))	
				hardWord++;
			
			else
				easyWord++;
		
		}
		
		//final calculation
		result = 5*(hardWord) + 3*(easyWord);
		
		//display the result
		System.out.println("The difficulty of sentence is: " + result);
	
	}
	
	// vowel check method
	public static boolean isVowel(char c){
		String vowels = "aeiouAEIOU";
		return vowels.contains(Character.toString(c));
	}
	
	// consonant check method
	public static boolean isConsonant(char c){
		String consonants = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
		return consonants.contains(Character.toString(c));
	}
	
	
	// four consecutive consonant check method 
	public static boolean fourConsecutiveConsonants(String wordCopy){
		// variable declaration
		int consonantCounter=0;
		
		
		// counter loop
		for(int i=0; i<wordCopy.length(); i++){
			if(isConsonant(wordCopy.charAt(i))){
				consonantCounter++;
				if(consonantCounter==4)
					return true;
			}
			else{
				consonantCounter=0;
			}
		}
		 
		return false;
    }
	
	// number of vowels
	public static int nVowel(String wordCopy){
		int count=0;
		
		for(int i=0; i<wordCopy.length(); i++){
			if(isVowel(wordCopy.charAt(i)))
				count++;
		}
		return count;
	}
	
	
	// number of consonants
	public static int nConsonant(String wordCopy){
		int count=0;
		
		for(int i=0; i<wordCopy.length(); i++){
			if(isConsonant(wordCopy.charAt(i)))
				count++;
		}
		return count;
	}
	
}
	

