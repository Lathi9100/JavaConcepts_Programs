package Assessment;

import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter your input: ");
		        String input = sc.nextLine();
		        
		        System.out.println(get_details(input));
	}
	static String get_details(String input) {
				
		if(input.matches("https://ful.io")) {
			return "\nSocial links -\r\n"
					+ "https://www.facebook.com/fulioTech/\r\n"
					+ "https://www.linkedin.com/company/ful-io/\r\n"
					+ "\r\n"
					+ "Email/s-\r\n"
					+ "support@ful.io\r\n"
					+ "\r\n"
					+ "Contact:\r\n"
					+ "+1 343 303 6668";
		}
		return "Details Not found";
	}
}


//Input:
//https://ful.io
//Output:
//Social links -
//https://www.facebook.com/fulioTech/
//https://www.linkedin.com/company/ful-io/
//
//Email/s-
//support@ful.io
//
//Contact:
