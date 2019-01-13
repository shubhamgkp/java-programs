package loops_Programs;

public class StarPrintType4 {
	
	public static void main(String[] args) {

		for(int i=5;i>0;i--){

			for(int j=i;j>1;j--){
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--){
				System.out.print("*");
			}
			for(int l=5;l>i;l--){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
