import processing.core.PApplet;

public class TryProcessing extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    int x,y,z,a = 0;


    public static void main(String[] args) {

        PApplet.main("TryProcessing",args);
        //PApplet.main("TryProcessing");
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        //ellipse(WIDTH/2,HEIGHT/2,100,100);
    }

    @Override
    public void draw() {
        drawCircle();
    }

    private void drawCircle() {
        ellipse(x,HEIGHT/5, DIAMETER, DIAMETER);
        x++;
        ellipse(y,2*(HEIGHT/5), DIAMETER, DIAMETER);
        y += 2;
        ellipse(z,3*(HEIGHT/5), DIAMETER, DIAMETER);
        z += 4;
        ellipse(a,4*(HEIGHT/5), DIAMETER, DIAMETER);
        a += 8;
    }
}
