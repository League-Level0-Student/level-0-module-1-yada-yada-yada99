package _07_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String answer = JOptionPane.showInputDialog("What gets wetter and wetter the more it dries?");
		
if (answer.equalsIgnoreCase("A Towel")){
	score ++;
	JOptionPane.showMessageDialog(null, "Correct! +1 point");
}
		
else {
	JOptionPane.showMessageDialog(null, "Nope! +0");
}
String answer2 = JOptionPane.showInputDialog("What has legs, but doesn�t walk?");

if (answer2.equalsIgnoreCase("A Table")){
	score ++;
	JOptionPane.showMessageDialog(null, "Correct! +1 point");
}
		
else {
	JOptionPane.showMessageDialog(null, "Nope! +0");
		
		
	}
JOptionPane.showMessageDialog(null, "Your Score = " +score);
}
}







