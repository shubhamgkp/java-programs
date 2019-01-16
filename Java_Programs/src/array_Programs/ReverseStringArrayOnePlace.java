package array_Programs;

public class ReverseStringArrayOnePlace {
	
	public static void main(String[] args) {
	
		String[] str={"ashu","shubham","singh"};
		int n=str.length;
				
		for(int i=0;i<n/2;i++){
			
			String temp =str[i];
			str[i]=str[n-1-i];
			str[n-1-i]=temp;
		}
		for(String revStr:str){
			System.out.print(revStr+" ");
		}
	}	
}
