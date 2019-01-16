package array_Programs;

public class ReverseIntArrayOnePlace {
	
	public static void main(String[] args) {
	
		int[] value={10,20,30,40,50,60};
		int n=value.length;
				
		for(int i=0;i<n/2;i++){
			
			int temp =value[i];
			value[i]=value[n-1-i];
			value[n-1-i]=temp;
		}
		for(int num:value){
			System.out.print(num+" ");
		}
	}	
}
