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

    ShapeDB shapedb= new ShapeDB();

    public Drawing() {
        setPreferredSize(new Dimension(800, 600)); // Set preferred size for the canvas
        addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                p = e.getPoint();
                shapedb.addCircle(p,Color.RED,50);
                repaint();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }

        });

    }

    //public void clear() {
        //shapedb.clear();
        //repaint();

    //}
    public void paint(Graphics g){
        shapedb.drawShapes(g);
    }
}
