package Collection;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator3 implements Comparator{
	
	public int compare(Object obj1, Object obj2) {
		String str1 = (String) obj1;
		String str2 = (String) obj2;
		
		return str1.compareTo(str2);
	}
}
public class Comparator3 {

	public static void main(String[] args) {
		
	
	TreeSet treeset = new TreeSet(new MyComparator3());
	
	treeset.add(new StringBuffer("B"));
	treeset.add(new StringBuffer("N"));
	treeset.add("HG");
	treeset.add(new StringBuffer("P"));
	
	System.out.println(treeset);
	}
}
//Exception occurs
//Exception in thread "main" java.lang.ClassCastException: class java.lang.StringBuffer cannot be cast to class java.lang.String (java.lang.StringBuffer and java.lang.String are in module java.base of loader 'bootstrap')
//at Concepts_Java/Collection.MyComparator3.compare(Comparator3.java:9)
//at java.base/java.util.TreeMap.compare(TreeMap.java:1570)
//at java.base/java.util.TreeMap.addEntryToEmptyMap(TreeMap.java:776)
//at java.base/java.util.TreeMap.put(TreeMap.java:785)
//at java.base/java.util.TreeMap.put(TreeMap.java:534)
//at java.base/java.util.TreeSet.add(TreeSet.java:255)
//at Concepts_Java/Collection.Comparator3.main(Comparator3.java:22)
