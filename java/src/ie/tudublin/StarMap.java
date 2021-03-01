package ie.tudublin;

import processing.core.PApplet;
import java.util.ArrayList;
import processing.data.Table;


public class StarMap extends PApplet {

    //variables
    ArrayList<Star> star = new ArrayList<Star>();


    void loadStars(){
      Table table = loadTable("HabHYG15ly.csv");
    }


    public void settings() {
        size(500, 500);
    }

    public void mouseClicked()
    {
        println("Mouse clicked");
    }

    public void setup() {
        colorMode(RGB);
    }

    public void draw() {
        background(0);
    }
}
