package javaBasicPrograms;

import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args) {

		System.out.println("Please enter the number to print the table");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for(int i =1;i<=10;i++){

			System.out.println(i*num);
		}
	}

}
