package chapter03;

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
//		System.out.println(a);//4
//		a++;
		//a+=1;
		//a=a+1;
		System.out.println(a);//5
		
		System.out.println(a++);//5
//		System.out.println(a);
//		a=a+1;
		
		System.out.println(++a);//6?
		
	   }
}