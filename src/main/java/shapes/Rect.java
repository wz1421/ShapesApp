package shapes;


import java.awt.*;

public class Rect extends Shape {

    public int width;
    public int height;

    //private Color c;



    //creating constructor that has three arguments of the same types and classes as above
    public Rect(Point point, int width, int height, Color color){
        super(point,color);
        //this.point = p;
        this.width = width;
        this.height = height;
        //this.c = c;
    }
    public void draw(Graphics g ){ //creating a public method that takes a Graphics object as an argument
        g.setColor(color);
        g.fillRect(point.x, point.y,width,height);
    }






}
