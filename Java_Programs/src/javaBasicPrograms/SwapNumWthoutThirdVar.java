package javaBasicPrograms;

public class SwapNumWthoutThirdVar {

	public static void main(String[] args) {

		int m = 5;
		int n = 3;
		
		m = m+n;
		n = m-n;
		m = m-n;
		System.out.println("Value of m is - "+m);
		System.out.println("Value of n is - "+n);
	}
}
