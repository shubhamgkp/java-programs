package javaBasicPrograms;

import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args) {

		System.out.println("Please enter a number -");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean isPrime;

		if(num<2){
			isPrime = false;
		}
		else{
			isPrime = true;
		}
		for(int i=2;i<num/2;i++){

			if(num%i==0){
				isPrime = false;
				break;
			}
			else{
				isPrime = true;
			}
		}
		if(isPrime){
			System.out.println("Number is prime!");
		}
		else{
			System.out.println("Number is not prime!");
		}
	}
}