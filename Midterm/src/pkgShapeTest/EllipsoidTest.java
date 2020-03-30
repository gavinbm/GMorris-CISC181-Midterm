package pkgShapeTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pkgShape.Ellipsoid;

class EllipsoidTest {

	@Test
	public void EllipsoidTest() {
		Ellipsoid e = new Ellipsoid(10, 20, 25);
		Ellipsoid d = new Ellipsoid(1.5, 2.4, 3.1);
		Ellipsoid f = new Ellipsoid(1.1, 2.2, 3.3);
		
		assertEquals(20943.95, e.area(), 0.01);
		assertEquals(46.75, d.area(), 0.01);
		assertEquals(33.45, f.area(), 0.01);
	}

}
