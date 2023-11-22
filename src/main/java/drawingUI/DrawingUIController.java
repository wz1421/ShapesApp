package drawingUI;
import java.awt.*;
import javax.swing.*;

import shapes.Drawing;
import shapes.ShapeDB;

import java.awt.event.*;

import static com.sun.java.accessibility.util.AWTEventMonitor.addMouseListener;

public class DrawingUIController extends Drawing{
    JPanel controlsPanel = new JPanel();
    JPanel mainPanel = new JPanel();

    Drawing drawing = new Drawing();

    Point p = new Point();

    ShapeSelector sSel = new ShapeSelector();



    //ShapeDB shapedb = new ShapeDB();

    public DrawingUIController() { //can't do anything without a method
        //mainPanel.setBackground(Color.BLUE);
        //controlsPanel.setBackground(Color.RED);
        mainPanel.add(controlsPanel);
        controlsPanel.setLayout(new GridLayout(4, 1));
        controlsPanel.add(sSel);
        mainPanel.add(drawing);
        mainPanel.setLayout(new GridLayout(2, 1));
        controlsPanel.setVisible(true);
        mainPanel.setVisible(true);
        addMouseListenertoDrawing();
    }

        public void addMouseListenertoDrawing(){
            drawing.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    p = e.getPoint();
                    if (sSel.getCurrentShape() == 1){
                        drawing.addCircle(p, Color.RED, 50);
                        //drawing.repaint();
                    }
                    else if(sSel.getCurrentShape() ==2){
                        System.out.println("Rect chosen");
                        drawing.addRect(p,Color.GREEN,40,60);
                    }
                    else if(sSel.getCurrentShape() ==3){
                        System.out.println("Square chosen");
                        drawing.addSquare(p,Color.BLUE,50);
                    }
                    drawing.repaint();
                    System.out.println("Mouse clicked");
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


    public JPanel getMainPanel() {
        return mainPanel;

    }
}
