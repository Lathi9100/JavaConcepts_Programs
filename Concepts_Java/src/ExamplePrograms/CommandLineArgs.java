package ExamplePrograms;

public class CommandLineArgs {

	public static void main(String[] args) {
		int num1,num2;
		if(args.length > 0) {
			try {
				num1 = Integer.parseInt(args[0]);
				num2 = Integer.parseInt(args[1]);
				System.out.println("sum of enteres numbers is: ");
				System.out.println(num1 + num2);
			}catch(Exception e) {
				System.out.println(" Arguments must be numbers" + e);
			}
		}
	}
}
