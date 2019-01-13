package array_Programs;

public class BubbleSortDesc {

	public static void main(String[] args) {

		int[] arr = {32,10,5,20,38};
		bubbleSort(arr);
		for(int n:arr){
			System.out.println(n);			
		}
	}

	public static void bubbleSort(int[] myarr){

		int temp = 0;
		int arrLength = myarr.length; 
		for(int i=0;i<arrLength;i++){

			for(int j=1;j<arrLength-i;j++){

				if(myarr[j-1]<myarr[j]){

					temp=myarr[j-1];
					myarr[j-1]=myarr[j];
					myarr[j]=temp;					
				}				
			}
		}		
	}
}
