package Collection;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
		
		HashMap hashmap = new HashMap();
		hashmap.put(100, "powerstar");
		hashmap.put(200, "megastar");
		hashmap.put(300, "darling");
		hashmap.put(400, "mass");
		hashmap.put(500, "superstar");
		System.out.println(hashmap);//{400=mass, 100=powerstar, 500=superstar, 200=megastar, 300=darling}
		
		Set set = hashmap.keySet();
		System.out.println(set);//[400, 100, 500, 200, 300]
		Collection collection = hashmap.values();
		System.out.println(collection);//[mass, powerstar, superstar, megastar, darling]
		
		Set entryset = hashmap.entrySet();
		Iterator iterator = entryset.iterator();
		while(iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			System.out.println(entry.getKey() +"..."+entry.getValue());
																		//			400...mass
																		//			100...powerstar
																		//			500...superstar
																		//			200...megastar
																		//			300...darling
			if(entry.getKey().equals(100)) {
				entry.setValue("Power Star");
			}
		}
		System.out.println(hashmap);//{400=mass, 100=Power Star, 500=superstar, 200=megastar, 300=darling}

	}
}
