package stringTPoint;

public class ToString2 {

	int age;
	String fname;
	String lname;
	
	public ToString2(int age, String fname, String lname)
	{
		this.age = age;
		this.fname = fname;
		this.lname = lname;
	}
	public static void main(String[] args) {
		
		ToString2 obj1 = new ToString2(20, "Shubham", "Verma");
		ToString2 obj2 = new ToString2(21, "Rohit", "Pandey");
		
		System.out.println(obj1);
		System.out.println(obj2);
		
	}
}
