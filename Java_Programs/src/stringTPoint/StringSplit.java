package stringTPoint;

import java.util.List;

public class StringSplit {
	
	public static void main(String[] args) {
		
		String str = "Hello Shubham Verma";
		String[] words = str.split(" ");
		
		for(String s:words)
		{
			System.out.println(s);
		}
	}

}
