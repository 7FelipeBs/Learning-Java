package entities;

public class calculate {
	
	Double width, height;
	
	public Double getWidth() {
		return width;
	}
	
	public void setWidth(Double width) {
		this.width = width;
	}
	
	public Double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	public calculate() {
		
	}
	
	public calculate (double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return (width * 2) + (height * 2);
	}
	
	public double diagonal() {
		double d = (width * width) + (height * height);
		return Math.sqrt(d);
	}
}
