package _08_code_4_life;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import java.applet.AudioClip;
import java.io.File;
import java.util.function.IntPredicate;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class Code4Life {
	public static void main(String[] args) {

		// 2. If it is less than or equal to 2, tell them to stop watching YouTube and
		String josh = JOptionPane.showInputDialog("HOW MANY TIMES HAVE YOU CODED THIS WEEK!!!!!!!????????");
		// write code instead.
		int joieff = Integer.parseInt(josh);
		if (joieff <= 2) {
			JOptionPane.showMessageDialog(null,
					"YOU BETTER GET OF YOUTUBE AND EAT CHICKEN AND THEN GO BACK ON YOUTUBE, FIND THE MEANING OF LIFE AND THEN WATCH CUTE PUPPY VIDEOS FOR EVERY SUNDAY AND THEN CODE EVERY TIME YOU CAN!!!!!!!!!!!!!");
		}
		// 3. If it is greater than or equal to 3 AND less than or equal to 5, tell them
		// they're a Code Ninja
		if (joieff >= 3 && joieff <= 5) {
			JOptionPane.showMessageDialog(null,
					"YOU ARE AMAZINGLY BORING. BECUASE YOU ARE ALWAYS CODING. GET OFF YOUR COMPUTER RIGHT NOW OR BOB THEMONOCLE WILL COME FOR YOU... I AM SUPPOSED TO SAY YOU ARE A NIJA BUT YOU ARE NOT, YOU ARE A ABSOLUTE BIG FAT CODE NARWHALE.");
		}
		if (joieff > 5) {
			JOptionPane.showMessageDialog(null,
					"YOU MUST THROW YOUR COMPUTER IN THE NEAREST LAKE. YOU ARE CODING ALMOST THE WHOLE YEAR!!!!!! YOU CAN NEVER BE ALLOWED TO CODE AGAIN. EVEN SO THAT IS PRETTY IMPRESSIVE SO....... ");
			playBatmanTheme();
		}

// 4. If it is more than 5, call the method below to play the Batman theme song.
	}

	private static void playBatmanTheme() {
		try {
			AudioClip sound = JApplet.newAudioClip(Code4Life.class.getResource("batman.wav"));
			sound.play();
			Thread.sleep(60002);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}