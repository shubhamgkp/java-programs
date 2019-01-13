package collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetLinkedHashSet {
	
	public static void main(String[] args) {
		
		Set<String> lhset = new LinkedHashSet<String>();
		lhset.add("Data1");
		lhset.add("Data3");
		lhset.add("Data2");
		lhset.add("Data5");
		lhset.add("Data4");
		System.out.println(lhset);
	}

}
