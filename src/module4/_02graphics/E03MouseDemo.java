package module4._02graphics;

import edu.princeton.cs.introcs.StdDraw;

public class E03MouseDemo {

	/*
	 * Exercise: Read and run the code below and make sure you
	 * understand how it works before proceeding.
	 */
	public static void main(String[] args) {
		
		while(true) { //loop forever
			
			//get x and y position of mouse
			double x = StdDraw.mouseX();
			double y = StdDraw.mouseY();

			//Did user press the mouse button?
			// boolean isPressed = StdDraw.mousePressed(); = old line; .mousePressed is deprecated
			boolean isPressed = StdDraw.isMousePressed();
			
			//Display information
			System.out.println("X = " + x + ", and Y = " + y);
			System.out.println("Mouse pressed ? " + isPressed);
			
			//Repeat once per second
			StdDraw.pause(1000);
		}
	}
}
