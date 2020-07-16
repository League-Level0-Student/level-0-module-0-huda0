package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 100;
		// ASK A QUESTION AND CHECK THE ANSWER
		String recorder = JOptionPane.showInputDialog("What is 1+1?");
		
				// 2.  Ask the user a question 
				
				// 3.  Use an if statement to check if their answer is correct
			
		       if (recorder.equals("2")) {  
		    	   JOptionPane.showMessageDialog(null,"correct");
		    	   score++;
		    	   
		    	   } 
		       recorder = JOptionPane.showInputDialog("What sound does a cow make?");
		       
		       if (recorder.equals("moo")) {
		    	   JOptionPane.showMessageDialog(null, "great job");
		    	   score++;
		       }
		       
		       recorder = JOptionPane.showInputDialog("How many colors are in the rainbow?");
		    		   
		    	if (recorder.equals("7"))	{
		    		JOptionPane.showMessageDialog(null,"keep it up");
		    		score++;
		    	}
		       
		       recorder = JOptionPane.showInputDialog("What is the name of Harry Potter's Owl?");
		       
		       if (recorder.equals("Hedwig")) {
		    	   JOptionPane.showMessageDialog(null, "you did it:)");
		    	   score++;
		       }
		    		   
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		/*
		 * What is 1+1?
		 * What sound does a cow make?
		 * How many colors are in the rainbow?
		 * What is the name of Harry Potter's owl?
		 */
		
		// After all the questions have been asked, tell the user their final score 
		JOptionPane.showMessageDialog(null, "your final score is " + score);
	}
}
