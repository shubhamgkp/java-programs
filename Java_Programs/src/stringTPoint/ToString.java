package stringTPoint;

public class ToString {

	int age;
	String fname;
	String lname;
	
	public ToString(int age, String fname, String lname)
	{
		this.age = age;
		this.fname = fname;
		this.lname = lname;
	}
	
	public String toString()
	{
		return fname+" "+lname+" "+age;
	}
	public static void main(String[] args) {
		
		ToString obj1 = new ToString(20, "Shubham", "Verma");
		ToString obj2 = new ToString(21, "Rohit", "Pandey");
		
		System.out.println(obj1);
		System.out.println(obj2);
		
	}
}
