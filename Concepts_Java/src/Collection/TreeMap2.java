package Collection;

import java.util.Comparator;
import java.util.TreeMap;

class MyComparator6 implements Comparator{
	
	public int compare(Object obj1, Object obj2) {
		Integer num1 = (Integer)obj1;
		Integer num2 = (Integer)obj2;
		return num1.compareTo(num2);
		
	}
}
public class TreeMap2 {

	public static void main(String[] args) {
		
	TreeMap treemap = new TreeMap(new MyComparator6());
	treemap.put(100, "ABC");
	treemap.put(105, "BBB");
	treemap.put(101, "POI");
	treemap.put(109, 198);
	//treemap.put("sdf", "gadf");// Classcast exception runtime
	//treemap.put(null,987);//null pointer exception at runtime
	System.out.println(treemap);//{100=ABC, 101=POI, 105=BBB, 109=198}
	}
}
