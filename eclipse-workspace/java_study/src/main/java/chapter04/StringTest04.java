package chapter04;

public class StringTest04 {
	
	public static void main(String[] args) {
		String s1 =  "Hello" + " World" + "Java" + 17;
		
		StringBuffer sb = new StringBuffer("Hello ")
		        .append("World")
		        .append("JAVA")
		        .append(17)
		        .toString();
		
		System.out.println(s1);
		
//		String s2="";
//  	for int i=0; i<10000; i++ {
//			s2 = s2+ i;
//			//s2 = new StringBuffer(s2).append(i).toString();
		}
		StringBuffer sb=new StringBuffer("");
		for int i=0; i<10000; i++ {
			sb.append(i);	
	    }
		System.out.println(s2.length());
}
