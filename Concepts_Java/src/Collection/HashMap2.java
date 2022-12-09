package Collection;

import java.util.HashMap;
class Temp{
	
	public String toString() {
		return "temp";
	}
	public void finalize() {
		System.out.println("Finalize method called...");
	}
}
public class HashMap2 {

	public static void main(String[] args) throws InterruptedException {
		
		HashMap hashmap = new HashMap();
		Integer num1 = new Integer(10);
		Integer num2 = new Integer(10);
		hashmap.put(num1,"Hello");
		hashmap.put(num2, "World");
		System.out.println(hashmap);//{10=World}
		
		HashMap hashmap1 = new HashMap();
		Temp temp = new Temp();
		
		hashmap1.put(temp, "Temp");
		System.out.println(hashmap1);//{temp=Temp}
		temp = null;
		Thread.sleep(500);
		System.out.println(hashmap1);//{temp=Temp} {temp=Temp}
	}
}
