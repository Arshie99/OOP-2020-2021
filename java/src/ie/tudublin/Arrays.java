package ie.tudublin;

import processing.core.PApplet;

public class Arrays extends PApplet {



  public float map1(float from, float start1, float stop1, float start2, float stop2)
  {
    float range1 = stop1 - start1; //range 1
    float range2 = stop2 - start2; //range 2
    float howFar = from - start1; //the distance between value and first point
    // float output = start2 + (stop2 - start2) * ((from - start1) / (stop1 - start1));
    float output = start2 + (range2) * (howFar/range1);
    return output;
  }

  public void drawGrid(){
    stroke(0, 255, 0);
    float border = width * .05f;
    for(int i = -5; i <= 5; i++){
      float x = map1(i, -5,5, border, width - border);
      line(x,border , x, height-border);
      line(border, x, width - border, x);
      text(i, x ,border*0.5f);
      text(i, border * 0.5f, x);
    }
  }

    public void settings() {
        size(500, 500);

        float f = map1(2, 0, 10, 0, width);
        println(f); //should print 100

        f = map1(9,0,1,0,10);
        println(f);//print 90

        f = map1(250,200,300,400,500);
        println(f);//print 450

        f = map1(5,0,10,1000,2000);
        println(f); // print 1500
    }

    int mode = 0;

    float[] rainFall = {45,37,55,27,38,52,79,48,104,31,100,58};

    String[] months = {"jan", "Feb", "March", "April", "May", "June", "July" , "August", "September", "October", "November", "December"};


    public void keyPressed() {
        // the value of mode will be the number of the
        // number key pressed
        if (keyCode >= '0' && keyCode <= '9')
            mode = keyCode - '0';
    }

    public void setup() {
        colorMode(HSB);

        int minValue =0;
        int maxValue = 0;
        float sum = 0;
        for(int i=1;i<rainFall.length;i++){
          if(rainFall[i] < minValue){
            minValue = i;
          }
          else if(rainFall[i] > maxValue){
            minValue =i;
          }
          sum += rainFall[i];
        }

        float average = sum / (float) rainFall.length;
        System.out.println("month with least rain fall was" + months[minValue]+ rainFall[minValue]);
        System.out.println("month with most rain fall was"+ months[maxValue] + rainFall[maxValue]);
        System.out.println("Average rain was: " + average);
        for (int i = 0; i < rainFall.length; i++){
          System.out.println(months[i]);
        }


        //draw bar char
        for(int i = 0; i < rainFall.length; i++){
          noStroke();
          fill(random(255), 255,255);
          float x = 0;
        }

    }

    float offset = 0;

    public void draw() {
        background(0);
        setup();
    }
}
