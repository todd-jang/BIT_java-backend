package chapter01;

public class Ex22BreakContinue {
	public static void main(String[] args) {
		int i=1;
		int sum =0;
		
		while( true ) {
		     sum += sum;

		     if( sum > 5000 ) {
		          break;
		          sum++;
		     }
		System.out.println("i:" + sum);     
		}

	}
}
