/*
 * Recitation2_Exercise_Tyler_Fuller.java
 * Tyler Fuller
 * 01261802
 * 09/06/2023
 */

import java.util.*; // Import Scanner to get user input

public class Recitation2_Exercise_Tyler_Fuller {

	public static void main(String[] args) {
		
		// Define variables
		int remainingAmount, dollars, quarters, dimes, nickels, pennies;
		double amount;
		
		// Ask user for amount of money (e.g. 11.56)
		System.out.print("Enter amount of money: ");
		Scanner input = new Scanner(System.in);
		amount = input.nextDouble();
		input.close();
		
		// Convert amount to total cents
		remainingAmount = (int)(amount * 100);
		
		// Compute number of dollars and remaining change
		dollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;
		
		// Compute number of quarters and remaining change
		quarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;
		
		// Compute number of dimes and remaining change
		dimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
				
		// Compute number of nickels and remaining change
		nickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		
		// Set pennies equal to remaining change
		pennies = remainingAmount;
		
		// Print results to console
		System.out.println("Dollars: " + dollars);
		System.out.println("Quarters: " + quarters);
		System.out.println("Dimes: " + dimes);
		System.out.println("Nickels: " + nickels);
		System.out.println("Pennies: " + pennies);

	}
}
