package ExamplePrograms;

public class ArmstrongOrNot {

	public void armstrongOrNot(int num) {
		
		int n = num;
		int digits =0;
		while(n != 0) {
			int temp = n % 10;
			digits +=1;
			n = n/10;
		}
		n = num;
		int sum =0;
		while(n != 0) {
			int temp = n % 10;
			sum += Math.pow(temp,digits);
			n = n / 10;
		}
		if(sum == num) {
		System.out.println("Is Armstrong: "+sum);
		}else {
			System.out.println("Not Armstrong: " + sum);
		}
	}
	public static void main(String[] args) {
		
		ArmstrongOrNot obj = new ArmstrongOrNot();
		obj.armstrongOrNot(407);
	}
}
