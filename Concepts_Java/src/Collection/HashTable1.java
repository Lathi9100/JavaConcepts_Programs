package Collection;

import java.util.Hashtable;
class Temp1{
	int i;
	Temp1(int i){
		this.i=i;
	}
	public String toString() {
		return ""+i;
	}
	public int hashcode() {
		return i;
	}
}
public class HashTable1 {

	public static void main(String[] args) {
		Hashtable hashtable = new Hashtable();
		hashtable.put(new Temp1(5), "B");
		hashtable.put(new Temp1(2), "A");
		hashtable.put(new Temp1(6), "C");
		hashtable.put(new Temp1(14), "D");
		hashtable.put(new Temp1(17), "E");
		hashtable.put(new Temp1(23), "F");
		System.out.println(hashtable);//{23=F, 14=D, 5=B, 17=E, 6=C, 2=A}
	}
}
