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

		tableau[3] = "Nouvelle donn�e";

		for (int i = 0; i < tableau.length; i++) {
			System.out.println(tableau[i]);
		}

		// Listes

		List<String> myList = new ArrayList<String>();

		myList.add("Coucou");
		myList.add("Salut");
		myList.add(1, "Hop, hop !");

		System.out.println(myList);
		System.out.println("Ma liste contient " + myList.size() + " �l�ment(s) !");

		myList.set(0, "Bouh");

		System.out.println(myList);
		System.out.println("Ma liste contient " + myList.size() + " �l�ment(s) !");

		// On donne l'index de l'�l�ments � retirer
		myList.remove(0);

		System.out.println(myList);
		System.out.println("Ma liste contient " + myList.size() + " �l�ment(s) !");

		// Collections non-ordonn�es

		Set<String> ingredients = new HashSet<String>();

		ingredients.add("beurre");
		ingredients.add("Sucre");
		ingredients.add("Oeufs");
		ingredients.add("sel");

		// On donne le nom pr�cis de l'�l�ments � retirer
		ingredients.remove("sel");

		System.out.println("Voici mes ingr�dients : " + ingredients);
	}

}
