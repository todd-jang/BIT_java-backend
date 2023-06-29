package chapter01;

public class EX09ArithmeticOperator {
	
	public static void main (String[] args) {
		System.out.println(10. / 3.); //double
		System.out.println(10. / 3); //double
		System.out.println(10 / 3.); //double
		System.out.println(10 / 3); // int
		
		System.out.println((double)10 / 3.); //double
		System.out.println((double)10 / (double)3); //double?
		System.out.println(10 / (double) 3);// 
	}

}
