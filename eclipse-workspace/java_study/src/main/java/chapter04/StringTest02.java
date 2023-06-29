package chapter04;

public class StringTest02 {
	
	public static void main(String[] args) {
		String s1="a";
		String s2="d";
		Stirng s3= s2;
		
//		Sysyem.out.pringln(s1.toUpperCase());
		s2=s1.toUpperCase();
		System.out.println(s2);
		
		String s4=s2.concat("??");//->ABC??
		String s5="!".concat(s2).concat("@");//!ABC@
	}
	public static boolean equalsHello(String s) {
		//return S.equalsHello("Hello");보다는
	    return "Hello".equals(s);
		
	}

}
