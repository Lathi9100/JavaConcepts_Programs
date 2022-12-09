package Generics;

import java.util.ArrayList;
import java.util.List;

public class Generics5 {

	public static void displayItem(List<Number> list) {
		double number;
		for(Number num : list) {
			number = num.doubleValue();
			System.out.println(number * number);
		}
	}
	public static void displayListItem(List<? extends Number> list) {
		double number;
		for(Number num : list) {
			number = num.doubleValue();
			System.out.println(number * number);
		}
	}
	public static void main(String[] args) {
		List<Number> list = new ArrayList<>();
		list.add(4);
		list.add(8);
		list.add(4);
		
		// only accept number type list
		displayItem(list);
		
		List<Double> list1 = new ArrayList<>();
		list1.add(1.8);
		list1.add(8.6);
		list1.add(4.4);
		
		// accept number type list and sub type values
		displayListItem(list1);
		displayListItem(list);
	}
}
