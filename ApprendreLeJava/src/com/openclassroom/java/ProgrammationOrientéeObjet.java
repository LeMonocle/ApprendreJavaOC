package com.openclassroom.java;

public class ProgrammationOrientéeObjet {

	public static void main(String[] args) {
		Marque apple = new Marque("Apple");

		Telephone iphone = new Telephone(34000, "iPhone", apple);

		iphone.nom = iphone.nom + " Tadaa";

		System.out.println(iphone.nom);
	}

}

class Telephone {
	int pixels;
	String nom;
	Marque marque;

	public Telephone(int pixels, String nom, Marque marque) {
		this.pixels = pixels;
		this.nom = nom;
		this.marque = marque;
	}
}

class Marque {
	String nom;

	public Marque(String nom) {
		this.nom = nom;
	}
}
