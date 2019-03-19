package de3d;
import junit.framework.*;



public class TestPoint extends TestCase{
	private static Point p1 = new Point(1, 3, 9);
	
	public void testGetCoord() throws Exception {
		
		float tab[] = p1.getCoord();
		
		assertEquals(tab.length, 3);
		assertEquals((int)tab[0], 1);
		assertEquals((int)tab[1], 3);
		assertEquals((int)tab[2], 9);	
	}
	
	public void testEquals() throws Exception {
		
		Point p2 = new Point(1, 3, 8);
		
		assertTrue(p1.equals(p1));
		assertFalse(p1.equals(p2));
	}
	
	public void testGetAbscisse() throws Exception{
		assertEquals((int) p1.getAbscisse(), 1);		
	}
	
	public void testGetOrdonnee() throws Exception{
		assertEquals((int) p1.getOrdonnee(), 3);		
	}
	
	public void testGetProfondeur() throws Exception{
		assertEquals((int) p1.getProfondeur(), 9);		
	}
	
	public void testSetAbscisse() throws Exception{
		Point p2 = new Point(1, 3, 8);
		p2.setAbscisse(6);
		assertEquals((int) p2.getAbscisse(), 1+6);
	}
	
	public void testSetOrdonnee() throws Exception{
		Point p2 = new Point(1, 3, 8);
		p2.setOrdonnee(6);
		assertEquals((int) p2.getOrdonnee(), 3+6);
	}
	
	public void testSetProfondeur() throws Exception{
		Point p2 = new Point(1, 3, 8);
		
		p2.setProfondeur(6);
		
		assertEquals((int) p2.getProfondeur(), 8+6);
	}
}
