package string_Handling;

public class StringPalindrome {
	
	public static void main(String[] args) {
		
		String string = "AMMa";
		
		String result = "";
		
		int i = string.length()-1;
		while(i>=0){
			
			result = result+string.charAt(i);
			i--;
		}
		
		if(string.equals(result)){
			
			System.out.println("The string is palindrome.");
		}
		else{
			
			System.out.println("The string is not palindrome.");
		}
	}	

}
