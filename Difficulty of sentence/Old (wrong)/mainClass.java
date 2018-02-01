import java.util.*;
import java.lang.*;
// Variable check class
class varCheck{
	
		
		
	
// vowel check method
	public static boolean isVowel(char c){
		String vowels = "aeiouAEIOU";
		char[] vowelsArray = vowels.toCharArray();
		
		for(char chr : vowelsArray){
			if(c == chr)
				return true;
		}
		return false;
	}

// consonants check method
	public static boolean isConsonant(char c){
		String consonants = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
		char[] consonantsArray = consonants.toCharArray();
		
		for(char chr : consonantsArray){
			if(c == chr)
				return true;
		}
		return false;	
	}	
	
}



// main class.
public class mainClass{
	public static void main(String[] args){
	
	String testString = "Difficulty of sentence";
	char[] arr = testString.toCharArray();
	varCheck varCheckObj = new varCheck();
	
	int i,hardWord=0,easyWord=0,vowel=0,consonant=0,consCount=0;
	String tempWord = "";
	
	
	for(char c: arr){
		if(c != ' '){
			tempWord += c;
		}
		
		else if(c == ' '){
			for(char letter : tempWord.toCharArray()){
				
				if(consCount!=4){
					if(varCheckObj.isVowel(letter)){
						vowel++;
						consCount=0;
					}
				
					if(varCheckObj.isConsonant(letter)){
						consonant++;
						consCount++;
					}
					
				}
				
				else{
					hardWord++;
					break;
				}	
			}
			if(consonant > vowel)
				hardWord++;
			
			else
				easyWord++;
			
			tempWord = "";
			
		}
	
	}
	System.out.println("Difficulty of sentence:" + (5*(hardWord))+(3*(easyWord)));

	}
	
}