package prob5;

public class Account {
	String accountNo;
	int balance;
	
	Account(String no)
	{
		this.accountNo = no;
		System.out.println(this.accountNo + "계좌가 개설되었습니다. ");
	}
	void save(int amount)
	{
		this.balance += amount;
		System.out.println(this.accountNo + "계좌에 " + this.balance + "만원이 입금되었습니다.");
	}
	
	void deposit(int amount)
	{
		this.balance -= amount;
		System.out.println(this.accountNo + "계좌에 " + amount + "만원이 출금되었습니다.");
	}
	
	public String getAccountNo() {
		return accountNo;
	}
	
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	
}