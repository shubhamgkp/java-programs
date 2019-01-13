package javaBasicPrograms;

import java.util.Scanner;

public class NumPalindrome {

	//Palindrome - 121
	/*int quotient = dividend / divisor;
    int remainder = dividend % divisor;*/

	public static void main(String[] args) {

		System.out.println("Please enter a number -");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = 0;
		int actualVal = num;

		while(num>0){

			temp = temp*10;
			temp = temp+num%10;			
			num = num/10;			
		}
		System.out.println("Reverse Number is -"+temp);
		if(actualVal==temp){
			System.out.println("Number is palindrome!");
		}
		else{
			System.out.println("Number is not palindrome!");
		}
	}
}
