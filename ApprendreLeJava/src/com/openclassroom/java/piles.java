package com.openclassroom.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class piles {

	public static void main(String[] args) {

		// Tableaux

		String[] tableau = new String[10];

		tableau[3] = "Index 3";

		tableau[1] = "Index 1";

		tableau[3] = "Nouvelle donnée";

		for (int i = 0; i < tableau.length; i++) {
			System.out.println(tableau[i]);
		}

		// Listes

		List<String> myList = new ArrayList<String>();

		myList.add("Coucou");
		myList.add("Salut");
		myList.add(1, "Hop, hop !");

		System.out.println(myList);
		System.out.println("Ma liste contient " + myList.size() + " élément(s) !");

		myList.set(0, "Bouh");

		System.out.println(myList);
		System.out.println("Ma liste contient " + myList.size() + " élément(s) !");

		// On donne l'index de l'éléments à retirer
		myList.remove(0);

		System.out.println(myList);
		System.out.println("Ma liste contient " + myList.size() + " élément(s) !");

		// Collections non-ordonnées

		Set<String> ingredients = new HashSet<String>();

		ingredients.add("beurre");
		ingredients.add("Sucre");
		ingredients.add("Oeufs");
		ingredients.add("sel");

		// On donne le nom précis de l'éléments à retirer
		ingredients.remove("sel");

		System.out.println("Voici mes ingrédients : " + ingredients);
	}

}
