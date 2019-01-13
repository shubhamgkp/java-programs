package javaBasicPrograms;

import java.util.Scanner;

public class TakingInputFromUser {

	public static void main(String[] args) {
		
		System.out.println("Please enter a number -");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Entered number is -"+n);
	}
}
