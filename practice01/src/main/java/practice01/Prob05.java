package practice01;


public class Prob05 {

	public static void main(String[] args) {
		
		/* 코드를 작성합니다 */
		for(int i=1; i<100; i++)
		{
			String tmp = String.valueOf(i);
			boolean flag = false;
			for(int j=0; j<tmp.length(); j++)
			{
				if(tmp.charAt(j) == '3' || tmp.charAt(j) == '6' || tmp.charAt(j) == '9')
					if(flag == false) { 
						System.out.print(i);
						flag = true;
					}

				if(tmp.charAt(j) == '3')
					System.out.print("짝");
				if(tmp.charAt(j) == '6')
					System.out.print("짝");
				if(tmp.charAt(j) == '9')
					System.out.print("짝");
				
			}
			if(flag == true)
				System.out.println();
			
		}
	}
}
