package de3d;

import junit.framework.TestCase;

public class TestCube extends TestCase {
	
public void testCube() {	
		
		// creation d'un solide tetraedrique
		
		Solide c = Cube.cube(new Point((float)0.5, (float)0.5, (float)0.5), 1);
		
		Point p1 = new Point((float)0.0, (float)0.0, (float)0.0);
		Point p2 = new Point((float)1.0, (float)0.0, (float)0.0);
		Point p3 = new Point((float)1.0, (float)1.0, (float)0.0);
		Point p4 = new Point((float)0.0, (float)1.0, (float)0.0);
		Point p5 = new Point((float)0.0, (float)0.0, (float)1.0);
		Point p6 = new Point((float)1.0, (float)0.0, (float)1.0);
		Point p7 = new Point((float)1.0, (float)1.0, (float)1.0);
		Point p8 = new Point((float)0.0, (float)1.0, (float)1.0);	
		
		for(Point i : c.getPoint()){
			System.out.println("" + i.getAbscisse() +" "+ i.getOrdonnee() +" "+ i.getProfondeur());
		}
		
		//assertTrue(c.getPoint().get(0).getAbscisse() == 0.0);
		assertTrue(c.getPoint().get(0).getAbscisse() == p1.getAbscisse());
		
		
		
		
	}
}
