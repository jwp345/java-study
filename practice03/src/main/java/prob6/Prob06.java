package prob6;

import java.util.Scanner;

public class Prob06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while( true ) {
			System.out.print(">>");
			String input = scanner.nextLine();
			/*  코드를 완성 합니다 */
			if(input.equals("quit"))
				break;
			String[] token = input.split(" ");
			
			int a = Integer.valueOf(token[0]);
			String mark = token[1];
			int b = Integer.valueOf(token[2]);
			
			if(mark.equals("+"))
			{
				Add add = new Add();
				add.setValue(a, b);
				System.out.println(">>" + add.calculate());
			}
			else if(mark.equals("-"))
			{
				Sub sub = new Sub();
				sub.setValue(a, b);
				System.out.println(">>" + sub.calculate());
			}
			else if(mark.equals("*")) {
				Mul mul = new Mul();
				mul.setValue(a, b);
				System.out.println(">>" + mul.calculate());
			}
			else if(mark.equals("/")) {
				Div div = new Div();
				div.setValue(a, b);
				System.out.println(">>" + div.calculate());
			}
			else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
			}
			
		}
		
		scanner.close();
	}

}
