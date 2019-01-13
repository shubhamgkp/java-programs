package string_Handling;

public class ReverseString_2 {
	
	public static void main(String[] args) {
	
		revString("Shubham Kumar Verma");
	}
	
	public static void revString(String input)
	{		
		char[] charArray = input.toCharArray();
		int left, right;
		right = charArray.length-1;
				
		for(left=0;left<right;left++,right--)
		{
			// Swap values of left and right
			char temp = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = temp;			
		}
		for(char c:charArray){
			System.out.print(c);
		}	
	}

}
