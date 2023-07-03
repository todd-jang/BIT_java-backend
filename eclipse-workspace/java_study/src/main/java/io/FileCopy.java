package io;

import java.io.FileInputStream;

public class FileCopy {
	public static void main(String[] args) {
		
		InputStream is= null;
		OutStream os=null;
		
		try {
			is = new FileInputStream("");
			os= new FileOutputStrea("");
		
			int data = -1;
			while((data= is.read()) != -1) {
				os.write(data);
			}
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if is!=null {
					os.close();
				}
			}catch (FileNotFoundException e) {
				System.out.println("File Not Fount:" +e);
			}catch (IOException e) {
		}
	}
	
}
