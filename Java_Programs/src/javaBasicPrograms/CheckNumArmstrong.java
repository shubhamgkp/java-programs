package javaBasicPrograms;

import java.util.Scanner;

public class CheckNumArmstrong {

	public static void main(String[] args) {
		
		//153 = (1*1*1)+(5*5*5)+(3*3*3)   - Armstrong Number
		//0, 1, 153, 370, 371, 407 - Armstrong Number's example 
		System.out.println("Please enter a number -");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp;
		int actualval = num;
		int sum = 0; 
		
		while (num>0) {
			temp = num%10;			
			num = num/10;
			sum = sum+temp*temp*temp;
		}
		if(actualval==sum){
			System.out.println("Number is armstrong!");
		}
		else{
			System.out.println("Number is not armstrong!");
		}
	}
}
