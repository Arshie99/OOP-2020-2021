package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing2 extends PApplet
{

	public void settings()
	{
		//window size
		size(500, 500);
	}

	//colors and main layout
	//called once
	public void setup() {

	}

	//main drawing
	//called once every 60 seconds or frame rate
	public void draw()
	{
		int x = 0;
		background(255,0,0);//black//rgb values
		stroke(0);//pen color
		//nostroke;
		fill(255,255,0);
		ellipse(250,300,400,400);//cx,cy,width,height
		fill(0,255,255);
		triangle(250,40,50,450,450,450);//x1,y1,x2,y2,x3,y3
		fill(204,204,204);
		ellipse(250,250,200,100);//cx,cy,width,height
		fill(0);
		ellipse(250,250,70,70);//cx,cy,width,height
		// ellipse(x,250,70,70);//cx,cy,width,height
		// x++;
		// ellipse(250,250,mouseX,mouseY);//cx,cy,width,height
		// line(10, 10, 100, 100);//x1,y1,x2,y2
		// rect(20,100,70,90);//tlx,tly,width,height
		// point(200,60);
		// //text
		// fill(0);
		// text("Hello World!!!!", 300,300);//text,x,y
	}
}
