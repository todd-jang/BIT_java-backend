package io;

public class BufferedReaderTest {
	public static void main(String[] args) {
	    BufferedReader fr= null;
		try {
		//기반스트림
			
	       FileReader fr = new FileReader("./src/main/java/io/BufferdReadeTest.java");
	    		   
	       br =new BufferedReader(fr)		 ;
	       
	       String line = null;
	       while(line=br.readLine()) !=null) {
	    	   System.out.println(line);
	       }
			
}
