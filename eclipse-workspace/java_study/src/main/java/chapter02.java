package chapter01;

public class Ex03Typecast {

	public static void main(String[] args) {
			int i1 = 10;
			long l1 =1000L;
			
			float f1 = 3.14f;
			double d1 = 3.14;
			
			//explicit 
			int i2 = (int)l1;
			float  f2 = (float)d1;
			
			int i3= (int) f1;
			
			//암시?
			longl2 = i1;
			double d2 = f1;
			double d3= i1;
			
			//데이터 의미가 다르면 캐스팅 안됨
			
public class Typecast2 {
	public static void main(String args[]){
		byte b;
		int i = 414;
		float f = 123.456;
		
		b=(byte)i;
		System.out.println("int 414를 byte로 변환 : " + b);
		i=(int)f;
		System.out.println("float 123.456을 int로 변환: " + i);
		b=(byte)f;
		System.out.println(" float 123.456을 byte로 변환: " + b);
	}
}


public class Arith{
   public static void main(String[] args){
	int a = 7;
	int b = 3;

	//binary op
	System.out.println(a+b);
	System.out.println(a-b);//4
	System.out.println(a*b);
	System.out.println(a/b);
	System.out.println(a%b);
	//unary op
	System.out.println(-a);-3
	System.out.println(++a);
	System.out.println(--b); 	
	System.out.println(a++);
	System.out.println(b--);
	
	++a;
	//a +=1;
	//a= a+1;
//	System.out.println(a);//4
//	a++;
	//a+=1;
	//a=a+1;
	System.out.println(a);//5
	
	System.out.println(a++);//5
//	System.out.println(a);
//	a=a+1;
	
	System.out.println(++a);//6?
	
   }
}
			