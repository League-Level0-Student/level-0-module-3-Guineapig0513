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
		int honk = 0;
		System.out.println(sammy);
		if(sammy == 0) {
			JOptionPane.showMessageDialog(null, "Oh Okay! I heard theres a giant octupus guarding the geode! I heard its 45 feet long! OOoooh, also!");
			JOptionPane.showMessageDialog(null, "Take this plant. Its called the blooming catmint and, you can breathe underwater with it when you eat it! It also helps energy levels rise so, you can swin for longer times without aching joints. So eat it NOW!");
			JOptionPane.showMessageDialog(null, "Oh wow look at all the crystal colors, Oh be careful of the jellyfish! Woww! Look at all the blooming catmint, blooming catmint is really rare!");
			JOptionPane.showMessageDialog(null, "Hey oh come! My gosh, there is the giant octupus, I think it thinks the geode is its treasure and- WOOAHhh AuuGH! The giant octupus stung me and- *gets flunged onto a rock* "+name+" rUNnN! *dies*");
			JOptionPane.showMessageDialog(null, "rest in peace " +name+ " I did this due to how much time I spent on this and I want to finish.");
			System.exit(0);
		}
		else {
			JOptionPane.showMessageDialog(null, "Okay lets go "+name+ " to honeydew valley!");
			JOptionPane.showMessageDialog(null, name+ " look at all the honey and tulips and different species of orchid! Its amazing just wow!");
			honk = JOptionPane.showOptionDialog(null, name+" do you want to eat or do you want to continue?", "sammy is actually a cat :>", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, 
					 new String[] {"Lets continue traveling :D!", "Lets eat :3!"}, null);
		}
		System.out.println(honk);
		if(honk == 0) {
		JOptionPane.showMessageDialog(null, "Okay we will eat at Nibans house," +name+" Niban is my friend, he lives here :)!");
		JOptionPane.showMessageDialog(null, "Look "+name+"!! The cherry trees and the sunflowers! We are almost at Nibans house! He sent me a map it says that we are in the suncherry part of honeydew valley :>.");
		JOptionPane.showMessageDialog(null, "We are here "+name+"! Nibans house, now lets eat with niban outside near the overgrown willow and oak trees!");
		JOptionPane.showMessageDialog(null, "Well "+name+ " its time you go home, im staying with niban today so goodbye farewell!");
		JOptionPane.showMessageDialog(null, "the end :) Mr nick can i have a break by the way :)?");
		}
		else {
			JOptionPane.showMessageDialog(null, "Okay "+name+" :D! I brought sandwiches and orchid apple cider :D!");
			JOptionPane.showMessageDialog(null, "Wow that was delicous! Thanks for sharing your chocolate muffins! " +name+ " we are going to my friend Nibans house so lets go :)!");
			JOptionPane.showMessageDialog(null, "Look "+name+"!! The cherry trees and the sunflowers! We are almost at Nibans house! He sent me a map it says that we are in the suncherry part of honeydew valley :>.");
			JOptionPane.showMessageDialog(null, "Wow look we are here nibans cottage! Niban this is "+name+ ". They came to visit! So...");
			JOptionPane.showMessageDialog(null, "(LATER) Well "+name+ " farewell, take this batch of poppy seeds, juniper berries and blooming catmint. Its healing herbs just in case so farewelll as I guess you need to go home goodbye.");
			JOptionPane.showMessageDialog(null, "the end :) Mr nick can i have a break by the way :)?");
		}
		
			
	}

}