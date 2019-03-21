package de3d;

import java.util.ArrayList;

public class Cube extends Solide{

	public Cube(ArrayList<Face> t) {
		super(t);
	}
	
	public static Solide cube (Point milieu, int longueur) {
		//prerequis: donner le milieu de votre cube et la longeur des cotes de votre cube souhaite
		
		// On recupere les coordonnees du point au centre du cube donnee en parametre
 		float moitie= longueur/2;
		float x=milieu.getAbscisse();
		float y=milieu.getOrdonnee();
		float z=milieu.getProfondeur();
		
		
		// On trouve tous les sommets du cube en ajoutant ou soustrayant la moitie de la longueur 
		Point a= new Point(x-moitie, y-moitie, z+moitie);
		Point b= new Point(x-moitie, y-moitie, z-moitie);
		Point c= new Point(x+moitie, y-moitie, z-moitie);
		Point d= new Point(x+moitie, y-moitie, z+moitie);
		Point e= new Point(x-moitie, y+moitie, z+moitie);
		Point f= new Point(x-moitie, y+moitie, z-moitie);
		Point g= new Point(x+moitie, y+moitie, z-moitie);
		Point h= new Point(x+moitie, y+moitie, z+moitie);



	/*


		// On trouve tous les sommets du cube en ajoutant ou soustrayant la moitie de la longueur 
		Point a= new Point(milieu.getAbscisse()-moitie, milieu.getOrdonnee()-moitie, milieu.getProfondeur()+moitie);
		Point b= new Point(milieu.getAbscisse()-moitie, milieu.getOrdonnee()-moitie, milieu.getProfondeur()-moitie);
		Point c= new Point(milieu.getAbscisse()+moitie, milieu.getOrdonnee()-moitie, milieu.getProfondeur()-moitie);
		Point d= new Point(milieu.getAbscisse()+moitie, milieu.getOrdonnee()-moitie, milieu.getProfondeur()+moitie);
		Point e= new Point(milieu.getAbscisse()-moitie, milieu.getOrdonnee()+moitie, milieu.getProfondeur()+moitie);
		Point f= new Point(milieu.getAbscisse()-moitie, milieu.getOrdonnee()+moitie, milieu.getProfondeur()-moitie);
		Point g= new Point(milieu.getAbscisse()+moitie, milieu.getOrdonnee()+moitie, milieu.getProfondeur()-moitie);
		Point h= new Point(milieu.getAbscisse()+moitie, milieu.getOrdonnee()+moitie, milieu.getProfondeur()+moitie);
	*/	
		// On definit les diferentes face du cube
		ArrayList<Point> po = new ArrayList<Point>();
		ArrayList<Arete> ar = new ArrayList<Arete>();
		ArrayList<Face> lf = new ArrayList<Face>();
//		ArrayList<Face> face_triangle = new ArrayList<Face>();
		
		Point[][] pts = new Point[][] {
			{d, c, b, a}, 
			{e, f, g, h},	 
			{d, a, e, h},  
			{b, f, e, a},  
			{c, g, f, b},   
			{c, d, h, g}   
		};
		
		
		
		for (int i = 0; i < 6; i++) {
			Face w = new Face(ar);
			for (int j = 0; j < 4; j++) {
				po.add(pts[i][j]);
			}
			w.face(po);
			po.clear();
			lf.add(w);
//			face_triangle.addAll(w.triangle());			
//			po.clear();
//			lf.addAll(face_triangle);
//			face_triangle.clear();
		}
		
		Solide t= new Solide(lf);
		return t;
	}


}