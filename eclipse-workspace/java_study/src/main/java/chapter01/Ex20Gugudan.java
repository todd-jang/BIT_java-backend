package chapter01;

public class Ex20Gugudan {

	
	public static void main(String[] args) {
		for(int i=0; i<=9;i++) {
			for(int j=0;j<9;j++) {
				System.out.println(i+":" + j);
			}
		}
	}
}
//1*1 2*1 3*1...
//1*2 2*2 3*2...출력하는 for문
public class Ex20Gugudan01 {
	
	public static void main(String[] args) {
		for(int i=1; i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.println(i+"x" + j + " = " + i*j);
	}
	System.out.println("============");	
	
}
