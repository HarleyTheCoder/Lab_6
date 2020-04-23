package lab6;

import java.util.Scanner;
import java.lang.Math; 

public class DiceMethods {
	
	//Set the number of sides
	public static int setSides() {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many sides should each die have? ");
		return scan.nextInt();
	}

	//Roll a die with specified number of sides
	public static int generateRandomDieRoll(int numSides1) {
		int result = (int)(numSides1 * Math.random() + 1);
		return result;
	}
	
	//Check if dice roll has any special name in Craps
	public static void checkRoll(int a, int b) {
		int total = a + b;
		
		if (total == 2) {
			System.out.println("Craps! Snake eyes!");
		} else if (total == 12) {
			System.out.println("Craps! Box cars!");
		} else if (total == 3) {
			System.out.println("Craps!");
		}
		
	}
	
	//Roll again
	public static boolean keepRolling(String answer) {
		while (true) {
			if (answer.startsWith("y")) {
				return true;
			} else if (answer.startsWith("n")) {
				return false;
			} else {
				Scanner scnr = new Scanner(System.in);
				System.out.println("\nPlease indicate \"yes\" or \"no\".");
				answer = scnr.next().toLowerCase();
			}
		}
	}
}