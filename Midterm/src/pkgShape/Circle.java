package pkgShape;

public class Circle extends Shape implements Comparable<Shape> {
	public double Radius;
	
	public Circle(double Radius) {
		super();
		this.Radius = Radius;
		if (this.Radius < 0) {throw new IllegalArgumentException();}
	}
	
	public double area() throws Exception {
		return Math.PI * Math.pow(this.Radius, 2);
	}
	
	protected double getRadius() {
		return Radius;
	}
	
	protected void setRadius(double radius) {
		this.Radius = radius;
	}
	
	public int compareTo(Shape o) {
		int result = 0;
		
		try {
			if (this.area() > o.area()) {
				result = 1;
			}
			else if (this.area() < o.area()) {
				result = -1;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
		return result;
	}
}
