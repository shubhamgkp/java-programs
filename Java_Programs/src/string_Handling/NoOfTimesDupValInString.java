package string_Handling;

public class NoOfTimesDupValInString {

	//Finding the number of times duplicate value in the String
	//String - abc bbc abc cda ads

	public static void main(String[] args) {

		String str = "abc bbc abc cda ads bbc cda cbs cda"; 
		String[] word = str.split(" ");
		int count =1;

		for(int i=0;i<word.length;i++)
		{			
			for(int j=i+1;j<word.length;j++)
			{
				if(word[i].equalsIgnoreCase(word[j]))
				{						
					count++;					
					word[j]="0";	//Replace repeated words by zero				
				}				
			}
			if(word[i]!="0")
			System.out.println("Duplicate value is - "+word[i]+" "+count);
			count=1;
		}
	}
}