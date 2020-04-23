package lab6;

import java.util.Scanner;

public class RollDice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int die[] = new int[2];
		int numSides;
		int rollNum = 1;
		boolean rollAgain = true;
		
		System.out.println("Welcome to Grand Circus Casino!\n");
		
		numSides = DiceMethods.setSides();
		
		do {
			for (int i = 0; i < 2; i++) {
				die[i] = DiceMethods.generateRandomDieRoll(numSides);
			}
			
			System.out.println("\nRoll " + rollNum + ":\n" + die[0] + "\n" + die[1]);
			DiceMethods.checkRoll(die[0], die[1]);
			//do checkRoll too
			
			System.out.print("\nRoll again? (y/n): ");
			rollAgain = DiceMethods.keepRolling(scan.next().toLowerCase());
			rollNum++;
		} while (rollAgain);
		
		scan.close();
	}
	
	
}
