package prob5;

public class MyStack {
	private int top;
	private String[] buffer;
	
	public MyStack(int n) {
		this.top = 0;
		this.buffer = new String[n];
	}
	
	public void push(String s) {
		if(top == this.buffer.length)
		{
			String[] temp = new String[this.top+1];
			for(int i = 0; i< this.buffer.length; i++)
				temp[i] = this.buffer[i];
			temp[this.top++] = s;
			this.buffer = temp;
		}
		else
			this.buffer[this.top++] = s;
	}
	
	public String pop() throws MyStackException{
		if(this.top == 0)
			throw new MyStackException();
		return this.buffer[--this.top];
	}
	
	public boolean isEmpty() {
		if(this.top > 0)
			return false;
		return true;
	}
	
}