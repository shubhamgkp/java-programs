package string_Handling;

import java.util.ArrayList;
import java.util.List;

public class ReverseStringByWord {

	public static void main(String[] args) {
		
		//Reverse string by WORDS:
		
		String s = "Hello World Shubham";
		
		StringBuilder sbuild = new StringBuilder();		
		
		String[] words = s.split(" ");		

		int j=words.length-1;
		while (j>=0) {

			sbuild.append(words[j]).append(" ");
			j--;
		}
		System.out.println("Reverse Word is - "+sbuild); 

	}
}
