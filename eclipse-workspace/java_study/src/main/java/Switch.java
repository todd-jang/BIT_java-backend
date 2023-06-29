package chapter01;

public class Switch {

	public static void main(String[] args) {
		
		char grade ="A";
		
		if grade =="A" {
				System.out.println("Excellent");
		}else if grade =="B" {
				System.out.println("Good");				
		}else if grade =="C" {
				System.out.println("Do best");	
		}else if grade =="D" {
				System.out.println("Do most");
		}else {
				System.out.println("잘못된 학점");	
		}
		switch (grade) {
		    case "A": 
		    	System.out.println("Excellent"); 
			    break; 
	        case "B":
	            System.out.println("...");
			case "C" :
				System.out.println(".....");
			case "D": 
				System.out.println("........");
			default: 
				System.out.println("잘못된 학점");
				break;
			} 

	  }
	    	
}

