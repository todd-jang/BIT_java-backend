package chapter03;

public class Student extends Person {
	public Student() {
//		super();상속 호출 자기 this를 대신함(자식의 모든 생성자에서 
		//부모의 특정 생성자 명시적으로 호출하지 않으면 
		//암시적으로 부모의 기본생성자가 자식의 생성자 코드앞에 호출됨)
		Syetem.out.println("Student() called");
	}
}
