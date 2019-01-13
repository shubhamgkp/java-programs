package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapHashMap {
	
	public static void main(String[] args) {
		
		Map<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(0, "Shubham");
		hmap.put(1, "Ram");
		hmap.put(2, "Ramesh");
		hmap.put(3, "Rakesh");
		hmap.put(4, "Rajesh");
		
		System.out.println(hmap.get(1));
		hmap.remove(2);
		System.out.println(hmap);
		
		Set set = hmap.entrySet();
		Iterator itr = set.iterator();
		
		while (itr.hasNext()) {
			
			Map.Entry mp = (Map.Entry) itr.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());			
		}		
	}
}
