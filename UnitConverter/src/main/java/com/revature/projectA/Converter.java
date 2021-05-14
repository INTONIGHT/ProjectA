package com.revature.projectA;

import java.util.Scanner;

public class Converter {
	public static double collectQuantity() {
		Scanner userInput = new Scanner(System.in);
		double userQuantity = userInput.nextDouble();
		//userInput.close();
		return userQuantity;
	}
	public static int collectChoice() {
		Scanner userChoice = new Scanner(System.in);
		int userOption = userChoice.nextInt();
		//i know it says its never closed but i close it in the main
		//program So im sure i dont want to close it here
		return userOption;
	}
	public static void main(String[] args) {
		int menuSelection = 0;
		double quantity = 0;
		
		//declaring an array of choices to chose from
		//could add meters to feet and incehs to cm
		//and lb to kg
		String[] listChoices = {"1.Gallons to Liters",
				"2.Farenheit to Celsius",
				"3.Miles to Kilometers",
				"4.Quit"};
		//making a length 
		System.out.println("Please chose an option");
		Scanner scanner = new Scanner(System.in);
		int choiceLength = listChoices.length;
		for(int i =0 ;i < choiceLength; i++) {
			System.out.println(listChoices[i].toString());
		}
		menuSelection = scanner.nextInt();
		while(menuSelection != choiceLength) {
			switch(menuSelection) {
			case 1: 
				System.out.println("Please select the amount of gallons you wish to convert");
				quantity = collectQuantity();
				double liters = quantity * 3.78541;
				System.out.println("The amount of liters is " + liters);
				break;
			case 2:
				System.out.println("Please chose temperature");
				quantity = collectQuantity();
				double temp = (quantity -32) * 5/9;
				System.out.println("The temperature in celsius is "+ temp);
				break;
			case 3 :
				System.out.println("Please chose Miles");
				quantity = collectQuantity();
				double kilometers = quantity * 1.60934;
				System.out.println("The amount of kilometers is " + kilometers);
				break;
			default :
				return;
			}
			System.out.println("Chose an option between 1 and 3 otherwise type 4 to end the program");
			menuSelection = collectChoice();
			
			//Right now the program errors out however this design is intentional
			//My goal is to eventually let the user change the input 
			//but it technically works as intended.
		}
		scanner.close();
	}
}

