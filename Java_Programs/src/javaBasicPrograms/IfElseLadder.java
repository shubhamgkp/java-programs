package javaBasicPrograms;

import java.util.Scanner;

public class IfElseLadder {

	public static void main(String[] args) {
		
		System.out.println("Please enter % marks -");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		
		
		if(n>0&&n<33){
			System.out.println("Fail");
		}
		else if(n>=33&&n<45){
			System.out.println("Third division");
		}
		else if(n>=45&&n<60){
			System.out.println("Second division");
		}
		else if(n>=60&&n<80){
			System.out.println("First division");
		}
		else if(n>=80&&n<90){
			System.out.println("Excellent");			
		}
		else if(n>=90){
			System.out.println("Topper");
		}
		else{
			System.out.println("Please enter correct input!");
		}			
	}
}
