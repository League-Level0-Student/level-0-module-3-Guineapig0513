package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class HappyTest {

	public static void main(String[] args) {

		String happyString = JOptionPane.showInputDialog("Are you happy? Yes or no?");
		String testwo = null;
		if(happyString.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing what your doing :D!");
		}
		if(happyString.equalsIgnoreCase("no")) {
		testwo = JOptionPane.showInputDialog( "Do you want to be happy?");
		}

		if(testwo.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Change something.");
		}
		if(testwo.equalsIgnoreCase("no")) {
			JOptionPane.showMessageDialog(null, "Ok your firm so keep doing what your doing i guess?");
		}
		
	}

}
