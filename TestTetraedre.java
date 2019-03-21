package de3d;



import junit.framework.TestCase;

public class TestTetraedre extends TestCase {
	
	
	public void testTetraedre() {	
		
		// creation d'un solide tetraedrique
		
		Solide i = Tetraedre.tetraedre();
		
		/* creation de points qui ont les memes coordonnees que ceux qui 
		 * constituent notre solide (car tetraedre() n'a pas de parametres)
		 */
		
		Point p1 = new Point((float)-30.0, (float)0.0, (float)0.0);
		Point p2 = new Point((float)0.0, (float)48.98979, (float)17.320509);
		Point p3 = new Point((float)30.0, (float)0.0, (float)0.0);
		Point p4 = new Point((float)0.0, (float)0.0, (float)51.961525);		
		
		//On teste si les points du tetraedre i sont bien les memes que ceux créés
		
		assertTrue(i.getPoint().get(0).getAbscisse()==(p1.getAbscisse()));
		assertTrue(i.getPoint().get(1).getAbscisse()==(p2.getAbscisse()));
		assertTrue(i.getPoint().get(2).getAbscisse()==(p3.getAbscisse()));
		assertTrue(i.getPoint().get(3).getAbscisse()==(p4.getAbscisse()));
		
		assertTrue(i.getPoint().get(0).getOrdonnee()==(p1.getOrdonnee()));
		assertTrue(i.getPoint().get(1).getOrdonnee()==(p2.getOrdonnee()));
		assertTrue(i.getPoint().get(2).getOrdonnee()==(p3.getOrdonnee()));
		assertTrue(i.getPoint().get(3).getOrdonnee()==(p4.getOrdonnee()));
		
		assertTrue(i.getPoint().get(0).getProfondeur()==(p1.getProfondeur()));
		assertTrue(i.getPoint().get(1).getProfondeur()==(p2.getProfondeur()));
		assertTrue(i.getPoint().get(2).getProfondeur()==(p3.getProfondeur()));
		assertTrue(i.getPoint().get(3).getProfondeur()==(p4.getProfondeur()));
		
		//On teste si les faces du tetraedre contiennent bien les points créés
		
//		Arete a1 = new Arete(p1, p3);
//		Arete a2 = new Arete(p1, p4);
//		Arete a3 = new Arete(p3, p4);
//		Arete a4 = new Arete(p1, p2);
//		Arete a5 = new Arete(p2, p3);
//		Arete a6 = new Arete(p2, p4);
		
		
		assertTrue(i.getFaces().get(0).contient(p1));
		assertTrue(i.getFaces().get(0).contient(p3));
		assertTrue(i.getFaces().get(0).contient(p4));
		
		assertTrue(i.getFaces().get(1).contient(p1));
		assertTrue(i.getFaces().get(1).contient(p2));
		assertTrue(i.getFaces().get(1).contient(p3));
		
		assertTrue(i.getFaces().get(2).contient(p1));
		assertTrue(i.getFaces().get(2).contient(p2));
		assertTrue(i.getFaces().get(2).contient(p4));
		
		assertTrue(i.getFaces().get(3).contient(p2));
		assertTrue(i.getFaces().get(3).contient(p3));
		assertTrue(i.getFaces().get(3).contient(p4));
		
		
		
	}
}