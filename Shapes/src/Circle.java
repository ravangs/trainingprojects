

public class Circle {
	
	private int radius;
	
	Circle(int radius){
		this.radius = radius;
	}
	
	public String getShapeName() {
		return "Circle";
	}
	
	public double computeArea() {
		return Math.PI*this.radius*this.radius;
	}
	
}
