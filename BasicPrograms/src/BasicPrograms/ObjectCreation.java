package BasicPrograms;

//9) How to Create Object in Java
public class ObjectCreation implements Cloneable{

	public void show(){
		System.out.println("Object has been Created");
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	String str = "Object created ";
	public static void main(String[] args) {
		// 1.
		// Object creation using new KeyWord
		//ObjectCreation obj = new ObjectCreation();
		//obj.show();
		
		//2.
		//Object creation using clone
//		ObjectCreation obj = new ObjectCreation();
//				
//				
//					ObjectCreation obj1;
//					try {
//						obj1 = (ObjectCreation) obj.clone();
//						System.out.println(obj1.str);
//					} catch (CloneNotSupportedException e) {
//						e.printStackTrace();
//					}
			
		//3
		
		
		
		
		
		
		
	}
}
