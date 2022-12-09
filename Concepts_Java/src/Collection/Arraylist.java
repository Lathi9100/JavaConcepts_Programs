package Collection;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		
		ArrayList arraylist = new ArrayList();
		arraylist.add("Naiv");
		arraylist.add(100);
		arraylist.add(null);
		System.out.println(arraylist);//[Naiv, 100, null]
		
		arraylist.remove(2);
		System.out.println(arraylist);//[Naiv, 100]
		arraylist.set(1,"Diell");
		System.out.println(arraylist);//[Naiv, Diell, 100]
	}
}
