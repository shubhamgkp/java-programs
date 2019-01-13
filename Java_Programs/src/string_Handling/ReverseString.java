package string_Handling;

public class ReverseString {

	public static void main(String[] args) {

		String s = "Hello World Shubham";

		//System.out.println(new StringBuilder(s).reverse().toString());

		/*StringBuffer sb = new StringBuffer(s).reverse();
		System.out.println(sb.toString());*/		

		/*String string = new StringBuffer(s).reverse().toString();
		System.out.println(string);*/

		//Reverse string by CHARACTERS:
		String result = "";
		int i=s.length()-1;
		while(i>=0){
			result = result+s.charAt(i);			
			i--;			
		}
		System.out.println(result);
	}
}