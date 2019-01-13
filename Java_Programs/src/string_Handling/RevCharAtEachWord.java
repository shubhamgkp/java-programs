package string_Handling;

public class RevCharAtEachWord {

	//Reversing characters in each word in a sentence

	public static void main(String[] args) {

		String str = "My name is Shubham";

		//Split sentence into words
		String[] words = str.split(" ");

		for(String eachword:words)
		{
			char[] ch = eachword.toCharArray();

			for(int i=ch.length-1;i>=0;i--)
			{
				System.out.print(ch[i]);
			}
			
			System.out.print(" ");			
		}
	}
}

