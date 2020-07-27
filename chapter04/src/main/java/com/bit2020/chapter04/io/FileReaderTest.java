package com.bit2020.chapter04.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class FileReaderTest {
	
	public static void main(String[] args) {
		Reader in = null;
		InputStream is = null;
		try {
			in = new FileReader("1234.txt");
					
			int count = 0;
			
			int data = -1;
//			while((data = is.read()) != -1) {
//				System.out.println();
//			}
			while((data = in.read()) != -1) { 
				System.out.print((char)data);
				count++;
			} // 한글자씩 호출
			
			System.out.println("");
			System.out.println("count:" + count);
			
			count = 0;
		
			is = new FileInputStream("1234.txt");
			System.out.println("==================");
			
			data = -1;
			while((data = is.read()) != -1) { 
				System.out.print((char)data);
				count++;
			} 
			
			System.out.println("");
			System.out.println("count:" + count);
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			System.out.println("에러:" + e);
		} finally {
			try {
			if(in != null) {
					in.close();
				}
				if(is != null) {
					is.close();
				}
			}catch (IOException e) {
					e.printStackTrace();
			}
		}
	}
}
