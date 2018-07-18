package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {
	
	public static void main(String[] args) {
		Personne p = new Personne();
		p.nom = "Petit";
		p.prenom = "Léa";
		p.adresse = new AdressePostale();
		p.adresse.libelleRue = "place de la gare";
		p.adresse.codePostal = 44000;
		p.adresse.ville = "Nantes";
		
		
	}
}
