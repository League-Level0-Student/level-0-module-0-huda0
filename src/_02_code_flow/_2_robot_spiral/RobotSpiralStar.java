package _02_code_flow._2_robot_spiral;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2020
 *    Level 0
 */


import org.jointheleague.graphical.robot.Robot;

public class RobotSpiralStar {

	public static void main(String[] args) {
		Robot rob = new Robot(); 
		rob.setSpeed(50);
		// Create a new Robot
		
		// Set your robot's pen down 
		rob.penDown();
		rob.move(10);
		
		rob.turn(50);
		for(int i = 0; i < 50; i++)
		
		{
			
		rob.move(5*i);
		rob.turn(90);
		rob.turn(360/7);
		rob.setRandomPenColor();
		
		}
		
		
		
		// SPEED. Set the robot to go at max speed (100)
		
        // LOOP. Use a for loop to repeat ALL the following lines of code 50 times. 
		
				// Change the robot pen color to random
			
				// DRAW.    Move the robot (5*i) pixels
				//          "i" is the variable in the for loop	
			
				// TURN.    Turn the robot (360/7) degrees to the right
			
				// Change the robot pen width to (i)

		
		// Check the pattern against the picture in the recipe. If it matches, you are done!
		
	}
}
