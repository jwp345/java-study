package com.bit2020.chapter03.paint;

public class Circle extends Shape {
	private int x1;
	private int y1;
	private int radius;
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("원을 그렸습니다.");
	}
	@Override
	public int calcPerimeter() {
		return 2*radius*(int)Math.PI;
	}
}
