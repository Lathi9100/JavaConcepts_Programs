package Generics;

import java.util.ArrayList;
import java.util.List;

public class Generics6 {

	public static void displayItem(List<Integer> list) {
		for(Integer num : list) {
			System.out.println(num);
		}
	}
	public static void displayListItem(List<? super Integer> list) {
		for(Object obj : list) {
			System.out.println(obj);
		}
	}
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(8);
		list.add(4);
		
		// only accept Integer type list
		displayItem(list);
		
		List<Number> list1 = new ArrayList<>();
		list1.add(1.8);
		list1.add(8.6);
		list1.add(4.4);
		
		// accept number type list and sub type values
		displayListItem(list1);
		displayListItem(list);
	}
}
