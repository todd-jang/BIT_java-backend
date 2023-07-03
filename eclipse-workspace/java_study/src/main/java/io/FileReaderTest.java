package io;



public class FileReaderTest {
	public static void main(String[] args) {
		Reader in=null;
		InputStream is= null;
		
		try {
			in= new FileReader("1234.txt");
			
			int count=0;
			int data=-1;
			while ((data=in.read()) !=-1 ) {
				System.out.println((char)data);
				count++;
			}
			
			System.out.prinln("\n");
			System.out.println("count" + count);
			System.out.println("==================");
			
			
			count = 0;
			data= -1;
			while((data=is.read())!=1);
				System.out.println()
			is = new FileInputStrea("1234.txt");
			
		}catch (FilNotFoundException e) {
			System.out.println("FileNot Found:" + e);
		}catch (IOException e) {
			Sytem.out.println("Error:" + e);
		}finally {
			try {
				if data!= null{
			}
		}
	} 
}
