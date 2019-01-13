package string_Handling;

public class CheckDupValInString {
	
	//Finding the duplicate value in the String
	//String - abc bbc abc cda ads
	
	public static void main(String[] args) {
		
		String str = "abc bbc abc cda ads bbc cbs cda"; 
		String[] word = str.split(" ");
		
		for(int i=0;i<word.length;i++)
		{			
			for(int j=i+1;j<word.length;j++)
			{
				if(word[i].equalsIgnoreCase(word[j]))
				{					
					System.out.println("Duplicate value is - "+word[j]);
				}				
			}
		}
	}
}
