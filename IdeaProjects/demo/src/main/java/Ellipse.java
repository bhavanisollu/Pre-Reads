import processing.core.PApplet;

public class Ellipse extends PApplet {
    private  int position;
    private  int height;
    private  int diameter;
    private int speed;


    public Ellipse(int height,int speed){
        this.position = 0;
        this.height = height;
        this.diameter = 10;
        this.speed = speed;
    }

    public void drawEllipse(PApplet obj){
        obj.ellipse(position,height,diameter,diameter);
        this.position = this.position + this.speed;

    }

    public void newPosition(){
        this.position = this.position+this.speed;
    }
}
