package Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator1 {

	public static void main(String[] args) {
		
	
	ArrayList arraylist = new ArrayList();
	
	for(char i='A';i<='F';i++) {
		arraylist.add(i);
	}
	 System.out.println(arraylist);//[A, B, C, D, E, F]
	ListIterator listIterator = arraylist.listIterator();
	// Print the elements in forward direction
	while(listIterator.hasNext()) {
		char i= (char)listIterator.next();
		System.out.print(i+" ");//A B C D E F 
	}
	System.out.println();
	// Print the elements in backward direction
	while(listIterator.hasPrevious()) {
		char i = (char)listIterator.previous();
		System.out.print(i+" ");//F E D C B A 
		
	}	
		
  }
}
