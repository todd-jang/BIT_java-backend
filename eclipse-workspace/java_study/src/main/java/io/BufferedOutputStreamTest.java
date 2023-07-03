package io;

public class BufferedOutputStreamTest {
	public static void main(String[] args) {
		BufferedOutputStra bos =null;
		try {
			//기반 스트림
			FileOutputStream fos = new FileOutputStream("test.txt");
			
			//보조스트림
			bos= new BufferedOutputStream(bos);
			
			//for (char c= "a"; c<= "z"	;c++)
			for (int i=97;i<=122; i++) {
				bos.write(i);
			}
			}catch (FileNotFoundException e) {
			System.out.println("Can Not Open:" +e);
			
		}finally {
			   try {
				   if fos !=null {
					   
				   }
			   }
		}
	}
}
