package Generics;

import java.util.ArrayList;
import java.util.List;
// unbounded wildcard
public class Generics3 {

	// Accepting only object values
	public static void displayItem(List<Object> list) {
		
		for(Object listItem : list) {
			System.out.println(listItem);
		}
	}
	// Accepting any type of values
	public static void displaylistItem(List<?> list) {
		for(Object listItem : list) {
			System.out.println(listItem);
		}
	}
	
	public static void main(String[] args) {
		
		List<Object> list1 = new ArrayList<>();
		list1.add("Michell");
		list1.add("Reive");
		list1.add("moine");
		// Only accept object type values
		displayItem(list1);
		
		List<String> list2 = new ArrayList<>();
			list2.add("Sugar");
			list2.add("Coffee");
			list2.add("milk");
		System.out.println();
			// Accepting any type of values
			displaylistItem(list2);
	}
}
