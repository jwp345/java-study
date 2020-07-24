package practice01;

import java.util.*;
public class Prob03 {

	public static void main(String[] args) {
		
		/* 코드를 작성합니다. */
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int ans = 0;
		int input = sc.nextInt();
		if(input % 2 == 0)
		{
			for(int i = 2; i <= input; i+=2)
				ans+=i;
		}
		else
		{
			for(int i=1; i<= input; i+=2)
				ans+=i;
		}
		System.out.println("결과값: " + ans);
		sc.close();
	}

}
