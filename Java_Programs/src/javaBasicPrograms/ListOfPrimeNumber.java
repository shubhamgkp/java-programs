package javaBasicPrograms;


public class ListOfPrimeNumber {

	public static void main(String[] args) {

		System.out.println("List of Prime Numbers -");
		boolean isPrime;

		for(int num =5;num<=50;num++){
			
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
				System.out.println(num);
			}			
		}
		
	}
}