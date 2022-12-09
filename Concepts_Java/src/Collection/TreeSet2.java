package Collection;

import java.util.TreeSet;

public class TreeSet2 {

	public static void main(String[] args) {
		
		TreeSet<Integer> treeset = new TreeSet<Integer>();
		treeset.add(100);
		treeset.add(200);
		treeset.add(300);
		treeset.add(400);
		treeset.add(500);
		
		System.out.println(treeset);//[100, 200, 300, 400, 500]
		System.out.println(treeset.ceiling(100));//100
		System.out.println(treeset.higher(400));//500
		System.out.println(treeset.floor(300));//300
		System.out.println(treeset.lower(500));//400
		System.out.println(treeset.higher(300));//400
		System.out.println(treeset.pollFirst());//100
		System.out.println(treeset.pollLast());//500
		System.out.println(treeset);//[200, 300, 400]
	}
}
