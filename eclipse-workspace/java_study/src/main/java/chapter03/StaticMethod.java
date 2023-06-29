package chapter03;

public class StaticMethod {
	int n;
	static int m;
	
	void f1() {
		System.out.println(n);
	}
	
	void f2() {
		System.out.println(StaticMethod.m);
		//같은 클래스의 클래스(static) 변수 이름에서는 클래스 생략가능
		System.out.println(m);
	}
	void f3() {
		f2();
	}
	static void s1() {
		//오류인스턴수 변수에 접근 불가
		//System.out.println(n);
	}
	static void s2() 
		System.out.println(StaticMethod.m);
		//같은 클래스의 클래스(static) 변수 이름에서는 클래스 생략가능
		System.out.println(m);
    }	
	static void s3() {
		//오류:static매소소드에서 인스턴스 매소드접근 불가
		//f3();
	}
	static void s4() 
		System.out.println(StaticMethod.m);
		//같은 클래스의 클래스(static) 변수 이름에서는 클래스 생략가능
		System.out.println(m);
	}
	//결론 스태틱은 스태틱만 인스턴스는 인스턴스 스태틱 둘다 접근
}
