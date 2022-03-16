package com.openclassroom.java;

public class heritage {

	public static void main(String[] args) {
		Voiture peugeot = new Voiture();
		peugeot.start();

		Bateau yamaha = new Bateau();
		yamaha.start();

	}

}

//classe m�re
class Vehicule {
	void start() {
		System.out.println("Vrooooom !");
	}
}

//classe fille qui reprends les caract�ristiques de la classe m�re
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
