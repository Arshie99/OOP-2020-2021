package ie.tudublin;

public class bullet {
    float x, y;
    float dx, dy;
    float rotation = 0;
    float speed = 0;
    YASC yasc;

    public bullet(float x, float y, float rotation, YASC yasc) {
        this.x = x;
        this.y = y;
        this.rotation = rotation;
        this.yasc = yasc;
    }

    public void render() {
        yasc.pushMatrix();
        yasc.
    }

}
