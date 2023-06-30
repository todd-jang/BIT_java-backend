package collection;

import java.util.list;
import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		Stack <String> stack= new Stack<>();
		
		stack.push("Hello");
		stack.push("World");
		stack.push("!");
		
		while(!stack.isEmpty()) {
			String s=stack.pop();
			System.out.println(s);
			
			
		}
		System.out.println("======");
		
		stack.push("Hello");
		System.out.println(stack.pop());//빈 경우 호출시 예외 발생^^
		
		stack.push("둘리");
		stack.push("마이콜");
		
		System.out.println(stack.pop());
		System.out.println(stack.peak());
		
	}
}
