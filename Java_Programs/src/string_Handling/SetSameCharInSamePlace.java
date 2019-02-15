package string_Handling;

import java.util.Arrays;

public class SetSameCharInSamePlace {

	public static void main(String[] args) {

		//101010101=111110000
		setSameCharSamePlace("10101010110101");
	}

	public static void setSameCharSamePlace(String value){

		char[] ch= value.toCharArray();

		Arrays.sort(ch);	//sorted in ascending
		int n=ch.length;
		for(int i=n-1;i>=0;i--){

			System.out.print(ch[i]);
		}
	}
}
