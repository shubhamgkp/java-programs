package loops_Programs;

public class FibonacciSeries {
	
	//Fibonacci series upto a given number
	
	public static void main(String[] args) {
		
		//Starts with 0,1 - 0 1 1 2 3 5 8 13
		int n1 = 0, n2=1;				
		
		while (n1<=100) {
			
			System.out.print(n1+" ");
			int sum = n1+n2;			
			n1=n2;
			n2=sum;			
		}			
	}
}
