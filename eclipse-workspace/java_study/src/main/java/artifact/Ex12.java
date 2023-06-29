package chapter01;

public class Ex12BitwiseOperator {
	
	public static void main(String[] args) {

		int a= 0X0f;
		int b= 0xf0;
		
		System.out.println(a &b);//0?
		System.out.println(a|b);//255!
		System.out.println(a^b);//?255
		System.out.println(~a);//-**?
		//bit 이동연산자 shift
		System.out.println(a <<3);//120?
	}
}