package com.bit2020.chapter03.exception;

import java.io.IOException;

public class MyClassTest {
	
	public static void main(String[] args) {
		
		try {
			MyClass myClass = new MyClass();
			myClass.danger();
			
		} catch(IOException|MyException e) {
			e.printStackTrace();
		}
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (MyException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}
