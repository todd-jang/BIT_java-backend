package chapter04;

public class ObjectTest01 {
	
	public static void main(String[] args) {
		Point p=new Point(18,20);
		
		//Class klass = p.getClass();casting필요
		System.out.println(p.getClass());//reflection!
		System.out.println(p.hashCode());//address기반 hashing?객체 유일한 구분할 정수 id
		System.out.println(p.toString());//getClass() + "@" + hashCode()
		System.out.println(p);
	}

}
