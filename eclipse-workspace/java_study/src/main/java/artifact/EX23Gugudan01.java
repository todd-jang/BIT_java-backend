package chapter01;

public class EX23Gugudan01 {
	public static void main(String[] args) {
		//System.out.print("hello world"+"\n");
		//System.out.println("hello world");
		
		//System.out.println("======");
		for(int i=1; i<=9;i++) {
			for(int j=1;j<=9;j++) {
				//System.out.println(i+"x" + j + " = " + i*j);
			}
		        System.out.print(j+"x" + i + " = " + i*j);
		        System.out.print("\t");//행에 tap삽입  
		        //System.out.print("\n");
		}
			System.out.print("\n");
	}

}
