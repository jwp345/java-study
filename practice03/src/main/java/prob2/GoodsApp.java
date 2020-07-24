package prob2;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
	
		Goods[] goods = new Goods[COUNT_GOODS];

		for(int i = 0; i < COUNT_GOODS; i++) {
			goods[i] = new Goods();
			String line = scanner.nextLine();
			String[] token = line.split(" ");
			
			goods[i].name = token[0];
			goods[i].price = Integer.valueOf(token[1]);
			goods[i].stock = Integer.valueOf(token[2]);
		}
		
		for(int i = 0; i < COUNT_GOODS; i++) 
			System.out.println(goods[i].name + "(가격:" + goods[i].price + ")이 " + goods[i].stock + "개 입고 되었습니다.");
		
		scanner.close();
	}
}
