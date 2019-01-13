package array_Programs;

import java.util.Arrays;

public class ArrayProg1 {

	public static void main(String[] args) {
		
		//Sort the array - [2,0,3,4,0,0,12,2,0] to [2,3,4,12,2,0,0,0,0]
		
		int[] arr = {2,0,3,4,0,0,12,2,0};
		sortArray(arr);
		for(int it:arr){
			
			System.out.print(it+" ");
		}
	}
	public static void sortArray(int[] myArr){
		
		int n=myArr.length;
		int temp=0;
		for(int i=0;i<n;i++){
			
			for(int j=1;j<n-i;j++){
				
				if(myArr[j-1]<myArr[j]){
					
					temp=myArr[j-1];
					myArr[j-1]=myArr[j];
					myArr[j]=temp;
				}
			}
		}
	}
}
