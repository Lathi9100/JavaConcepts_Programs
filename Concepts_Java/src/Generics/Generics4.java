package Generics;

import java.util.ArrayList;
import java.util.List;

public class Generics4 {

	// Accepts only object 
	static void displayItem(List<Object> list) {
		
		for(Object obj : list) {
			System.out.println(obj);
		}
	}
	// It return all kind of object types like- String,Integer etc.,
	static void displayListItem(List<?> list) {
		for(Object obj : list) {
			System.out.println(obj);
		}
	}
	public static void main(String[] args) {
		
		List<Object> list1 = new ArrayList<>();		
		list1.add("Ram");
		list1.add("Lakshman");
		list1.add("Hanuman");		
		
		List<?> list2 = new ArrayList<>();		
		list1.add(3);
		list1.add(74);
		list1.add(32);
		
		List<?> list3 = new ArrayList<>();
		list1.add("Ram");
		list1.add("Lakshman");
		list1.add("Hanuman");
		
		displayItem(list1);
		// Not applicable for any other type
		//displayItem(list2);
		displayListItem(list2);
		displayListItem(list3);
	}
}
