package _02_unbirthday;

import javax.swing.JOptionPane;

public class unbirthday {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog("What is your birthday?");
	if (answer.equalsIgnoreCase("March 7")) {
		JOptionPane.showMessageDialog(null, "Happy Birthday");
	}
	if (answer.equalsIgnoreCase("August 29")) {
JOptionPane.showMessageDialog(null, "You are a legend and a god");
	}
	else {
		JOptionPane.showMessageDialog(null, "You don't have a good enough birthday");
	}
	
}
}

