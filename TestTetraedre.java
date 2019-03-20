package de3d;

import java.util.ArrayList;

import junit.framework.TestCase;

public class TestTetraedre extends TestCase {
	public void testTetraedre() {
	Point a = new Point(-30, 0,0);
	Point b = new Point(30, 0,0);
	Point c = new Point(0, 0,(float)(Math.sqrt(Math.pow(60,2)-Math.pow(30,2))));
	
	
	// La hauteur vaut la racine carre( (cote)^2 - (2/3 de mediane)^2 )
	float hauteur = (float)(Math.sqrt(Math.pow(60,2)-Math.pow((c.getProfondeur()*2)/3,2)));
	Point d = new Point(0, hauteur,c.getProfondeur()/3);


	// On definit les differentes faces du tetraedre
	ArrayList<Point> po = new ArrayList<Point>();
	ArrayList<Arete> ar = new ArrayList<Arete>();
	ArrayList<Face> lf = new ArrayList<Face>();
	
	Point[][] pts = new Point[][] {
		{a, b, c},
		{a, d, b},
		{a, c, d},
		{d, c, b}
	};
	
	for (int i = 0; i < 4; i++) {
		Face f = new Face(ar);
		for (int j = 0; j < 3; j++) {
			po.add(pts[i][j]);
		}
		f.face(po);
		po.clear();
		lf.add(f);
		Solide t = new Solide(lf);
	/*
	private static Point p1 = new Point(-30, 0, 0);
	private static Point p2 = new Point(30, 0, 0);
	private static Point p3 = new Point(0, 0, (float)(Math.sqrt(Math.pow(60,2)-Math.pow(30,2))));
	private static Point p4 = new Point(0, (float)(Math.sqrt(Math.pow(60,2)-Math.pow((p3.getProfondeur()*2)/3,2))), p3.getProfondeur()/3);

	public void testTetraedre() {
	ArrayList<Point> arrayPoints = new ArrayList<Point>();
	ArrayList<Arete> arrayAretes = new ArrayList<Arete>();
	ArrayList<Face> arrayFaces = new ArrayList<Face>();
	
	Point[][] pts = new Point[][] {
		{p1, p2, p3},
		{p1, p4, p2},
		{p1, p3, p4},
		{p4, p3, p2}
	};
	
	for (int i = 0; i < 4; i++) {
		Face f = new Face(arrayAretes);
		for (int j = 0; j < 3; j++) {
			arrayPoints.add(pts[i][j]);
		}
		f.face(arrayPoints);
		arrayPoints.clear();
		arrayFaces.add(f);
	}	
	
	Solide sol = new Solide(arrayFaces); */
	
	
		assertTrue(Tetraedre.tetraedre().equals(Tetraedre.tetraedre()));
	}
}
}