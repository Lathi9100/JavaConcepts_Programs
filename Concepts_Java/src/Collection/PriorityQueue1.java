package Collection;

import java.util.Comparator;
import java.util.PriorityQueue;
class MyComparator8 implements Comparator{
	
	public int compare(Object o1, Object o2) {
		String str1 = (String) o1;
		String str2 = (String) o2;
		return str2.compareTo(str1);//[J, B, E, A]
		//return str1.compareTo(str2);//[A, B, J, E]
	}
}
public class PriorityQueue1 {

	public static void main(String[] args) {
		
		PriorityQueue pq = new PriorityQueue(new MyComparator8());
		pq.offer("A");
		pq.offer("E");
		pq.offer("J");
		pq.offer("B");
		System.out.println(pq);//[A, B, J, E]
	}
}
