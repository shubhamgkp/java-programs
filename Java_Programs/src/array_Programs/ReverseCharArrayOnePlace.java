package array_Programs;

public class ReverseCharArrayOnePlace {
	
	public static void main(String[] args) {
	
		String str = "information";
		int n=str.length();
		char[] chr=str.toCharArray();
		
		for(int i=0;i<n/2;i++){
			
			char temp =chr[i];
			chr[i]=chr[n-1-i];
			chr[n-1-i]=temp;
		}
		System.out.print(chr);
	}	
}
