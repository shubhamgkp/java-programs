package string_Handling;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollUniqueValInString {
	
	public static void main(String[] args) {
		
		String str = "Shubham Kumar Verma Shubham Verma";
		String[] words = str.split(" ");
		List<String> listString= Arrays.asList(words);
		System.out.println(listString);
		
		Set<String> setString = new HashSet<>(listString);
		System.out.println(setString);		
	}
}
