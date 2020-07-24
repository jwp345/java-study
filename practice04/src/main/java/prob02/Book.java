package prob02;

public class Book {
	private int bookNo;
	private String title;
	private String author;
	private int stateCode; // 1:재고있음, 0:대여중
	
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Book(int no, String tit, String aut) {
		this.bookNo = no;
		this.title = tit;
		this.author = aut;
		this.stateCode = 1;
	}
	public void rent() {
		stateCode = 0;
		System.out.println(this.title + "이(가) 대여 됐습니다.");
	}
	
	public void print() {
		if(stateCode == 1)
			System.out.println("책 제목: " + this.title + ", 작가: "+ this.author + ", 대여 유무: "+"재고있음");
		else
			System.out.println("책 제목: " + this.title + ", 작가: "+ this.author + ", 대여 유무: "+"대여중");
		
	}
}
