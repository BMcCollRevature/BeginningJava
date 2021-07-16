package main;

import java.util.Scanner;

public class Converter {
	
	public static void main(String[] args) {
		
		int menuSelection = 0;
		double amount;
		Scanner scanner = new Scanner(System.in);
		
		while(menuSelection != 4)
		{
		System.out.println("Please select an option:");
		System.out.println("\t1. Gallon to Ounces");
		System.out.println("\t2. Feet to Centimeters");
		System.out.println("\t3. Cups to Tablespoons");
		System.out.println("\t4. Quit");
		
		menuSelection = scanner.nextInt();
		switch(menuSelection) {
		case 1: System.out.println("Please enter an amount: ");
			amount = scanner.nextInt();
			System.out.println(amount + " gallons equals " + convertGallonstoOunces(amount) + " ounces.\n");
			break;
		case 2: System.out.println("Please enter an amount: ");
			amount = scanner.nextInt();
			System.out.println(amount + " feet equals " + convertFeettoCenti(amount) + "centimeters.\n");
			break;
		case 3: System.out.println("Please enter an amount: ");
			amount = scanner.nextInt();
			System.out.println(amount + " cups equals " + convertCuptoTBSP(amount) + "tablespoons.\n");
			break;
		case 4: System.out.println("Thank you for using this application.");
			break;
		default: System.out.println("Invalid entry, please enter 1, 2, 3, or 4\n"); 
		}
		}
		
		
		scanner.close();
	}
	
	public static double convertGallonstoOunces(double gallon) {
		double ounces = gallon * 128;
		
		return ounces;
	}
	
	public static double convertFeettoCenti(double feet) {
		double centi = feet * 30.48;
		
		return centi;
	}
	
	public static double convertCuptoTBSP(double cup) {
		double TBSP = cup * 30.48;
		
		return TBSP;
	}
	
}
