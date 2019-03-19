package de3d;

import java.util.ArrayList;

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
	
	private static ArrayList<Arete> lf1 = new ArrayList<Arete>();
	private static ArrayList<Arete> lf2 = new ArrayList<Arete>();
	private static ArrayList<Arete> lf3 = new ArrayList<Arete>();
	private static ArrayList<Arete> lf4 = new ArrayList<Arete>();
	
	private static Face f1 = new Face(lf1);
	private static Face f2 = new Face(lf2);
	private static Face f3 = new Face(lf3);
	private static Face f4 = new Face(lf4);
}
