package iterators;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Iterator2 {
	
	public static void main(String[] args) {
		
		Set<String> alist = new HashSet<String>();
		//List alist = new ArrayList();
		alist.add("Item1");
		alist.add("Item2");
		alist.add("Item3");
		alist.add("Item4");
		alist.add("Item5");
		System.out.println(alist);
		Iterator<String> itr = alist.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());			
		}
		
	}

}
