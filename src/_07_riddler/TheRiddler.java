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
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (answer.equalsIgnoreCase("A Towel")){
	score = 1;
	JOptionPane.showMessageDialog(null, "Correct! +1 point");
}
		// 5. Otherwise, say "wrong" and tell them the answer
else {
	JOptionPane.showMessageDialog(null, "Nope! +0");
}
		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}

