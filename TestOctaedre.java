package de3d;

import junit.framework.TestCase;

public class TestOctaedre extends TestCase {

	public void testOctaedre() {	
			
			// creation d'un solide octaedrique
			
			Solide i = Octaedre.octaedre();
			
			/* creation de points qui ont les memes coordonnees que ceux qui 
			 * constituent notre solide (car octaedre() n'a pas de parametres)
			 */
			
			Point p1 = new Point(-25, 0,-25);
			Point p2 = new Point(-25, 0,25);
			Point p3 = new Point(25, 0,-25);
			Point p4 = new Point(25,0,25);
			float hauteur = (float) (50/Math.sqrt(2));
			// on se sert de la hauteur pour donnee les coordonees des sommets manquant
			Point p5 = new Point(0, hauteur,0);
			Point p6 = new Point(0,-hauteur,0);
			
			//On teste si les points de l'octaedre i sont bien les memes que ceux créés
			
			assertTrue(i.getPoint().get(4).getAbscisse()==(p1.getAbscisse()));
			assertTrue(i.getPoint().get(1).getAbscisse()==(p2.getAbscisse()));
			assertTrue(i.getPoint().get(5).getAbscisse()==(p3.getAbscisse()));
			assertTrue(i.getPoint().get(3).getAbscisse()==(p4.getAbscisse()));
			assertTrue(i.getPoint().get(2).getAbscisse()==(p5.getAbscisse()));
			assertTrue(i.getPoint().get(0).getAbscisse()==(p6.getAbscisse()));
			
			assertTrue(i.getPoint().get(4).getOrdonnee()==(p1.getOrdonnee()));
			assertTrue(i.getPoint().get(1).getOrdonnee()==(p2.getOrdonnee()));
			assertTrue(i.getPoint().get(5).getOrdonnee()==(p3.getOrdonnee()));
			assertTrue(i.getPoint().get(3).getOrdonnee()==(p4.getOrdonnee()));
			assertTrue(i.getPoint().get(2).getOrdonnee()==(p5.getOrdonnee()));
			assertTrue(i.getPoint().get(0).getOrdonnee()==(p6.getOrdonnee()));
			
			assertTrue(i.getPoint().get(4).getProfondeur()==(p1.getProfondeur()));
			assertTrue(i.getPoint().get(1).getProfondeur()==(p2.getProfondeur()));
			assertTrue(i.getPoint().get(5).getProfondeur()==(p3.getProfondeur()));
			assertTrue(i.getPoint().get(3).getProfondeur()==(p4.getProfondeur()));
			assertTrue(i.getPoint().get(2).getProfondeur()==(p5.getProfondeur()));
			assertTrue(i.getPoint().get(0).getProfondeur()==(p6.getProfondeur()));
			
			//On teste si les faces de l'octaedre contiennent bien les points créés
			
			assertTrue(i.getFaces().get(0).contient(p1));
			assertTrue(i.getFaces().get(0).contient(p2));
			assertTrue(i.getFaces().get(0).contient(p5));
			
			assertTrue(i.getFaces().get(1).contient(p1));
			assertTrue(i.getFaces().get(1).contient(p2));
			assertTrue(i.getFaces().get(1).contient(p6));
			
			assertTrue(i.getFaces().get(2).contient(p1));
			assertTrue(i.getFaces().get(2).contient(p3));
			assertTrue(i.getFaces().get(2).contient(p5));
			
			assertTrue(i.getFaces().get(3).contient(p1));
			assertTrue(i.getFaces().get(3).contient(p3));
			assertTrue(i.getFaces().get(3).contient(p6));
		
			assertTrue(i.getFaces().get(4).contient(p3));
			assertTrue(i.getFaces().get(4).contient(p4));
			assertTrue(i.getFaces().get(4).contient(p5));
			
			assertTrue(i.getFaces().get(5).contient(p3));
			assertTrue(i.getFaces().get(5).contient(p4));
			assertTrue(i.getFaces().get(5).contient(p6));
			
			assertTrue(i.getFaces().get(6).contient(p2));
			assertTrue(i.getFaces().get(6).contient(p4));
			assertTrue(i.getFaces().get(6).contient(p5));
			
			assertTrue(i.getFaces().get(7).contient(p2));
			assertTrue(i.getFaces().get(7).contient(p4));
			assertTrue(i.getFaces().get(7).contient(p6));
			
			
			
	}
	
}
