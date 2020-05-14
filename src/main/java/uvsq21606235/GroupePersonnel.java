package uvsq21606235;

import java.util.ArrayList;
import java.util.Iterator;

public class GroupePersonnel implements PersonnelInterface, Iterable<PersonnelInterface> {
	
	private ArrayList<PersonnelInterface> lePersonnel;
	
	private final int cle;
	
	private static int idUnique = 1;
	
	public  GroupePersonnel() {
		// TODO Auto-generated constructor stub
		cle = idUnique++;
		lePersonnel= new ArrayList<PersonnelInterface>();
	}
	
	public void affichage() {
		System.out.println("Id : " + cle);
		for (PersonnelInterface p : lePersonnel) {
			p.affichage();
		}
	}
	
	/**
	 * ajout d'une personne
	 */
	
	public GroupePersonnel add(PersonnelInterface p) {
		if (!lePersonnel.contains(p)) {
			lePersonnel.add(p);
		}
		return this;
	}
	
	/**
	 * suppression d'une personne de la liste
	 */
	public GroupePersonnel delete(PersonnelInterface p) {
		if(lePersonnel.contains(p)) {
			lePersonnel.remove(p);
		}
		return this;
	}
	
	/**
	 * obtention de l'identifiant
	 */
	public int getIdUnique() {
		return this.idUnique;
	}

	@Override
	public Iterator<PersonnelInterface> iterator() {
		// TODO Auto-generated method stub
		return lePersonnel.iterator();
	}

}
