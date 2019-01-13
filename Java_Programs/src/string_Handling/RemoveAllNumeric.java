package string_Handling;

public class RemoveAllNumeric {
	
	public static void main(String[] args) {
		
		removeNumeric("Shu224242gdfbgbfgdfhbdhreuyy1324");
	}

	public static void removeNumeric(String str){
		
		String replaceStr = str.replaceAll("[^A-Za-z]", "");
		System.out.println(replaceStr);
	}
}
