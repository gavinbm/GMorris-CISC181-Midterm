package pkgShapeTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pkgShape.Circle;

class CircleTest {

	@Test
	public void CircleTest() throws Exception {
		Circle c1 = new Circle(10);
		Circle c2 = new Circle(5);
		Circle c3 = new Circle(2.5);

		assertEquals(314.15, c1.area(), 0.01);
		assertEquals(78.54, c2.area(), 0.01);
		assertEquals(19.63, c3.area(), 0.01);
	}

}
