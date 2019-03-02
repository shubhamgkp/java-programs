package string_Handling;

public class StringPalindrome2 {

	public static void main(String[] args) {

		String string = "madam";
		int strLen=string.length();
		int len = 0;

		for(int i=0,k=strLen-1;i<strLen;i++,k--){

			if(string.charAt(i)==string.charAt(k)){

				len++;
			}			
		}
		if(len==strLen){

			System.out.println("String is panlindrome!!");
		}
		else{
			System.out.println("String is not palindrome!!");
		}
	}	

}
