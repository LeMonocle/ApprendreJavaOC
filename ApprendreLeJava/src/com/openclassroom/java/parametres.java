package com.openclassroom.java;

public class parametres {

	public static void main(String[] args) {

		displayParameter(10, 11);
		displayParameter(2, 5);

		// On utilise des strings = INDEPENDANCE (type valeur)
		String nom1 = "Jean";
		String nom2 = nom1;

		nom1 = "Laurent";

		afficheNom(nom1);
		afficheNom(nom2);

		// On utilise des class = POINTEURS (type référence)
		Personne personne1 = new Personne("Yohann");
		Personne personne2 = personne1;

		personne1.nom = "Claude";

		afficheNom(personne1.nom);
		afficheNom(personne2.nom);

		int k = 11;
		int t = 16;
		if (k == t) {
			System.out.println("k et t sont identiques");
		} else if (k + 3 == t - 2) {
			System.out.println("k et t sont différents mais nous pouvons ajuster");
		} else {
			System.out.println("k et t sont très différents");
		}

		int x = 1;
		int y = 10;
		x = transform(x, y);
		y = transform(y, x);

		System.out.println(x);
		System.out.println(y);

	}

	public static int displayParameter(int length, int width) {
		int perimeter = 2 * (length + width);
		return perimeter;
	}

	static void afficheNom(String text) {
		System.out.println("-> " + text);
	}

	public static int transform(int a, int b) {
		int x = a + b;
		int y = x * 2;
		return y;
	}
}

class Personne {
	String nom;

	Personne(String nom) {
		this.nom = nom;
	}
}