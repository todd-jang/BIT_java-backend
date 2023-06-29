package chapter03;

public class SwapTest03 {
	public static void main (String[] args) {
		IntValue a= new IntValue(10);
		IntValue b= new IntValue(20);
		
        System.out.println("a" + a + ", b:" + b);
		
		swap(a, b);
		
		System.out.println("a" + a + ", b:" + b);
		
	}
	public static void swap(IntValue m, IntValue n) {
		int temp= m.value;
		m.value=n.value;
		n.value=temp;
	}//call by reference임
}