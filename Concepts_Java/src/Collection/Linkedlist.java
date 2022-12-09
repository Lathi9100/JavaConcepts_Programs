package Collection;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		
		LinkedList linkedlist = new LinkedList();
		
		linkedlist.add("Naiv");
		linkedlist.add(100);
		linkedlist.add(null);
		System.out.println(linkedlist);//[Naiv, 100, null]
		
		linkedlist.remove(null);
		System.out.println(linkedlist);//[Naiv, 100]
		linkedlist.set(1, "Gvel");
		System.out.println(linkedlist);//[Naiv, Gvel]
		linkedlist.removeLast();
		System.out.println(linkedlist);//[Naiv]
		linkedlist.addFirst("Neil");
		System.out.println(linkedlist);//[Neil, Naiv]
	}
}
