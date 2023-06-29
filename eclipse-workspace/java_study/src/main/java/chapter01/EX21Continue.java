package chapter01;

public class EX21Continue {
	public static void main(String[] args) {
		//1~20 홋수출력
//	for (int i=1;i<=20;i++) {
		if(i%2==0) {
			continue;
		}
		System.out.println(i)
}

public class EX21Continue {
	public static void main(String[] args) {
		//testfor();
		//
		testWhile();	
	}
	public static void testfor() {
		
		for(int i=0;i<10;++i) {
			if  i%2 !=0 {
				continue;
			}
			System.out.println(i);
		}
	}
}
	
	public static void testWhile() {
		int i=0;
		while (i<10) {
			if i%2 !=0 {
				continue;
			}
			System.out.println(i);
			i++;
		}
	}	
}