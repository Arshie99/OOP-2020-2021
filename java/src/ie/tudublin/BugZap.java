package ie.tudublin;

import processing.core.PApplet;

public class BugZap extends PApplet
{

	public void settings()
	{
		// If you want to use the width and
		// height variables, they have to be after settings
		// is called
		size(500, 500);
	}


	public void setup() {

	}

	void reset()
	{
		resetBug();
		score = 0;
		gameCount = 0;
		playerX = width / 2;
		playerY = height - 50;
	}

	void resetBug(){
		bugX = random()
	}

	// These are fields in the class now and can be used in
	// any of the methods in the  class
	float playerX = 10;
	float playerY = 5;
	float playerWidth = 80;

	void drawPlayer(float x, float y, float w){
		stroke(225);
		//height of player
		float playerHeight = playerWidth / 2;
		line(playerX, playerY + playerHeight, playerX + playerWidth, playerY + playerHeight);
		line(playerX, playerY + playerHeight, playerX+10, playerY + playerHeight/9);
		line(playerX+40, playerY + playerHeight/9, playerX+80, playerY + playerHeight);
		line(playerX+10, playerY + playerHeight/10, playerX+40, playerY + playerHeight/10);
	}

	void drawBug(float x, float y)
	{
	    // Draw the bug
	  stroke(255);
	  float saucerHeight = bugWidth * 0.7f;
	  line(bugX + halfBugWidth, bugY, bugX, bugY + saucerHeight);
	  line(bugX + halfBugWidth, bugY, bugX + bugWidth, bugY + saucerHeight);
	  line(bugX, bugY + saucerHeight, bugX + bugWidth, bugY + saucerHeight);
	  float feet = bugWidth * 0.2f;
	  line(bugX + feet, bugY + saucerHeight, bugX, bugY + bugWidth);
	  line(bugX + bugWidth - feet, bugY + saucerHeight, bugX + bugWidth, bugY + bugWidth);
	  feet = bugWidth * 0.4f;
	  line(bugX + feet, bugY + saucerHeight, bugX, bugY + bugWidth);
	  line(bugX + bugWidth - feet, bugY + saucerHeight, bugX + bugWidth, bugY + bugWidth);
	  line(bugX + feet, bugY + feet, bugX + feet, bugY + feet * 1.1f);
	  line(bugX + bugWidth - feet, bugY + feet, bugX + bugWidth - feet, bugY + feet * 1.1f);
	  line(bugX + feet, bugY + feet * 1.4f, bugX + bugWidth - feet, bugY + feet * 1.4f);
	}
	public void draw()
	{
		background(0);

		//draw player
		drawPlayer(playerX, playerY,playerWidth);
	}

	public void keyPressed()
	{

			if (keyCode == LEFT)
			{
				if(playerX > halfPlayerwidth){
					playerX -= playerSpeed;
				}

			}
			if (keyCode == RIGHT)
			{
				if(playerX < width-halfPlayerwidth){
					playerX += playerSpeed;
				}
			}
			if (key == ' ')
			{
				if(playerX  > bugX - halfPlayerwidth && playerX < bugX+halfPlayerwidth)
				{
					line(playerX,playerY,playerX,bugY);
					score ++;
					resetBug();
				}
				else{
					line(playerX,playerY,playerX,0);
				}

			}
	}

	void moveBug(){
		bugX += random(-5,5);
		if ((frameCount % 30) == 0)
		{
			if (bugX < halfBugwith)
			{
				bugX = halfBugwith;
			}
			if (bugX > width - halfBugWidth){
				bugX = width - halfBugwith;
			}

			bugY += 2;
		}


	}
}
