package practice02;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		/* 코드를 작성합니다. */
		Scanner sc = new Scanner(System.in);
		System.out.print("금액: ");
		int amount = sc.nextInt();
		
		System.out.println("50000원 : " + amount / 50000 + "개");
		amount %= 50000;
		
		System.out.println("10000원 : " + amount / 10000 + "개");
		amount %= 10000;
		
		System.out.println("5000원 : " + amount / 5000 + "개");
		amount %= 5000;
		
		System.out.println("1000원 : " + amount / 1000 + "개");
		amount %= 1000;
			
		System.out.println("500원 : " + amount / 500 + "개");
		amount %= 500;
		
		System.out.println("100원 : " + amount / 100 + "개");
		amount %= 100;
		
		System.out.println("50원 : " + amount / 50 + "개");
		amount %= 50;
	
		System.out.println("10원 : " + amount / 10 + "개");
		amount %= 10;
			
		System.out.println("5원 : " + amount / 5 + "개");
		amount %= 5;
		
		System.out.println("1원 : " + amount / 1 + "개");
		amount %= 1;
		sc.close();
	}
}
