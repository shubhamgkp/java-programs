package practice;

public class ClaB {

	public static void main(String[] args) {

		Clas obj = new Clas() {
					
			public void A() {
				
				System.out.println("A");
			}

			public void B() {
				
				System.out.println("B");

			}


		};
		
		obj.A();
		obj.B();
		obj.C();
		obj.D();
		obj.E();
	}
}
