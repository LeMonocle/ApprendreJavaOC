package com.openclassroom.java;

public class Cours {

	public static void main(String[] args) {
		int nombre = 2;
		int x = 10;
		x += 12;
		final int y = x / 4;
		x = x + y;

		System.out.println("X = " + x + " et Y = " + y);

		int loopLimit = 101;
		int iterations = 0;
		for (int k = 5; k < loopLimit; k++) {
			iterations += 1;
		}
		System.out.println(iterations + " itérations");

		int numberOfCups = 0;
		do {
			System.out.println("I'm feeling sleepy");
			numberOfCups += 1;
			System.out.println("I drunk " + numberOfCups + " cups of coffee");
		} while (numberOfCups < 10);
		System.out.println("I'm feeling awake now!");

		if (nombre == 1) {
			console("if 1");
		} else if (nombre == 2) {
			console("if 2");
		} else {
			console("else");
		}

		switch (nombre) {
		case 1:
			console("switch 1");
			break;
		default:
			console("default");
		}
	}

	static void console(String text) {
		System.out.println("Condition : " + text);
	}

	public class Rectangle {
		public int width = 4;
		private int borderWidth = 1;

		public static void main(String[] args) {
			int mainWidth = 28;
		}

		public void printValues() {
			final int newWidth = 12;

			if (true) {
				int pixelSize = 5;
			}
			// Quelle variable pourrait être utilisé ici ?
			System.out.println(borderWidth);
		}
	}

}
