package array_Programs;

import java.util.Arrays;

public class SortingSearchingEleArray {

	public static void main(String[] args) {

		//use of sort () and binarySearch () method
		int[] arr = {2, 4, 1, 13, 10, 7, 5};		
		Arrays.sort(arr);
		
		for(int n:arr){
			System.out.print(n+" ");
		}
		System.out.println();
		
		int index = Arrays.binarySearch(arr, 7);
		System.out.println("Number at index: "+index);		
	}
}
