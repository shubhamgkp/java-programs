package string_Handling;

public class RevArrWthOutAffectSpecChar {
	
	public static void main(String[] args) {
		
		System.out.println(stringreverse("a,@cfghhj@/"));
	}

	public static String stringreverse(String input)
	{
		char[] ch = input.toCharArray();
		int l =0;
		int m = input.length()-1;
		
		while(l<m)
		{
			if(!Character.isAlphabetic(ch[l])){
				l++;
			}
			else if (!Character.isAlphabetic(ch[m])) {
				m--;				
			}
			else{
				char tempChar = ch[l];
				ch[l] = ch[m];
				ch[m] = tempChar;
				l++;
				m--;
			}
		}
		String revString = new String(ch);
		return revString;
	}
	
}
