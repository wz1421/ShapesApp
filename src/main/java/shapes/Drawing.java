package shapes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class Drawing extends Canvas {

    //ArrayList<Shape> shapes = new ArrayList<>();
    private Color currentColor = Color.BLACK;
    private String selectedShape = null;

    Point p = new Point();

    public ShapeDB shapedb= new ShapeDB();

    public Drawing() {
        setBackground(Color.white);
        setPreferredSize(new Dimension(800, 600)); // Set preferred size for the canvas
    }

    //}
    public void addSquare(Point pos, Color col, int side) {//not returning anything so it is just void
        Square square = new Square(pos, side, col); //this is the order of inputs from my Square class
        shapedb.addSquare(pos,side,col);
    }
    public void addCircle(Point pos, Color col, int radius) {
        Circle circle = new Circle(radius, pos, col);
        shapedb.addCircle(pos,col,radius);
    }

    public void addRect(Point pos, Color col, int w, int h) {
        Rect rectangle = new Rect(pos, w, h, col);
        shapedb.addRect(pos,col,w,h);
    }
    public void paint(Graphics g){
        shapedb.drawShapes(g);
    }
}
