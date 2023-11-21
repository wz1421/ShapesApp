package shapes;

import shapes.Shape;

import java.awt.*;

public class Circle extends Shape {
    //Class Fields
    private int radius;


    //creating constructor that has three arguments of the same types and classes as above
    public Circle(int r, Point point, Color color) {
        super(point, color);
        this.radius = r;
    }

    public void draw(Graphics g) { //creating a public method that takes a Graphics object as an argument
        g.setColor(color);
        g.fillOval(point.x, point.y, radius, radius);

    }
}

