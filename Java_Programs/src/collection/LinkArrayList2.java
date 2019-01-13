package collection;

import java.util.ArrayList;
import java.util.List;

public class LinkArrayList2 {
	
	public static void main(String[] args) {
		
		List<String> alist = new ArrayList<>();
		alist.add("Shubham");
		alist.add("Shubham");
		alist.add("Rohit");
		alist.add("Rohit");
		alist.add(" ");
		alist.add("Ram");
		alist.add("Aman");
		alist.add("Rajesh");
		alist.add("Shyam");
		System.out.println(alist);
		System.out.println(alist.get(5));
		System.out.println(alist.isEmpty());
		System.out.println(alist.remove(2));
		System.out.println(alist);
		alist.add(1, "Shahani");
		System.out.println(alist);
		System.out.println(alist.contains("Shubham1"));
		
	}

}
