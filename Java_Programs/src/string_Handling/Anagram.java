package string_Handling;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		isAnagram("Shubham", "masubhh");		
	}
	public static void isAnagram(String str1, String str2){

		String s1 = str1.replaceAll("\\s", "");
		String s2 = str2.replaceAll("\\s", "");
		boolean status = true;
		if(s1.length()!=s2.length()){
			status = false;
		}
		else{
			char[] char1 = s1.toLowerCase().toCharArray();
			char[] char2 = s2.toLowerCase().toCharArray();
			Arrays.sort(char1);
			Arrays.sort(char2);
			status=Arrays.equals(char1, char2);
		}
		if(status){
			System.out.println(s1+" and "+s2 +" are anagram!" );
		}
		else{
			System.out.println(s1+" and "+s2 +" are not anagram!" );
		}
	}
}
