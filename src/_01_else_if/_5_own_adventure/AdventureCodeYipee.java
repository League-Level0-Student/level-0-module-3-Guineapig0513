package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class AdventureCodeYipee {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Whats your name? :D (character, doesnt need to be ur name!)");
	//	JOptionPane.showMessageDialog(null, "Hello "+name+ " a fellow travelor. My name is Sammy. Would you like to travel with me?");
	//	JOptionPane.showInputDialog("Yes or no?");
		int yesOrNo = JOptionPane.showConfirmDialog(null, "Hello "+name+ " a fellow travelor. My name is Sammy. Im a florist and a travelor searching for plants!. Would you like to travel with me?", "uhhh hi I guess???", JOptionPane.YES_NO_OPTION);
		if(yesOrNo == 1) {
			JOptionPane.showMessageDialog(null, "Sorry for bothering you "+name+ ". Have safe travels fellow travelor! :)");
			JOptionPane.showMessageDialog(null, "LATER, you got malled by 20 street dogs. You died rest in peace :c");
			System.exit(0);
		}
		else  {
			JOptionPane.showMessageDialog(null, "Ok lets go travel together "+name+"!");
		}
		int uh = JOptionPane.showOptionDialog(null, "Do you want to travel to the looming forest or the poison plains or somewhere else " +name+ "?", "does anyone read this?", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, 
			 new String[] {"Lets go somewhere else", "The Poison Plains", "The Looming Forest"}, null);
	int sammy = 0;
		System.out.println(uh);
		if(uh == 0) {
			sammy = JOptionPane.showOptionDialog(null, "Okay so we are at the border between the land and water. Do you want to go to the honeydew valley or the underwater crystal geode " +name+ "?", "Hello!!! are you mr nick or did you break into my account to play this game. Either way hiiii", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, 
		 new String[] {"The Crystal Geode", "Honeydew Valley"}, null);
		}
		else {
			JOptionPane.showMessageDialog(null, "Ok lets go :D!");
			JOptionPane.showMessageDialog(null, "Hey " +name+ "! Look at this sharp and pretty flower! Its a relative to the foxglove I think.");
			JOptionPane.showMessageDialog(null, "Im going to touch it, OWW. Wait.. This flower is called the wither rose and it is the most poisonous flower on the earth and very rare!");
			JOptionPane.showMessageDialog(null, "It can- HEY "+name+ " WHY DID YOU TOUCH IT? It can crawl up to your heart at fast as 10- *dies*");
			JOptionPane.showMessageDialog(null, "You died too by the way, it's so I didnt have to code more so rest in peace.");
			System.exit(0);
		}
	}

}