package string_Handling;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollUniqueValInList {

	//How to get Unique values from List of String?
	public static void main(String[] args) {
		
		List<String> listString = new ArrayList<String>();
		listString.add("Shubham");
		listString.add("Kumar");
		listString.add("Verma");
		listString.add("Shubham");
		listString.add("Verma");
		
		System.out.println("Initial String list - "+listString);
		System.out.println("-------------------------------------------------------------");
		
		/* Create set of String from List */
		Set<String> setString = new HashSet<>(listString);
		System.out.println("Unique values in the Set is - "+setString);
		System.out.println("-------------------------------------------------------------");
		
		/* Clear the listString */
		listString.clear();
		
		/* Add setString(Unique) values back to listString */
		listString.addAll(setString);
		System.out.println("Unique values in List is - "+listString);
	}
}
