package Collection;

import java.util.Comparator;
import java.util.TreeSet;

class Employee implements Comparable{
	int emp;
	
	Employee(int emp){
		this.emp=emp;
	}
	public String toString() {
		return "emp-" +emp;
	}
	@Override
	public int compareTo(Object obj) {
		
		Integer num1 = this.emp;
		Integer num2 = ((Employee) obj).emp	;
		
		return num1.compareTo(num2);
	}
}
class MyComparator5 implements Comparator{
	
	@Override
	public int compare(Object obj1, Object obj2) {
		Integer num1 = ((Employee)obj1).emp;
		Integer num2 = ((Employee)obj2).emp;
		return num2.compareTo(num1);
	}

}
public class Comparator5 {

	public static void main(String[] args) {
		
		TreeSet comparabletreeset = new TreeSet();
		
		comparabletreeset.add(new Employee(10));
		comparabletreeset.add(new Employee(5));
		comparabletreeset.add(new Employee(6));
		comparabletreeset.add(new Employee(12));
		System.out.println(comparabletreeset);//[emp-5, emp-6, emp-10, emp-12]
		
		TreeSet comparatortreeset = new TreeSet(new MyComparator5());
		comparatortreeset.add(new Employee(10));
		comparatortreeset.add(new Employee(5));
		comparatortreeset.add(new Employee(6));
		comparatortreeset.add(new Employee(12));
		System.out.println(comparatortreeset);//[emp-12, emp-10, emp-6, emp-5]
	}
}
