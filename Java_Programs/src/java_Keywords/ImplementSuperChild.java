package java_Keywords;

public class ImplementSuperChild extends ImplementSuperParent{

	//super keyword is used to differentiate Parent variable and Child variable 
	//if both the variable having the same name
	//Otherwise super keyword is not required   
	public void childClass(){
		String name = "I am Child Variable!!";
		System.out.println(name);
		System.out.println(super.name);				
	}	
	
	public ImplementSuperChild()
	{
		//super() should be always be at first line
		//No need to call super() if no argument pass to parent constructor, it automatically 
		//call when child class extend the parent class
		super("with argument passed!!");
		System.out.println("I am child class constructor!!");
	}
	
	public void getData()
	{
		//super keyword because of same method name in both parent and child class
		super.getData();
		System.out.println("I am child class method!!");
	}
	
	public static void main(String[] args) {
				
		ImplementSuperChild obj = new ImplementSuperChild();
		obj.childClass();		
		obj.getData();
	}
}
