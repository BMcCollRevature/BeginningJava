package main;

import java.util.Scanner;

public class Converter {
	
	public static void main(String[] args) {
		
		int menuSelection = 0;
		int secondaryChoice = 0;
		double amount;
		Scanner scanner = new Scanner(System.in);
		
		
		// Menu
		while(menuSelection != 4)
		{
		System.out.println("Please select an option:");
		System.out.println("\t1. Distance Conversion");
		System.out.println("\t2. Volume Conversion");
		System.out.println("\t3. Weight Conversion");
		System.out.println("\t4. Quit");
		
		// Out put of options and conversions
		menuSelection = scanner.nextInt();
		
		//switch statement for distance conversions
			switch(menuSelection) 
			{
			case 1: System.out.println("Please enter which distance conversion you want: ");
				while(secondaryChoice != 4)
				{
					System.out.println("\t\t1. Feet to Centimeters");
					System.out.println("\t\t2. Meter to Feet");
					System.out.println("\t\t3. Mile to Kilometers");
					System.out.println("\t\t4. Quit");
				
					secondaryChoice = scanner.nextInt();
				
					switch(secondaryChoice)
					{
					case 1: System.out.println("Please enter an amount: ");
						amount = scanner.nextInt();
						System.out.println(amount + " feet equals " + convertFeettoCenti(amount) + "centimeters.\n");
						break;
					case 2: System.out.println("Please enter an amount: ");
						amount = scanner.nextInt();
						System.out.println(amount + " meters equals " + convertmeterstofeet(amount) + " feet.\n");
						break;
					case 3: System.out.println("Please enter an amount: ");
						amount = scanner.nextInt();
						System.out.println(amount + " miles equals " + convertmiletokilometers(amount) + " kilometers.\n");
						break;
					case 4: System.out.println("Going back to Main Menu ");
						break;
					default: System.out.println("Invalid entry, please enter 1, 2, 3, or 4\n"); 
					}
				}
				break;
			
			
		// switch case for volume conversions
			case 2: System.out.println("Please enter which volume conversion you want:  ");
				while(secondaryChoice != 4)
				{
					System.out.println("\t\t1. Gallon to Ounces");
					System.out.println("\t\t2. Cups to Tablespoons");
					System.out.println("\t\t3. Quart to Gallons");
					System.out.println("\t\t4. Quit");
			
					secondaryChoice = scanner.nextInt();
			
					switch(secondaryChoice)
					{
					case 1: System.out.println("Please enter an amount: ");
						amount = scanner.nextInt();
						System.out.println(amount + " gallons equals " + convertGallonstoOunces(amount) + " ounces.\n");
						break;
					case 2: System.out.println("Please enter an amount: ");
						amount = scanner.nextInt();
						System.out.println(amount + " cups equals " + convertCuptoTBSP(amount) + " tablespoons.\n");
						break;
					case 3: System.out.println("Please enter an amount: ");
						amount = scanner.nextInt();
						System.out.println(amount + " quarts equals " + convertquarttogallon(amount) + " gallons.\n");
						break;
					case 4: System.out.println("Going back to Main Menu ");
					break;
					default: System.out.println("Invalid entry, please enter 1, 2, 3, or 4\n"); 
					}
				}
				break;
			
		// switch statement for Weight Conversions	
			case 3: System.out.println("Please enter which weight conversion you want:  ");
				while(secondaryChoice != 4)
				{
					System.out.println("\t\t1. Pounds to Kilograms");
					System.out.println("\t\t2. Ounces to Pounds");
					System.out.println("\t\t3. Grams to Ounces");
					System.out.println("\t\t4. Quit");
			
					secondaryChoice = scanner.nextInt();
			
					switch(secondaryChoice)
					{
					case 1: System.out.println("Please enter an amount: ");
						amount = scanner.nextInt();
						System.out.println(amount + " pounds equals " + convertpoundstokilo(amount) + " kilograms.\n");
						break;
					case 2: System.out.println("Please enter an amount: ");
						amount = scanner.nextInt();
						System.out.println(amount + " ounces equals " + convertouncetopound(amount) + " pounds.\n");
						break;
					case 3: System.out.println("Please enter an amount: ");
						amount = scanner.nextInt();
						System.out.println(amount + " grams equals " + convertgramtoounce(amount) + " ounces.\n");
						break;
					case 4: System.out.println("Going back to Main Menu ");
						break;
					default: System.out.println("Invalid entry, please enter 1, 2, 3, or 4\n"); 
					}
				}
			
				break;
			case 4: System.out.println("Thank you for using this application.");
				break;
			default: System.out.println("Invalid entry, please enter 1, 2, 3, or 4\n"); 
			}
		}
		
		
		scanner.close();
	}
	
				// Conversion Math
	
	// Distance Conversions
	public static double convertFeettoCenti(double feet) {
		double centi = feet * 30.48;
		
		return centi;
	}
	public static double convertmeterstofeet(double meters) {
		double feet = meters * 3.281;
		
		return feet;
	}
	public static double convertmiletokilometers(double mile) {
		double kilometer = mile * 1.609;
		
		return kilometer;
	}
	
	//Volume Conversions
	
	public static double convertGallonstoOunces(double gallon) {
		double ounces = gallon * 128;
		
		return ounces;
	}
	
	public static double convertCuptoTBSP(double cup) {
		double TBSP = cup * 16.231;
		
		return TBSP;
	}
	public static double convertquarttogallon(double quart) {
		double gallon = quart / 4;
		
		return gallon;
	}

	//Weight Conversions
	public static double convertpoundstokilo(double pounds) {
		double kilo = pounds / 2.205;
		
		return kilo;
	}
	public static double convertouncetopound(double ounce) {
		double pound = ounce / 16;
		
		return pound;
	}
	public static double convertgramtoounce(double gram) {
		double ounce = gram / 28.35;
		
		return ounce;
	}
	
}
