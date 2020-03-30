package pkgShape;

public class Ellipsoid extends Ellipse implements Comparable<Shape> {
	
	private double HeightRadius;
	
	public Ellipsoid(double Radius, double MinorRadius, double HeightRadius) {
		super(Radius, MinorRadius);
		this.Radius = Radius;
		this.MinorRadius = MinorRadius;
		this.HeightRadius = HeightRadius;
		
		if (Radius < 0 || MinorRadius < 0 || HeightRadius < 0) {throw new IllegalArgumentException();}
	}

	//The tests for this pass if I name it area instead of volume, any feedback on why would be greatly appreciated
	public double volume() {
		return   4.0 / 3.0 * Math.PI * this.Radius * this.MinorRadius * this.HeightRadius;
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
