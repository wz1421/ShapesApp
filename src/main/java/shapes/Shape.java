package shapes;

import java.awt.*;

import java.util.ArrayList; // import the ArrayList class



public abstract class Shape implements Drawable{
    protected Point point;
    protected Color color;


    public Shape(Point point, Color color) {
        this.point = point;
        this.color = color;
        }


    //each shape has a different draw class
    //depending on the type of shape, pass it onto the relevant draw
    public abstract void draw(Graphics g);



}
