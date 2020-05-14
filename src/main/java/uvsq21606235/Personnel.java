package uvsq21606235;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

public final class Personnel implements PersonnelInterface {
	
	/**
	 * le nom de la personne
	 */
	private String Nom;
	
	/**
	 * prenom de la personne
	 */
	private String Prenom;
	
	/**
	 * la fonction de la personne
	 */
	private String Fonction;
	
	/**
	 * la date de naissance de la personne
	 */
	private LocalDate dateNaissance;
	
	/**
	 * liste des numéro de la personne
	 */
	private ArrayList<String> Numero;
	
	
	
	public static class Builder{
			/**
			 * le nom de la personne
			 */
			private String Nom;
			
			/**
			 * prenom de la personne
			 */
			private String Prenom;
			
			/**
			 * la fonction de la personne
			 */
			private String Fonction;
			
			/**
			 * la date de naissance de la personne
			 */
			private LocalDate dateNaissance;
			
			/**
			 * liste des numéro de la personne
			 */		
			private ArrayList<String> Numero;	
			
			public Builder(String Nom, String Prenom, String Fonction, LocalDate dateNaissance,ArrayList<String> numero) {
				this.Nom = Nom;
				this.Prenom = Prenom;
				this.Fonction = Fonction;
				this.dateNaissance = dateNaissance;
				this.Numero = numero;
			}
			
			
			/**
			 * ajout d'un numéro à la liste des numéros de la personne
			 * @param Numero
			 * @return
			 */
			public Builder Numero(String Numero) {
				this.Numero.add(Numero);
				return this	;
			}
			
			/**
			 * methode pour construire une var personnel avec builder
			 */
			public Personnel build() {
				return new Personnel(this);
			}
		}
	
	
	
	public Personnel(Builder builder) {
		this.Nom = builder.Nom;
		this.Prenom = builder.Prenom;
		this.dateNaissance = builder.dateNaissance;
		this.Numero = builder.Numero;
		this.Fonction = builder.Fonction;
	}
	
	public void affichage() {
		System.out.println("Nom : "+Nom);
		System.out.println("Prenom : "+Prenom);
		System.out.println("Fonction : "+Fonction);
		System.out.println("Date de Naissance : "+dateNaissance);
		for(String num : this.Numero) {
			System.out.println(num + " ");
		}
	}
	
//	@Override
//	public void affichageLargeur() {	
//	}

}
