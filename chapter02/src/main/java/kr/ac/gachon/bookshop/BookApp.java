package kr.ac.gachon.bookshop;

public class BookApp {
	private static int bookCount = 0;
	
	public void test() {
		
	}
	
	public static void main(String[] args) {
		Book b = new Book();
		Book a = b;
		
		System.out.println(a);
	}
}
