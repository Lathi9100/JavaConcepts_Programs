package Collection;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator4 implements Comparator{
	
	public int compare(Object obj1, Object obj2) {
		String str1 = (String) obj1;
		String str2 = (String) obj2;
		return str2.compareTo(str1);
		//return str1.compareTo(str2);//[AA, BHD, CCC, I, IH]
	}
}
public class Comparator4 {

	public static void main(String[] args) {
		
		TreeSet treeset = new TreeSet();
		
		treeset.add("BHD");
		treeset.add("IH");
		treeset.add("CCC");
		treeset.add("AA");
		treeset.add("I");
		System.out.println(treeset);
	}
}
