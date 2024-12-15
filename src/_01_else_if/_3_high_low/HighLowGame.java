
package _01_else_if._3_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 50. 
		int lotNumber = new Random().nextInt(51);
		
		// 2. Print out the random variable above
		System.out.println(lotNumber);
		// 11. Repeat steps 1 to 10 ten times
		
			// 1. Ask the user for a guess using a pop-up window, and save their response 
		String guessString = JOptionPane.showInputDialog("Heelloo! Thank you for buying a ticket called the "+ "'More fair lottery ticket' Make a guess now please inbetween 1-50");
			// 4. Convert the users’ answer to an int 
		for (int honk = 0; honk < 10; honk++) {
		int guessInt = Integer.parseInt(guessString);
			
			// 5. if the guess is correct
				// 6. Win
		if(guessInt == lotNumber) {
			JOptionPane.showMessageDialog(null, "Yay you won! You have earned... the penny from my pocket!!");
			System.exit(0);
		}
				// 12. Use "" to quit the game if the user guessed the right answer.
			// 7. if the guess is high
				// 8. Tell them it's too high
		else if(guessInt > lotNumber) {
			JOptionPane.showInputDialog("Thats too high! Go lower :D!");
		}
			// 9. if the guess is low
				// 10. Tell them it's too low
		else {
			JOptionPane.showInputDialog("Oof! Thats too low! go higher please!");
		}
		}
		// 13. Tell them they lose
		JOptionPane.showMessageDialog(null, "You lost D:!! Well you didnt get the money. How sad..");
	}

}


