package artifact;

public class Ex13IfStatement {
	
	public static void main(String[] args)
	{
		char grade = ' ';
		int score = 92;
		
		if (score >90) {
			grade = 'A';
		}else if(score>=80){
			grade = 'B';
		}else if(score>=70){
			grade = 'C';
		}else if(score>=60){
			grade = 'D';
		}else {
			grade = 'F';
		}
		
		
		System.out.println("학점" + grade + "입니다");
	}
}
