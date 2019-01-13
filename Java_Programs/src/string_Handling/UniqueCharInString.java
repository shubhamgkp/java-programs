package string_Handling;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharInString {

	public static void main(String[] args) {
		
		String str = "abcdabcd";
		removeDuplicate(str);
	}
	public static void removeDuplicate(String word){

		Set<Character> hSet = new HashSet<>();
		StringBuffer strBuffer = new StringBuffer();

		for(int i=0;i<word.length();i++){

			Character ch = word.charAt(i);
			if(!(hSet.contains(ch))){
				hSet.add(ch);
				strBuffer.append(ch);
			}
		}
		System.out.println(strBuffer);
	}
}
