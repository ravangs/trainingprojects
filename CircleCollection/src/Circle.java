

public class Circle {
	
	private double radius;
	
	Circle(double radius){
		this.radius = radius;
	}
	
	public String getShapeName() {
		return "Circle";
	}
	
	public double computeArea() {
		return Math.PI*this.radius*this.radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
}
