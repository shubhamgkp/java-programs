package javaBasicPrograms;

import java.util.Scanner;

public class FactorialNum {

	public static void main(String[] args) {

		//5! = 5*4*3*2*1
		System.out.println("Please enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = 1; 
		while(num>0){
			temp = temp*num;
			num = num-1;
		}
		System.out.println(temp);
	}
}
