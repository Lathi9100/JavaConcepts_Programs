package ExamplePrograms;

public class ExceptinHandling1 {

	//nested try blocks
	public static void main(String[] args) {
		
		int[] array = new int[5];
		for(int i=0;i<5;i++) {
			array[i] =i;
			try {
				System.out.println(i);
				try {
					System.out.println(array[7]);
				}catch(IndexOutOfBoundsException io) {
					System.out.println("nested catch block "+io);
				}
				finally {
					System.out.println("nested finally block");
				}
				System.out.println("Rest of the code");
			}catch(Exception e) {
				System.out.println("Normal catch block "+e);
			}
			finally {
				System.out.println("Normal finally block");
			}
			System.out.println("Rest of the code");
		}
	}
}
