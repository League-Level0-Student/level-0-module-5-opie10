package _99_extra;

import java.awt.Color;
import java.awt.Polygon;
import java.lang.reflect.Method;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {

	public static void main(String[] args) {

		// 1. Create a new Robot
		Robot thyre = new Robot();
		// 2. Set the speed to 100
		thyre .setY(550);
		thyre.setSpeed(100);
		thyre.miniaturize();
		
		int colorChoice = JOptionPane.showOptionDialog(null, "EAT YOUR CHOICE OF FOOD", "ORaNGE", JOptionPane.INFORMATION_MESSAGE,
				JOptionPane.DEFAULT_OPTION, null, new String[] { "CHICKEN", "TACO", "RAW FISH" }, 0);

		// 3. Use if statements to check the the value of colorChoice and set the pen
		// color accordingly

		if (colorChoice == 0) {
			thyre.setPenColor(Color.magenta);
		}
		if (colorChoice == 1) {
			thyre.setPenColor(Color.cyan);
		}
		if (colorChoice == 2) {
			thyre.setPenColor(Color.green);
		}
		// 4. Ask the use how many polygons they want to be drawn.
String CAT= JOptionPane.showInputDialog("HOW MANY POLYGONS DO YOU WANT DRAWN?");
		int J =Integer.parseInt(CAT);
// 5. Use the robot to draw the number of polygons the user requested.
for (int i = 0; i < J+1; i++) {
polygon(thyre);
}
		// 6. Make it so your shapes do not overlap

		// 7. Challenge: add more colors to the Option Dialog.

	}

	static void polygon(Robot thyre) {
		
		thyre.penDown();
		thyre.move(20);
		thyre.turn(72);
		thyre.move(20);
		thyre.turn(72);
		thyre.move(20);
		thyre.turn(72);
		thyre.move(20);
		thyre.turn(72);
		thyre.move(20);
		thyre.turn(72);
		thyre.penUp();
		thyre.move(35);
	}
}
