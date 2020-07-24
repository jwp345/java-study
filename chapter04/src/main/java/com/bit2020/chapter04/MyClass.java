package com.bit2020.chapter04;

/**
 * 
 * Singletone + Factory Method Test
 * @author Administrator
 *
 */

public class MyClass {
	private static MyClass instance = null;
	
	private MyClass() {
	}
	
	public static MyClass getInstance() {
		if(instance == null) {
			instance = new MyClass();
		}
		
		return instance;
	}
}
