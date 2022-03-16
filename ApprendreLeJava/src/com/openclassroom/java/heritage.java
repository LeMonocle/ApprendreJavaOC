package com.openclassroom.java;

public class heritage {

	public static void main(String[] args) {
		Voiture peugeot = new Voiture();
		peugeot.start();

		Bateau yamaha = new Bateau();
		yamaha.start();

	}

}

//classe mère
class Vehicule {
	void start() {
		System.out.println("Vrooooom !");
	}
}

//classe fille qui reprends les caractéristiques de la classe mère
class Voiture extends Vehicule {

	@Override
	void start() {
		super.start();
		allumerFeux();
	}

	void allumerFeux() {
		System.out.println("Allumage feux");
	}
}

class Bateau extends Vehicule {

	@Override
	void start() {
		super.start();
		helicesLancees();
	}

	void helicesLancees() {
		System.out.println("Tchoug Tchoug Tchoug...");
	}
}
