package string_Handling;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollFirstNonRepeatedCharInString {
//Java Program to find duplicate characters in String
	public static void main(String[] args) {		
		printDuplicateChar("shubham");
	}
	public static void printDuplicateChar(String word){

		char[] characters = word.toCharArray();		
		// build LinkedHashMap with character and number of times they appear in String
		Map<Character,Integer> charMap = new LinkedHashMap<Character, Integer>();
		for(Character ch:characters){
			
			if(charMap.containsKey(ch)){
				charMap.put(ch, charMap.get(ch)+1);
			}else{
				charMap.put(ch, 1);
			}			
		}		
		// Iterate through HashMap to print all duplicate characters of String
		Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
		System.out.println("List of duplicate characters in String - "+word);
		for(Map.Entry<Character, Integer> entry: entrySet){
			if(entry.getValue()==1){
				System.out.println(entry.getKey()+" : "+entry.getValue());
				break;
			}			
		}
	}


}
