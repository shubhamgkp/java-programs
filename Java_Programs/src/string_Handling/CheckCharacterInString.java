package string_Handling;

import java.util.Scanner;

public class CheckCharacterInString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a String");
		String checkString = sc.nextLine();

		System.out.println("Please enter a character which you want to find in the string as well as how many times");
		char checkChar = sc.nextLine().charAt(0);

		int cn=0;
		for(char c:checkString.toCharArray())
		{
			if(c==checkChar)
			{
				cn++;				
			}			
		}
		System.out.println("Character "+checkChar+" found in String "+cn+" times!");
	}
}
