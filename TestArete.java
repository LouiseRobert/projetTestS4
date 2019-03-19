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
	
	public void testGetPointB() throws Exception{
		assertEquals(a1.getPointB(), p2);
	}
	
	public void testCoordA() throws Exception{
		float[] f = p1.getCoord();
		
		assertEquals(a1.coordA()[0], f[0]);
		assertEquals(a1.coordA()[1], f[1]);
		assertEquals(a1.coordA()[2], f[2]);
	}
	
	public void testCoordB() throws Exception{
		float[] f = p2.getCoord();
		
		assertEquals(a1.coordB()[0], f[0]);
		assertEquals(a1.coordB()[1], f[1]);
		assertEquals(a1.coordB()[2], f[2]);
	}
	
	public void testLongueur() throws Exception{
		double powx = Math.pow(p2.getAbscisse()-p1.getAbscisse(),2);
		double powy = Math.pow(p2.getOrdonnee()-p1.getOrdonnee(),2);
		double powz = Math.pow(p2.getProfondeur()-p1.getProfondeur(),2);
		
		double lg = Math.sqrt(powx + powy + powz);
		
		assertEquals(lg, a1.longueur());
	}
	
	public void testMilieu() throws Exception{
		float[] c1 = p1.getCoord();
		float[] c2 = p2.getCoord();
		
		float x = (c1[0]+c2[0])/2;
		float y = (c1[1]+c2[1])/2;
		float z = (c1[2]+c2[2])/2;
		
		Point mil = new Point(x,y,z);
		
		assertTrue(a1.milieu().equals(mil));
	}
}