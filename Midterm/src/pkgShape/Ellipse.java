package pkgShape;

public class Ellipse extends Circle implements Comparable<Shape>{
	
	public double MinorRadius;
	
	public Ellipse(double Radius, double MinorRadius) {
		super(Radius);
		this.Radius = Radius;
		this.MinorRadius = MinorRadius;
		
		if (Radius < 0 || MinorRadius < 0) {throw new IllegalArgumentException();}
	}
	
	public double getMinorRadius() {
		return this.MinorRadius;
	}
	
	public void setMinorRadius(double minorRadius) {
		this.MinorRadius = minorRadius;
	}
	
	public double area() {
		return this.Radius * this.MinorRadius * Math.PI;
	}
	
	public boolean isCircle() {
		if (this.MinorRadius == this.getRadius()) {return true;}
		else {return false;}
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
