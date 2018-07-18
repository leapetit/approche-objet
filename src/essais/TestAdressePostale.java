package essais;

import entites.AdressePostale;

public class TestAdressePostale {
	public static void main(String[] args) {
		String a = "hola";
		System.out.println(a);

		AdressePostale b = new AdressePostale();
		b.numerodeRue = 5;
		b.libelleRue = "rue du Marché";
		b.codePostal = 17000;
		b.ville = "Vire";

	}
}