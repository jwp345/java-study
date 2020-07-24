package com.bit2020.chapter04;

public class ObjectTest04 {
	
	public static void main(String[] args) {
		String s1 = new String("ABC");
		String s2 = new String("ABC");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(System.identityHashCode(s1) + ":" + System.identityHashCode(s2)); // 주소 기반 해쉬코드값
		
		System.out.println("================================");
		
		String s3 = "ABC";
		String s4 = "ABC";
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		System.out.println(s3.hashCode() + ":" + s4.hashCode());
		System.out.println(System.identityHashCode(s3) + ":" + System.identityHashCode(s4)); // 주소 기반 해쉬코드값
		
	}
}
