package string_Handling;

import java.util.HashMap;
import java.util.Map;

public class DistinctCharCount {
	
	public static void main(String[] args) {		
		
			DistinctCharWithCount("Shubham");			
		}
	
	public static void DistinctCharWithCount(String input){
		
		Map<Character, Integer> charsWithCountMap = new HashMap<>();
		for(char c:input.toCharArray()){
			charsWithCountMap.merge(c, 1, Integer::sum);
			System.out.println(charsWithCountMap);
		}
	
	}

}
