
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		Robot tibbles = new Robot();
		//1. Create a new Robot
		while(true) {
		
String color = JOptionPane.showInputDialog("What color would you like for my robot tibbles to draw with???");
		
		if(color.equalsIgnoreCase("red")){
			tibbles.setPenColor(Color.red);
		}
		else if(color.equalsIgnoreCase("yellow")){
			tibbles.setPenColor(Color.yellow);
		}
		else if(color.equalsIgnoreCase("blue")){
			tibbles.setPenColor(Color.blue);
		}
		else if(color.equals("hide")) {
			tibbles.hide();
		}
		else{
			tibbles.setPenColor(Color.black);
			JOptionPane.showMessageDialog(null, "Sorry, Tibbles is not very smart he went to the first half of preschool. Nothing else, he knows his primary colors though.");
		}
		tibbles.penDown();
	    //2. Make the robot draw a shape (this will take more than one line of code)		
		tibbles.setSpeed(100);
		tibbles.setPenWidth(10);
		int count = 0;
		while ( count < 10 ) {
			  tibbles.move(200);
			  tibbles.turn(190);
			 count += 1;
			  }
		}
		//3. Set the pen width to 10
		
		//4. Ask the user what color pen they would like the robot to draw with
		
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
