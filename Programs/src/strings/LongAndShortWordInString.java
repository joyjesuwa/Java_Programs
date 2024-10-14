package strings;

import java.util.Arrays;
import java.util.Comparator;

public class LongAndShortWordInString {

	public static void main(String[] args) {
		
		String sentence = "Welcome to this Java Program";
		
		String lngWrd = Arrays.stream(sentence.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null);
		String srtWrd = Arrays.stream(sentence.split(" ")).min(Comparator.comparingInt(String::length)).orElse(null);
		System.out.println(lngWrd);
		System.out.println(srtWrd);
		
		String lword[]= sentence.split(" ");
		String longWord = "";
		
		for(int i = 0; i<lword.length; i++) {
			if(lword[i].length() > longWord.length()) {
				longWord = lword[i];
			}
		}
		
		String sword[]= sentence.split(" ");
		String shortWord = "";
		
		for(int i = 0; i<sword.length; i++) {
			if(sword[i].length() < shortWord.length()) {
				shortWord = sword[i];
			}
			else
				shortWord = sword[i];
		}
		
		
		
		System.out.println(longWord);
		System.out.println(shortWord);


	}


}
