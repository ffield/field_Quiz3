package MainPackage;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;

public class TriangleTest {
	
	Triangle t;
	
	// Setting up the @Before and @After methods to initialize the test
	@Before
	public void setUp()
	{
		t = new Triangle();
	}
	
	@After
	public void tearDown()
	{
		t = null;
	}
	
	// This method tests the Area calculating method
	@Test
	public void testArea()
	{
		double expectedArea = .4;
		double area = t.getArea();
		assertEquals(expectedArea == area, area == expectedArea);
	}
	// This method tests the perimeter calculating method
	@Test
	public void testPerimeter()
	{
		double expectedPerimeter = 3;
		double perimeter = t.getPerimeter();
		assertEquals(expectedPerimeter == perimeter, perimeter == expectedPerimeter);
	}
}
