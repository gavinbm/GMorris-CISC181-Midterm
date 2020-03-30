package pkgShapeTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pkgShape.Ellipse;

class EllipseTest {

	@Test
	public void EllipseTest() {
		Ellipse e = new Ellipse(1, 1);
		Ellipse d = new Ellipse(10, 20);
		Ellipse f = new Ellipse(1.5, 2.75);
		
		assertEquals(3.14, e.area(), 0.01);
		assertEquals(628.32, d.area(), 0.01);
		assertEquals(12.96, f.area(), 0.01);
	}

}
