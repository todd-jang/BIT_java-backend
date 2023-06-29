package chapter04;

public class StringTest03 {
	public static void main(String [] args) {
		String s1="aBcDeFgH";
		
		System.out.println(s1.length());
		system.out.println(s1.charAt2());
		System.out.println(s1.indexOf("De"));
		System.out.println(s1.indexOf("De",7);
		System.out.println(s1.substring(s));
		System.out.println(s1.substring(3,5));
		
		String s2="    ab    cd   ";
		String s3="efg,hij, klm,nop";
		String s4=s1.concat(s3);
		System.out.println(s4);
		System.out.println(s4.trim());//앞뒤 공백 지움
		System.out.println(s2.replaceAll(" ",  ""));
		
		String[] tokens= s3.split(",");
		for String s:tokens {
			System.out.println(s);
		}
		String[] tokens2= s3.split(" ");
		for String s:tokens2 {
			System.out.println(s);
	}

}
