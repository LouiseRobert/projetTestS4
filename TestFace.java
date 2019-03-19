package de3d;

import java.util.ArrayList;

import junit.framework.TestCase;

public class TestFace extends TestCase {
	
	//on crée une face sur laquelle faire les tests
	
	private static Point p1 = new Point(0, 0, 0);
	private static Point p2 = new Point(1, 0, 0);
	private static Point p3 = new Point(1, 1, 0);
	private static Point p4 = new Point(0, 1, 0);
	private static Arete a1 = new Arete(p1, p2);
	private static Arete a2 = new Arete(p2, p3);
	private static Arete a3 = new Arete(p3, p4);
	private static Arete a4 = new Arete(p4, p1);
	private static ArrayList<Arete> La = new ArrayList<Arete>(){
		private static final long serialVersionUID = 1L;

	{
	add(a1);
	add(a2);
	add(a3);
	add(a4);
	}};
	private static Face f1 = new Face(La);

	//2eme face 
	
	private static Point p5 = new Point(1, 0, 0);
	private static Point p6 = new Point(1, 1, 0);
	private static Point p7 = new Point(1, 1, 1);
	private static Point p8 = new Point(1, 0, 1);
	
	private static Arete a5 = new Arete(p5, p6);
	private static Arete a6 = new Arete(p6, p7);
	private static Arete a7 = new Arete(p7, p8);
	private static Arete a8 = new Arete(p8, p1);
	private static ArrayList<Arete> La2 = new ArrayList<Arete>(){
		private static final long serialVersionUID = 1L;

	{
	add(a5);
	add(a6);
	add(a7);
	add(a8);
	}};
	private static Face f2 = new Face(La2);
	
	
	public void testgetAretes(){
		assertEquals(f1.getAretes(),La);		
	}
	
	public void testContient(){
		assertTrue(f1.contient(p1));		
	}
	
	public void testgetPoint(){
		assertTrue(f1.getPoint().contains(p1));
		assertTrue(f1.getPoint().contains(p2));
		assertTrue(f1.getPoint().contains(p3));
		assertTrue(f1.getPoint().contains(p4));
	}
	
	public void testestAdjacente(){
		assertTrue(f1.estAdjacente(f2));		
	}
	
	public void testBarycentre(){
		Point point = new Point((int)0.5,(int)0.5, 0);
		assertEquals(f1.barycentre(), point);	
		System.out.println(f1.barycentre());
	}
	
	
	
	

}
