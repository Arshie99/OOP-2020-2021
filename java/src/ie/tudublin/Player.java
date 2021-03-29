package ie.tudublin;

import processing.core.PApplet;

public class Player {
// variables
    float x, y;
    float w = 50;
    float halfW = w / 2;
    YASC yasc;

//constructor
public Player(float x, float y, YASC yasc) {
    this.x = x;
    this.y = y;
    this.yasc = yasc;
}

    void render(float x, float y)
    {
        yasc.line(x-halfW, y + halfW, x, y-halfW);
        yasc.line(x, y - halfW, x + halfW, y + halfW);
        yasc.line(x + halfW, y + halfW, x, y);
        yasc.line(x, y, x - halfW, y + halfW);
    }

    void update()
    {
        if (yasc.checkKey(PApplet.UP))
        {
            y -= 5;
        }
        if (yasc.checkKey(PApplet.DOWN))
        {
            y += 5;
        }
        if (yasc.checkKey(PApplet.LEFT))
        {
            x -= 5;
        }
        if (yasc.checkKey(PApplet.RIGHT))
        {
            x += 5;
        }
    }
}
