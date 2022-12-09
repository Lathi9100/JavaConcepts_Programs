package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1 {

	public static void main(String[] args) {
		ArrayList arraylist = new ArrayList();
		
		for(int i=1;i<=10;i++) {
			arraylist.add(i);
		}
		System.out.println(arraylist);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		Iterator iterator = arraylist.iterator();
		while(iterator.hasNext()) {
			int i =(int) iterator.next();
			if(i % 2 != 0) {
				System.out.print(i+" ");//1 3 5 7 9
			}else {
				iterator.remove();
			}
		}
		System.out.println(arraylist);//[1, 3, 5, 7, 9]
	}
}
