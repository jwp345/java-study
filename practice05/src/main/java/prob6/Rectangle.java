package prob6;

public class Rectangle extends Shape implements Resizable {
	private double width;
	private double height;
	
	public Rectangle(double w, double h){
		this.width = w;
		this.height = h;
	}
	@Override
	public void resize(double rate) {
		
		this.width *= rate;
		this.height *= rate;
	}

	@Override
	public double getArea() {
	
		return this.width * this.height;
	}

	@Override
	public double getPerimeter() {
		
		return (this.width + this.height) * 2;
	}

}
