package array_Programs;

public class LinearSearch {

	public static void main(String[] args) {
		
		int[] arr = {12,25,6,12,18,35,19,30};
		int target = 19;
		
		for(int i=0;i<arr.length;i++){
			
			if(target==arr[i]){
				
				System.out.println("Element found at index "+i);
				break;
			}
		}
	}
}
