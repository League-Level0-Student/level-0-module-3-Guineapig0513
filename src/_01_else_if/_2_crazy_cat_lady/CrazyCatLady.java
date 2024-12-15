
package _01_else_if._2_crazy_cat_lady;

import java.net.URI;

import javax.swing.JOptionPane;


public class CrazyCatLady {
	public static void main(String[] args) {
		
		
		// 1. Ask the user how many cats they have
		String catString = JOptionPane.showInputDialog("How many cats do you own???");
		// 2. Convert their answer into an int
		int catInt = Integer.parseInt(catString);
		// 3. If they have 3 or more cats, tell them they are a crazy cat lady
		if( catInt >= 3){
			JOptionPane.showMessageDialog(null, "Your a crazy cat lady!!! I do not care about your gender >:)!!");
		}
		else if(catInt == 2) {
			JOptionPane.showMessageDialog(null, "Hello mr nick I know this cuz, I KNOW NO ONE ELSE WITH 2 CATS IN CODING... theres like 5 of us here. Anyways watch this cool video!! ");
			playVideo("https://www.youtube.com/watch?v=F1GKM0zuf7U");
		}
		
		else if(catInt == 1) {
			JOptionPane.showMessageDialog(null, "YOU HAVE CATS YIPEE!!");
			playVideo("https://www.youtube.com/watch?v=0rlS80hRIVQ");
			
		}
		else {
			JOptionPane.showMessageDialog(null, "UHHHHHH WATCH THIS!!");
			playVideo("https://www.youtube.com/watch?v=Xpf5P7X0sNo&list=PLgGCo0zARPpX_H9elW8OHtJKmvrfdYCt_&index=10");
			
		}
		}
		// 4. If they have less than 3 cats AND more than 0 cats, call the method below to show them a cat video
		//    Hint: You can use the && operator 
		// 5. If they have 0 cats, show them a video of A Frog Sitting on a Bench Like a Human
		
		
		
		
		
		
	

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

