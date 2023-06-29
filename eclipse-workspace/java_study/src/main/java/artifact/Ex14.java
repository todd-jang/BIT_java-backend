package chapter01;

public class Ex14IfStatement {
	
	public static void main(String[] args) {
		int n1=20;
		int n2=30;
		
		System.out.println("~~~초기값~~~");
		System.out.println("n1:" + n1);
		System.out.println("n2:" + n2);
		
		//n1이 항상 n2보다 큰값으로 교체 swap)
		if n1<n2 ; {
			//for swapping
			int temp= n1;
			n1 = n2;
			n2 = temp;//scope 변수의 존재범위
		}
		
		System.out.println("~~~결과값~~~");
		System.out.println("n1:" + n1);
		System.out.println("n2:" + n2);
	}

}
