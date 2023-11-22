package shapes;

import java.util.ArrayList;
import java.awt.*;

public class ShapeDB {
    ArrayList<Shape> shapes = new ArrayList<>();

    public void addSquare(Point pos, int side, Color col) {//not returning anything so it is just void
        Square square = new Square(pos, side, col); //this is the order of inputs from my Square class
        shapes.add(square);
    }

    public void addCircle(Point pos, Color col, int radius) {
        Circle circle = new Circle(radius, pos, col);
        shapes.add(circle);
    }

    public void addRect(Point pos, Color col, int w, int h) {
        Rect rectangle = new Rect(pos, w, h, col);
        shapes.add(rectangle);
    }
    public void drawShapes(Graphics g){
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }
}
