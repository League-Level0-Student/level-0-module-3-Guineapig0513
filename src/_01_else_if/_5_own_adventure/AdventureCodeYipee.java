package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class AdventureCodeYipee {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Whats your name? :D (character, doesnt need to be ur name!)");
	//	JOptionPane.showMessageDialog(null, "Hello "+name+ " a fellow travelor. My name is Sammy. Would you like to travel with me?");
	//	JOptionPane.showInputDialog("Yes or no?");
		int yesOrNo = JOptionPane.showConfirmDialog(null, "Hello "+name+ " a fellow travelor. My name is Sammy. Would you like to travel with me?", "", JOptionPane.YES_NO_OPTION);
		if(yesOrNo == 1) {
			JOptionPane.showMessageDialog(null, "Sorry for bothering you "+name+ ". Have safe travels fellow travelor! :)");
			System.exit(0);
		}
		else  {
			JOptionPane.showMessageDialog(null, "Ok lets go travel together "+name+"!");
		}
		int uh = JOptionPane.showOptionDialog(null, "message", "title", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, 
			 new String[] {"Option1", "Option2"}, null);
		
		//JOptionPane.showOptionDialog(null, name, name, 0, 0, null, args, name)
	}
}


