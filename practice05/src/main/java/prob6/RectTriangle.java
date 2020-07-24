package prob6;

public class RectTriangle extends Shape {
	private double width;
	private double height;
	
	public RectTriangle(double w, double h) {
		this.width = w;
		this.height = h;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.width * this.height * 0.5;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return this.width + this.height + Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}

}
