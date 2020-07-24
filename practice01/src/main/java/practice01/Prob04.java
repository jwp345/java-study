package practice01;

import java.util.Scanner;

public class Prob04 {

	public static void main(String[] args) {
		/* 코드를 작성합니다. */
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요.: ");
		
		String input = sc.nextLine();
		for(int i=1; i<=input.length(); i++)
			System.out.println(input.substring(0, i));
		sc.close();
	}
}