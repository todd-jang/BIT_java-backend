package chapter01;

public class Ex20DoWhile {
	
	public static void main(String[] args) {
		
		final int LOOP_COUNT=10;
		int i = 0;
		do { 
			System.out.print(i + ". hello");  
			i=i+1;   
		} while(i< LOOP_COUNT);

	}

}
public class Ex21DoWhileContinue {
	
	for ( int i = 0; i < 20; i++ ) {
	
		if( i % 2 == 0 || i % 3 == 0 ) {
	           continue;//증감연산으로 ...(while ,,,continue!?)
	      }
	
	      System.out.println( i );
	}
}	


