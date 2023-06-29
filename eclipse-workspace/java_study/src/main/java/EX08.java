
public class EX08 ArithmaticOperator{
	
	public static void main(String[] args) {
		final int TIME = 20000;//초
		int hour = TIME/60/60;
		int minutes = TIME / 60 % 60;
		int second = TIME %60;
		System.out.println(TIME +"초는"+ hour+ "시간" +minutes+"초입니다")
	}

}
