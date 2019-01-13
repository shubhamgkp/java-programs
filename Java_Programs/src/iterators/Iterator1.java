package iterators;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Iterator1 {
	
	public static void main(String[] args) {
		
		Set<String> hset = new HashSet<String>();
		hset.add("Item1");
		hset.add("Item2");
		hset.add("Item3");
		hset.add("Item4");
		hset.add("Item5");
		System.out.println(hset);
		Iterator<String> itr = hset.iterator();		
		while (itr.hasNext()) {
			System.out.println(itr.next());			
		}
	}

}
