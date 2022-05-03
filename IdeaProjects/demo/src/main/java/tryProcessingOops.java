import processing.core.PApplet;



public class tryProcessingOops extends PApplet {


    public static final int HEIGHT = 480;
    public static final int WIDTH = 640;

    int a = 1;
    int b = 2;
    int c = 3;
    int d = 4;
    public static void main(String[] args) {
        PApplet.main("tryProcessingOops",args);
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {


    }

    @Override
    public void draw() {
        Ellipse e1 = new Ellipse(HEIGHT/5,1);
        e1.drawEllipse(this);
        e1.newPosition();
        Ellipse e2 = new Ellipse(2*(HEIGHT/5),2);
        e2.drawEllipse(this);
        e2.newPosition();
        Ellipse e3 = new Ellipse(3*(HEIGHT/5),3);
        e3.drawEllipse(this);
        e3.newPosition();
        Ellipse e4 = new Ellipse(4*(HEIGHT/5),4);
        e4.drawEllipse(this);
        e4.newPosition();
    }


}
