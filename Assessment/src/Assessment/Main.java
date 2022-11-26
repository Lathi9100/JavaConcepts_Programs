package Assessment;

import java.util.Scanner;

class Main{
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Phone Number: ");
		String phone_number = sc.nextLine();		
		System.out.println(validateNumber(phone_number));
	
   }
	private static boolean validateNumber(String mobNumber)   
	{  
	if (mobNumber.matches("\\d{10}"))  
	return true;  
	else if (mobNumber.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}"))  
	return true;  
	else if (mobNumber.matches("\\d{4}[-\\.\\s]\\d{3}[-\\.\\s]\\d{3}"))  
	return true;  
	else if (mobNumber.matches("\\d{3}-\\d{3}-\\d{4}\\s(x|(ext))\\d{3,5}"))  
	return true;  
	else if (mobNumber.matches("\\(\\d{3}\\)-\\d{3}-\\d{4}"))  
	return true;  
	else if (mobNumber.matches("\\(\\d{5}\\)-\\d{3}-\\d{3}"))  
	return true;  
	else if (mobNumber.matches("\\(\\d{4}\\)-\\d{3}-\\d{3}"))  
	return true;  
	else  
	return false;  
}
}
// 2124567890
// 2124567890
// (212)456-7890
// (212)-456-7890
// 212.456.7890
// 212 456 7890
// +12124567890
// +12124567890
// +1 212.456.7890
// +212-456-7890
// 1-212-456-7890

