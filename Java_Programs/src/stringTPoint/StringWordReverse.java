package stringTPoint;

public class StringWordReverse {
	
	public static void main(String[] args) {
	
		String s = "Hello Shubham Hii";
		StringBuffer sb = new StringBuffer();
		String[] word = s.split(" ");
		
		int l =word.length-1;
		
		int i =0;
		while(i<=l)
		{
			sb.append(word[i]).append(" ");
			sb.reverse();				
			System.out.println(sb);
			i++;
		}
		//System.out.println(sb);
	}
	
	

}
