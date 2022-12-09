package Collection;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator1 implements Comparator{
	
	public int compare(Object obj1,Object obj2) {
		
		int ob1 = (int)obj1;
		int ob2 = (int)obj2;
		
		if(ob1 > ob2) {
			return -1;
		}else if(ob1 < ob2) {
			return +1000;
		}else {
		return 0;
		}
	}
}

public class Comparator1 {

	public static void main(String[] args) {	
		TreeSet treeset = new TreeSet(new MyComparator1());	
		treeset.add(5);
		treeset.add(7);
		treeset.add(75);
		treeset.add(9);
		
		System.out.println(treeset);//[75, 9, 7, 5]
	}
}
