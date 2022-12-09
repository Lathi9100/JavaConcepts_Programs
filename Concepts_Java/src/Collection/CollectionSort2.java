package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Comparator9 implements Comparator{
	
	public int compare(Object obj1, Object obj2) {
		Integer num1 = (Integer)obj1;
		Integer num2 = (Integer)obj2;
		if(num1 < num2) {
			return -1;
		}else if(num1 > num2){
			return 1;
		}else {
			return 0;
		}
	}
}
public class CollectionSort2 {

	public static void main(String[] args) {
		
		ArrayList arraylist = new ArrayList();
		arraylist.add(2);
		arraylist.add(8);
		arraylist.add(7);
		arraylist.add(4);
		arraylist.add(10);
		arraylist.add(9);
		arraylist.add(5);
		System.out.println(arraylist);//[2, 8, 7, 4, 10, 9, 5]
		//Collections.sort(arraylist);
		//System.out.println(arraylist);//[2, 4, 5, 7, 8, 9, 10]
		Collections.sort(arraylist, new Comparator9());
		System.out.println(arraylist);//[2, 4, 5, 7, 8, 9, 10]
	}
}
