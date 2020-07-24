package practice02;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {
	public static void main(String[] args) {
		
		/* 코드를 작성합니다. */
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			Random random = new Random();
			int minNumber = 1;
			int maxNumber = 100;
		
			int correctNumber = random.nextInt(maxNumber) + minNumber;
			System.out.println("수를 결정하였습니다. 맞추어 보세요");
		for(int i = 0; i < 100; i++) {		
			System.out.println(minNumber + "-" + maxNumber);
			System.out.print(i+1 + ">>");
			int input = scanner.nextInt();
			if(input == correctNumber)
			{
				System.out.println("맞았습니다.");
				System.out.print("다시 하시겠습니까?(y/n)>>");
				break;
			}
			else if(input < correctNumber) {
				System.out.println("더 높게");
				minNumber = input;
			}
			else {
				maxNumber = input;
				System.out.println("더 낮게");
			}
		}
		
		
		String answer = scanner.next();
		if( answer.equals("n") ){
		    //종료하도록 작성한다.
			scanner.close();
			System.exit(0);
		}
		}
	}
}
