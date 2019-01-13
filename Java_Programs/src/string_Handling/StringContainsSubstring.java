package string_Handling;

import java.util.Scanner;

public class StringContainsSubstring {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first String");
		String s1 = scanner.nextLine();
		
		System.out.println("Enter second String");
		String s2 = scanner.nextLine();
		
		scanner.close();
		boolean result = stringContainSubstring(s1, s2);
		System.out.println(s1+" contains "+s2+" = "+result);
		
	}
	
	public static boolean stringContainSubstring(String string, String substring){
		
		boolean result = false;
		result = string.contains(substring);
		return result;		
	}
}
