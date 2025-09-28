package module4._02graphics;

import edu.princeton.cs.introcs.StdDraw;

public class E04WaitPoint {

	/*
	 * Exercise: Use the StdDraw API to complete the code one
	 * step at a time.
	 */
	public static void main(String[] args) {

		// wait for the mouse to be pressed and released
		while (!StdDraw.isMousePressed()){
			StdDraw.pause(50);
		}

		// here, the mouse has been pressed
		double x = StdDraw.mouseX();
		double y = StdDraw.mouseY();
		System.out.println("(" + x + "," + y + ")");

		// here the mouse is released
		while (StdDraw.isMousePressed()){
			StdDraw.pause(50);
		}

		// draw a point at the location of the mouse
		StdDraw.setPenRadius(0.01);
		StdDraw.point(x, y);

		// here, a q has been typed
		while (true){
			if (StdDraw.hasNextKeyTyped()){
				if (StdDraw.nextKeyTyped() == 'q'){
					break;
				}
			}
			StdDraw.pause(50);
		}

		StdDraw.text(0.5, 0.5, "Farewell!");




		/*
		// wait for the mouse to be pressed and released
		boolean isPressed = false;
		while (isPressed != true){
			isPressed = StdDraw.isMousePressed();
		}

		// here, the mouse has been pressed
		while (isPressed == true){
			System.out.println("isMousePressed = " + isPressed);
			isPressed = StdDraw.isMousePressed();
			StdDraw.pause(500);
		}

		// here the mouse is released
		System.out.println("isMousePressed = " + isPressed);
		
		// draw a point at the location of the mouse
		StdDraw.setPenRadius(0.01);
		StdDraw.point(StdDraw.mouseX(), StdDraw.mouseY());
		
		// here, a q has been typed
		char key = 'i';
		while(key != 'q'){
			while(!StdDraw.hasNextKeyTyped()) {
				StdDraw.pause(100);
			}
			key = StdDraw.nextKeyTyped();
		}
		
		StdDraw.text(0.5, 0.5, "Farewell!");
		*/

	}

}
