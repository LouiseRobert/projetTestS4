package de3d;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import junit.framework.TestCase;

public class TestSolide extends TestCase {
	private static Point p1 = new Point(0, 0, 0);
	private static Point p2 = new Point(1, 0, 0);
	private static Point p3 = new Point(1, 1, 0);
	private static Point p4 = new Point(0, 1, 0);

	
	private static Arete a1 = new Arete(p1, p2);
	private static Arete a2 = new Arete(p1, p3);
	private static Arete a3 = new Arete(p1, p4);
	private static Arete a4 = new Arete(p2, p4);
	private static Arete a5 = new Arete(p3, p2);
	private static Arete a6 = new Arete(p4, p3);
	
	private static ArrayList<Arete> lf1 = new ArrayList<Arete>(){
		private static final long serialVersionUID = 1L;

	{
	add(a2);
	add(a3);
	add(a6);
	}};
	
	private static ArrayList<Arete> lf2 = new ArrayList<Arete>(){
		private static final long serialVersionUID = 1L;

	{
	add(a2);
	add(a1);
	add(a5);
	}};
	
	private static ArrayList<Arete> lf3 = new ArrayList<Arete>(){
		private static final long serialVersionUID = 1L;

	{
	add(a1);
	add(a3);
	add(a4);
	}};
	
	private static ArrayList<Arete> lf4 = new ArrayList<Arete>(){
		private static final long serialVersionUID = 1L;

	{
	add(a4);
	add(a5);
	add(a6);
	}};
	
	private static Face f1 = new Face(lf1);
	private static Face f2 = new Face(lf2);
	private static Face f3 = new Face(lf3);
	private static Face f4 = new Face(lf4);
	
	private static ArrayList<Face> ls1 = new ArrayList<Face>(){
		private static final long serialVersionUID = 1L;

	{
	add(f1);
	add(f2);
	add(f3);
	add(f4);
	}};
	
	private static Solide s1 = new Solide(ls1);
	
	
	public void testGetFaces(){
		assertTrue(s1.getFaces().equals(ls1));
	}
	
	public void testGetPoint() {
		ArrayList<Point> pts = new ArrayList<Point>();
		
		for(Face f : ls1) {
			pts.addAll(f.getPoint()); // pour chaque point de chaque face on l'ajoute a pts
		}
		Set<Point> set = new HashSet<>(pts); //on crée un hashset (plus de doublons)
		pts.clear(); // on vide pts
		pts.addAll(set); //on ajoute le set a pts 
		
		assertTrue(s1.getPoint().equals(pts));
	}
	
	public void testGetDual() {
		ArrayList<Point> bary = new ArrayList<Point>();
		for (Face f : ls1) {
			bary.add(f.barycentre());
		}
		Arete areteDual1 = new Arete(bary.get(0), bary.get(1));
		Arete areteDual2 = new Arete(bary.get(0), bary.get(2));
		Arete areteDual3 = new Arete(bary.get(1), bary.get(2));
		Arete areteDual4 = new Arete(bary.get(0), bary.get(3));
		Arete areteDual5 = new Arete(bary.get(2), bary.get(3));
		Arete areteDual6 = new Arete(bary.get(1), bary.get(3));
		
		ArrayList<Arete> futureFace1 = new ArrayList<Arete>();
		futureFace1.add(areteDual1);
		futureFace1.add(areteDual2);
		futureFace1.add(areteDual3);
		
		ArrayList<Arete> futureFace2 = new ArrayList<Arete>();
		futureFace2.add(areteDual1);
		futureFace2.add(areteDual4);
		futureFace2.add(areteDual6);
		
		ArrayList<Arete> futureFace3 = new ArrayList<Arete>();
		futureFace3.add(areteDual2);
		futureFace3.add(areteDual4);
		futureFace3.add(areteDual5);
		
		ArrayList<Arete> futureFace4 = new ArrayList<Arete>();
		futureFace4.add(areteDual3);
		futureFace4.add(areteDual5);
		futureFace4.add(areteDual6);
		
		Face faceDual1 = new Face(futureFace1);
		Face faceDual2 = new Face(futureFace2);
		Face faceDual3 = new Face(futureFace3);
		Face faceDual4 = new Face(futureFace4);
		
		ArrayList<Face> futurSolide = new ArrayList<Face>();
		futurSolide.add(faceDual1);
		futurSolide.add(faceDual2);
		futurSolide.add(faceDual3);
		futurSolide.add(faceDual4);
		Solide dual = new Solide(futurSolide);
		
		assertTrue(Solide.getDual(s1).equals(dual));
		
	}
}
