package module4._02graphics;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class E01GraphicsDemo {

	/*
	 * Exercise: use the StdDraw API to draw the requested
	 * items below.
	 */
	public static void main(String[] args) {
		//Using a built-in color
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.filledSquare(0.5, 0.5, .2);
		
		//Using a custom color
		Color purply = new Color(255, 0, 150);
		StdDraw.setPenColor(purply);
		StdDraw.filledCircle(.75, .75, .1);
		
		//Use the StdDraw API to do the following:
		
		//Draw a blue point anywhere you like
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.setPenRadius(0.01);
		StdDraw.point(0.1, 0.4);
		
		//Draw a larger green point someplace else
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.setPenRadius(0.02);
		StdDraw.point(0.8, 0.9);

		//Draw an unfilled red triangle somewhere
		StdDraw.setPenColor(Color.RED);
		StdDraw.setPenRadius(0.005);
		double[] x = { 0.1, 0.8, 0.3 };
   		double[] y = { 0.2, 0.3, 0.9 };
		StdDraw.polygon(x, y);

		//Draw a filled yellow circle somewhere
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledCircle(0.7, 0.3, 0.2);

		//Draw a filled blue rectangle somewhere
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledRectangle(0.5, 0.6, 0.3, 0.1);

	}
}
