package collection;

import java.util.HashSet;
import java.util.Set;

public class SetHashSet2 {
	
	public static void main(String[] args) {
		
		Set<String> hset = new HashSet<String>();
		hset.add("Shubham");
		hset.add("Shubham");
		hset.add("ShubhamK");
		hset.add("Ramesh");
		hset.add("Rajesh");
		hset.add("Pandey");
		hset.add("Pandey");
		hset.add("");
		System.out.println(hset);
		System.out.println(hset.size());
		System.out.println(hset.contains("ShubhamV"));
		hset.remove("Shubham");
		hset.remove("ShubhamK");
		hset.remove("Pandey");
		System.out.println(hset);
		System.out.println(hset.isEmpty());
		
	}
}