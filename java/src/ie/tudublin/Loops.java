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
        background(0);
        switch (mode)
        {
            case 0:
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
			case 1:
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
			case 2:
				fill(50,255,255);
				rect(cx/2,cy/2+50,cx,cy/2);
				if(mouseX == cx || mouseY == cy)
				{
					fill(10,255,255);
				}
				break;
			case 3:
			 int numRects = 10;
			 float w = width / (float) numRects;
			 float cgap = 255 / (float) numRects;

			 for (int i = 0; i<numRects ;i++ ) {
			 	fill(i * cgap, 255,255);
				rect(i  * w, 0, w, height);
			 }
			 break;

			case 4:
				int numCirc = 10;
				float w1 = width / (float) numCirc;
				float cgap1 = 255 / (float) numCirc;

				for (int i = 0; i<numCirc ;i++ ) {
				   fill(i * cgap1, 255,255);
				   ellipse(i  * w1+25, 50, 50, 50);
				}
				break;
			case 5:
			int numCirc1 = 10;
			float w2 = width / (float) numCirc1;
			float cgap2 = 255 / (float) numCirc1;

			for (int i = 0; i<numCirc1 ;i++ ) {
			   fill(i * cgap2, 255,255);
			   ellipse(i  * w2+25, 50, 50, 50);
			   for (int j = 0; j<height ;j++ ){
				   fill(i * cgap2, 255,255);
					ellipse(i  * w2+25, 50*j, 50, 50);
			   }
			}
			break;



        }
    }
}
