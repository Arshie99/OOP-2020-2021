package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet {

    public void settings() {
        size(500, 500);
        cx = width / 2;
        cy = height / 2;
    }

    int mode = 0;

    float cx;
    float cy;

    public void keyPressed() {
        // the value of mode will be the number of the
        // number key pressed
        if (keyCode >= '0' && keyCode <= '9')
            mode = keyCode - '0';
    }

    public void setup() {
        colorMode(HSB);
    }

    public void draw() {
		background(255);
        switch (mode)
        {
            case 0:
			{
                // ellipse(cx, cy, 100, 100);
				fill(50,255,225);
				if(mouseX < cx)
				{
					rect(0,0,cx,height);
				}
				else
				{
					rect(cx,0,cx,height);
				}
                break;
			}
			case 1:
			{
				fill(50,255,225);
				if(mouseX < cx && mouseY < cy )
				{
					rect(0,0,cx,cy);
				}
				else if(mouseX > cx && mouseY < cy )
				{
					rect(cx,0,cx,cy);
				}
				else if(mouseX < cx && mouseY > cy)
				{
					rect(0,cy,cx,cy);
				}
				else if(mouseX > cx && mouseY > cy)
				{
					rect(cx,cy,cx,cy);
				}
				break;
			}
			case 2:
			{
				fill(50,255,255);
				rect(cx/2,cy/2+50,cx,cy/2);
				if(mouseX >= cx || mouseY >= cy)
				{
					fill(10,255,255);
				}
				break;
			}
			case 3:
			{
			 int numRects = 10;
			 float w = width / (float) numRects;
			 float cgap = 255 / (float) numRects;

			 	for (int i = 0; i<numRects ;i++ ) {
			 		fill(i * cgap, 255,255);
					rect(i  * w, 0, w, height);
			 	}

			 break;
		 	}
			case 4:
			{
				int numCirc = 10;
				float w = width / (float) numCirc;
				float cgap = 255 / (float) numCirc;

				for (int i = 0; i<numCirc ;i++ ) {
				   fill(i * cgap, 255,255);
				   ellipse(i  * w+25, 50, 50, 50);
				}
				break;
			}
			case 5:
			{
				int numCircle = 20;
				float gap = width / (float) numCircle;
				float cgap = 255 / (numCircle+numCircle);
				float w = width;
				for (int i = 0; i<numCircle;i++ ) {
					for (int j = 0; j<numCircle ;j++ ) {
						fill(cgap*(i+j), 255,255);
						ellipse((gap/2)+w*j, (gap/2)+w*i, 50, 50);
					}
				}
				break;
			}
			case 6:
			{
				int numSquare = 10;
				float w = width / (float) numSquare;
				float cgap = 255 / (float) numSquare;

				for (int i = 0; i<numSquare ;i++ ) {
				   fill(i * cgap, 255,255);
				   rect(i  * w, i*w, 50, 50);
				}
				break;
			}
				case 7:
				{
					int numSquare = 10;
					float w = width / (float) numSquare;
					float cgap = 255 / (float) numSquare;

					for (int i = 0; i<numSquare ;i++ ) {
					   fill(i * cgap, 255,255);
					   rect(i  * w, i*w, 50, 50);
					   rect(width -((i+1)  * w), i*w, 50, 50);
					}
					break;
				}
				case 8:
				{
					int sides = mouseX/50;
					float theta = TWO_PI / (float) sides;
					float radius = 200;
					for (int i = 1; i <= sides ;i++ ) {
						float x1 = sin(theta *(i-1)) * radius;
						float y1 = cos(theta *(i-1)) * radius;
						float x2 = sin(theta *i) * radius;
						float y2 = cos(theta *i) * radius;
						line(cx+x1,cy+y1,cx+x2,cy+y2);
					}
					break;
				}
				case 9:
				{
					int sides = mouseX/50;
					float theta = TWO_PI / (float) sides;
					float radius = 200;
					for (int i = 1; i <= sides ;i++ ) {
						float x1 = sin(theta *i) * radius;
						float y1 = cos(theta *i) * radius;
						float x2 = sin(theta *i) / radius;
						float y2 = cos(theta *i) / radius;
						line(cx+x2,cy+y2,cx+x1,cy+y1);
					}
					break;
				}

        }
    }
}
