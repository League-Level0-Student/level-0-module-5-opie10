package _05_circle_ring_D;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

public class CircleRing {
	public static void main(String[] args) throws Exception {

		Robot[] robots = new Robot[30];
		// 1. Make a new Robot
		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot();
			robots[i].setX(150 + i * 10);
			robots[i].setY(200);
			robots[i].setSpeed(i % 11);
			robots[i].miniaturize();
			robots[i].setRandomPenColor();
			robots[i].penDown();
			for (int j = 0; j < 360; j++) {
				robots[i].move(3);
				robots[i].turn(1);
				if (j % 20 == 0) {
					for (int k = 0; k < 360; k++) {
						robots[i].move(1);
						robots[i].turn(1);
					}
				}
			}
		}
		Robot garhy = new Robot();

		// 2. Set your robot’s position to x=150 and y=200
		garhy.setX(150);
		garhy.setY(200);

		// 3. Put the robot's pen down
		garhy.miniaturize();

		garhy.setRandomPenColor();
		garhy.penDown();
		// 4. Set the robot’s speed to 10
		garhy.setSpeed(1000000000);
		// 5. Do everything below here 360 times (use i as the counter)
		
		for (int i = 0; i < 360; i++) {
			garhy.move(3);
			garhy.turn(1);
			if (i % 20 == 0) {
				for (int j = 0; j < 360; j++) {
					garhy.move(1);
					garhy.turn(1);
				}
			}
		}
		// 6. Move the robot 3 pixels

		// 7. Turn the robot 1 degree

		// 8. If the counter i is divisible by 20 (hint: use mod operator %)..

		// 9. do steps 10 and 11 exactly 360 times (use j as the counter)

		// 10. Move the robot 1 pixel

		// 11. Turn the robot 1 degree
	}
}
