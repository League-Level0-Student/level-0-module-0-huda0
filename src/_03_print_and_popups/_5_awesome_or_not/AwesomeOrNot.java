package _03_print_and_popups._5_awesome_or_not;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes everything below
public static void main(String[] args) {
	

	
		Random ran = new Random();    //This will be used below to make a random number. 
		int bob = ran.nextInt(4);
	System.out.println(bob);

		// 2. Make a variable that will hold a random whole number
	
		// 3. Set your variable equal to a positive number less than 4 using     ran.nextInt(4); 
	
		// 3. Print your variable to the console
	
		// 4. Get the user to enter something that they think is awesome
	String hi = 
	JOptionPane.showInputDialog("What do you think is awesome?");
		// 5. If your variable is  0
	if(bob==0) {
		JOptionPane.showMessageDialog(null, "You're AWESOME!!!");
	}
			// -- tell the user whatever they entered is awesome!
	
		// 6. If your variable is  1
	if(bob==1) {
		JOptionPane.showMessageDialog(null, hi+" is ok");
	}
			// -- tell the user whatever they entered is ok.
	
		// 7. If your variable is  2
	if(bob==2) {
		JOptionPane.showMessageDialog(null, hi+ " is boring");
	}
			// -- tell the user whatever they entered is boring.
	
		// 8. If your variable is  3
	if(bob==3); {
		JOptionPane.showMessageDialog(null, " You have a nice name :)");
	}
			// -- invent your own message to give to the user (be nice).
}
}
