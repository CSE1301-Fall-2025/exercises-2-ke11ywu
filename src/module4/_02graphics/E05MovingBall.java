package module4._02graphics;

import java.awt.Color;

import java.awt.event.KeyEvent; // import key press events

import edu.princeton.cs.introcs.StdDraw; // API = Application Programming Interface

public class E05MovingBall {

	/*
	 * Exercise: Read and run the code below and make sure you
	 * understand how it works before proceeding.
	 */
	public static void main(String[] args) {
		// starting values
		double ballX = Math.random();
		double ballXVelocity = Math.random() * 0.05 + 0.005;
		double ballY = Math.random();
		double ballYVelocity = Math.random() * 0.05 + 0.005;

		double playerX = 0.5;
		double playerY = 0.5;
		double playerSpeed = 0.025;

		double distanceBetweenPoints = 0.0;
		
		StdDraw.setPenRadius(0.05);
		
		while (true) {
			
			//Clear the canvas
			StdDraw.clear();
			
			//update the ball position
			// ballX = ballX + 0.005; ==> 0.005 is a magic number so you have to think abt the value it represents. this is bad, use a variable instead
			ballX = ballX + ballXVelocity;
			ballY = ballY + ballYVelocity;

			if(ballX > 1 - 0.015 || ballX < 0 + 0.015) { //too far right or left
				ballXVelocity = -ballXVelocity; //bounce
			}
			if(ballY > 1 - 0.015 || ballY < 0 + 0.015) {
				ballYVelocity = -ballYVelocity;
			}

			if (StdDraw.isKeyPressed(KeyEvent.VK_W)){ // up
				playerY += playerSpeed;
			}
			if (StdDraw.isKeyPressed(KeyEvent.VK_S)){ // down
				playerY -= playerSpeed;
			}
			if (StdDraw.isKeyPressed(KeyEvent.VK_A)){ // left
				playerX -= playerSpeed;
			}
			if (StdDraw.isKeyPressed(KeyEvent.VK_D)){ // right
				playerX += playerSpeed;
			}

			distanceBetweenPoints = Math.sqrt(Math.pow(playerX - ballX, 2) + Math.pow(playerY - ballY, 2));
			if (distanceBetweenPoints < StdDraw.getPenRadius() * 2){
				StdDraw.text(0.5, 0.5, "collided");
			}
			
			//draw on canvas
			StdDraw.setPenColor(Color.RED);
			StdDraw.point(ballX, ballY);
			StdDraw.setPenColor(Color.BLACK);
			StdDraw.point(playerX, playerY);
			
			//pause to make the animation smooth
			StdDraw.show();
			StdDraw.pause(10);
			
		}
	}
}
