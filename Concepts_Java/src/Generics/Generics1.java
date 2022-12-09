package Generics;

import java.util.ArrayList;
import java.util.List;

public class Generics1 {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add("kanya");
		list.add("West");
		// wont thorugh an error because it was'nt mentioned the type of values
		list.add(new Integer(8));
		System.out.println(list);
		List<String> list1 = new ArrayList<>();
		list1.add("kate");
		list1.add("wil");
		// Throws an error trying to give numeric value instead of String
		//list1.add(new Integer(6));
		System.out.println(list1);
	}
}
