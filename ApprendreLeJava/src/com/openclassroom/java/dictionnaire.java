package com.openclassroom.java;

import java.util.HashMap;
import java.util.Map;

public class dictionnaire {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("Jean", 34);
		map.put("Anaïs", 25);

		map.put("Jean", 98);

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			printEntry(entry);
		}

		System.out.println(map.get("Jean"));

	}

	// Affiche une entrée d'un dictionnaire
	static void printEntry(Map.Entry entry) {
		System.out.println(entry.getKey() + " -> " + entry.getValue());
	}

}
