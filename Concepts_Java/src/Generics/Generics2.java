package Generics;

import java.util.ArrayList;
import java.util.List;

public class Generics2 {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add("kate");
		list.add("wil");
		list.add(new Integer(7));
		try {
			for(Object obj : list) {
				// Class cast Exception will occur
				String str = (String) obj;
				System.out.println(str);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
		List list1 = new ArrayList();
		list1.add("Iron");
		list1.add("Silver");
		list1.add("Steel");
		System.out.println(list1);
	}
}
