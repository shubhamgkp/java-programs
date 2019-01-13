package loops_Programs;

public class PrintTableWhile {
	
	public static void tablePrintWhile(int n){
		
		int i = 1;
		while(i<=10){
			
			System.out.println(n+"*"+i+" = "+n*i);
			i++;
		}
	}
	
	public static void main(String[] args) {
		
		PrintTableWhile.tablePrintWhile(7);
	}

}
