package Collection;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		
		Stack stack = new Stack();
		
		stack.push("Ram");
		stack.push("Lakshman");
		stack.push("Hanuman");
		System.out.println(stack);//[Ram, Lakshman, Hanuman]
		stack.pop();
		System.out.println(stack);//[Ram, Lakshman]
		System.out.println(stack.peek());//Lakshman
		System.out.println(stack);//[Ram, Lakshman]		
		System.out.println(stack.search("Hanuman"));//-1 because String value does'nt exists in stack
	}
}
