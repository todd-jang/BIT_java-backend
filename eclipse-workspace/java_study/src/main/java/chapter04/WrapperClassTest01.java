package chapter04;

public class WrapperClassTest01 {
	
	public static void main(String[] args) {
		Integer i=new Integer(10);
		
		//Auto boxing
		Integer i2=10;
		Long l=10L;
		
		System.out.println(i2.equals(10));
		
		//unBoxing
		
		System.out.println(i2==10);
		//System.out.println(i2.intValue()==10);
		int m = i2 + 10;
		// int m = i2.intValue() + 10;
	}
}
