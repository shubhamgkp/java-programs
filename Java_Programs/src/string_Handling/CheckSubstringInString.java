package string_Handling;

import java.util.Scanner;

public class CheckSubstringInString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a String");
		String checkString = sc.nextLine();

		System.out.println("Please enter a word");
		String checkSubString = sc.nextLine();

		int count=0;
		for(String c:checkString.split(" "))
		{
			if(c.equalsIgnoreCase(checkSubString))
			{
				count++;				
			}			
		}
		System.out.println("Word "+checkSubString+" found in String "+count+" times!");
	}		

}

