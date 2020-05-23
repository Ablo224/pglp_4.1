package uvsq21606235;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public final class App {
		
		
	    public static void main(final String[] args) {
	    	GroupePersonnel p1 = new GroupePersonnel();
	    	GroupePersonnel p2 = new GroupePersonnel();
	    	GroupePersonnel p3 = new GroupePersonnel();
	    	
	    	ArrayList<String> num = new ArrayList<String>();
	    	num.add("07-28-54-81-10");
	    	num.add("09-10-15-00-00");
	        Personnel p = new Personnel.Builder("Ababa","Amoulanfé", "Animateur", LocalDate.of(1900, 9, 12),num).build();
	      
	        p3.add(p);
	        p3.add(p2);
	        p1.add(p2);
	        p1.add(p3);
	        System.out.println("Parcours en largeur : ");
	        AffichageParGroupe parcours = new AffichageParGroupe();
	        System.out.println("Parcours en profondeur : ");
	        p1.affichage();
	    }
	    
	    public  App() {
	    	App.main(null); 
	    }
	}

