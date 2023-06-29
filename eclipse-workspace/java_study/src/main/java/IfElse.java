
public class IfElse {
	
	public static void main(String[] args) {
		char grade = ' ';
		int score = 92;
		
		switch (score/10) {
	    case 10: 
	    case 9 :	
	    	grade="A"
		    break; 
        case 8 :
        	grade="B"
		    break;
        //8~6
		default: 
			grade="F";
			break;
}