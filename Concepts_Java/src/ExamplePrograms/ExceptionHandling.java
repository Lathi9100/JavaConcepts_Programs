package ExamplePrograms;

public class ExceptionHandling {

	// Arithmatic Exception handled through try catch
	//Multiple catch blocks
	//finally block
	public static void main(String[] args) {
		
		try {
		System.out.println(10/0);
		}catch(IndexOutOfBoundsException i) {
			//get messege
			System.out.println(i.getMessage());
			System.out.println("Index out of bounds Exception Occured");
		}catch(StackOverflowError s) {			
			// get class
			System.out.println(s.getClass());
			System.out.println("Stack Overflow Error Occured");
		}catch(ArithmeticException a) {			
			// get cause
			System.out.println(a.getCause());
			System.out.println("Arithmetic Exception Occured");
		}
		catch(Exception e) {
			// Detailed Exception prints
			e.printStackTrace();
		}
		finally {
			System.out.println("finally block will executs in every situation");
		}
		System.out.println("Rest of the code");
	}
}
