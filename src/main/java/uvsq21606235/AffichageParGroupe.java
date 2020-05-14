package uvsq21606235;

import java.util.ArrayDeque;
import java.util.Iterator;

public class AffichageParGroupe implements Iterable<PersonnelInterface>{
	
	
	private ArrayDeque<PersonnelInterface> g = new ArrayDeque<PersonnelInterface>();
	
	
	public Iterator<PersonnelInterface> iterator() {
		return g.iterator();
	}
	
	public void parcoursLargeur(PersonnelInterface ip) {
		/**
		 * implémentation
		 */
		
	}
	
	/**
	 * affiche le parcours .
	 */
	public void affichage() {
		GroupePersonnel tmp;
		/**
		 * affichage d'un parcours
		 */
		for (PersonnelInterface p : g) {
			if (p.getClass() == GroupePersonnel.class) {
				tmp = (GroupePersonnel) p;
				System.out.println(tmp.getIdUnique());
			} else {
				p.affichage();
			}
		}
	}
}

