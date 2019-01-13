package string_Handling;

public class CapitilizeFirstChar {

	//How to capitalize the first character of each word in a string
	public static void main(String[] args) {
		
		String outputStr = CapsFirstChar("my name is shubham!");
		System.out.println(outputStr);
	}
	
	public static String CapsFirstChar(String str){
		
		 String[] splitStr = str.split(" ");
		 StringBuffer strBuffer = new StringBuffer();
		 
		 for(int i=0;i<splitStr.length;i++){
			 strBuffer.append(Character.toUpperCase(splitStr[i].charAt(0))).
			 append(splitStr[i].substring(1)).append(" ");			 
		 }
		 return strBuffer.toString().trim();
	}
}
