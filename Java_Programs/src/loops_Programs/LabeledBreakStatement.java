package loops_Programs;

public class LabeledBreakStatement {

	public static void main(String[] args) {

		first:
			for(int i=1;i<=5;i++){

				for(int j=1;j<=3;j++){

					System.out.println("j="+j+" i="+i);

					if(j==2){
						break first;
					}					
				}
			}
	}
}
