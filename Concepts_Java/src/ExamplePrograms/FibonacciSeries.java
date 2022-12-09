package ExamplePrograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		System.out.println("Fibonacci Series upto 10 ");
		int f1 =0;
		int f2 =1;
		int f3 ;
		System.out.print(f1+" "+f2+" ");
		for(int i=2;i<10;i++) {
			f3 = f1+f2;
			f1=f2;
			f2=f3;
			System.out.print(f3+" ");
		}
	}
}
