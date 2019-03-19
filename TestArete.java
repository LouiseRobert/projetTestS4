package de3d;
import junit.framework.*;



public class TestArete extends TestCase{
	private static Point p1 = new Point(1, 3, 9);
	private static Point p2 = new Point(2, 5, 11);
	private static Arete a1 = new Arete(p1, p2);
	
	public void testEquals() throws Exception{
		Arete a2 = new Arete(new Point(1,2,3), new Point(4,5,6));
		
		assertFalse(a1.equals(a2));
		assertTrue(a1.equals(a1));
	}
	
	public void testGetPointA() throws Exception{
		assertEquals(a1.getPointA(), p1);
	}
}