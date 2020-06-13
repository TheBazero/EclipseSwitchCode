package com.syntax.class06;

import java.util.Scanner;

public class TaskSwitch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your country name");
		String countryName = scan.next();
		String language;
		switch (countryName) {
		case "Usa":
			language = "English";
			break;
		case "Russia":
			language = "Russian";
			break;
		case "Spain":
			language = "Spanish";
			break;
		default:
			language = "I do not know";

		}
		System.out.println("Your country language is " + language);
		scan.close();
	}
}