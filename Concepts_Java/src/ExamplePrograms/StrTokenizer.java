package ExamplePrograms;

import java.util.StringTokenizer;

public class StrTokenizer {

	StringTokenizer str1 = new StringTokenizer("Hello there you are");
	StringTokenizer str2 = new StringTokenizer("Hello ,there ,you ,are ");
	StringTokenizer str3 = new StringTokenizer("Hello ,there ;you :are");
	
	public void stringTokenizer1() {
		
		while(str1.hasMoreTokens()) {
			System.out.println(str1.nextToken());
		}
	}
	public void stringTokenizer2() {
		while(str2.hasMoreTokens()) {
			System.out.println(str2.nextToken());
		}
	}
	public void stringTokenizer3() {
		while(str3.hasMoreTokens()) {
			System.out.println(str3.nextToken());
		}
	}
	public static void main(String[] args) {
		StrTokenizer obj = new StrTokenizer();
		obj.stringTokenizer1();
		System.out.println();
		obj.stringTokenizer2();
		System.out.println();
		obj.stringTokenizer3();
	}
}
