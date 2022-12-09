package Collection;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator2 implements Comparator{
	public int compare(Object obj1, Object obj2) {
		
		String str1 = (String) obj1;
		String str2 = (String) obj2;
		
		return str2.compareTo(str1);//[U, Q, P, A]
		//return str1.compareTo(str2);//[A, P, Q, U]
		//return 0;//[P]
	}
}
public class Comparator2 {
	public static void main(String[] args) {
		TreeSet treeset = new TreeSet(new MyComparator2());
		
		treeset.add("P");
		treeset.add("U");
		treeset.add("A");
		treeset.add("Q");
		System.out.println(treeset);
	}
}
