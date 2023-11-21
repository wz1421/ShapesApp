import shapes.Circle;
import shapes.Rect;
import shapes.Shape;
import shapes.Square;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class Drawing extends Canvas {

    ArrayList<Shape> shapes = new ArrayList<>();
    private Color currentColor = Color.BLACK;
    private String selectedShape = null;
    String[] choices = {"Circle", "Square", "Rectangle"};
    protected JComboBox<String> cb = new JComboBox<>(choices);

    public Drawing() {
        setPreferredSize(new Dimension(800, 600)); // Set preferred size for the canvas


        cb.setVisible(true);

        cb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Action Listener");
                selectedShape = (String) cb.getSelectedItem();
            }
        });

//        JPanel controlPanel = new JPanel();
//        controlPanel.add(new JLabel("Select a shape:"));
//        controlPanel.add(cb);
//        setVisible(true);

        // Add control panel with JComboBox to the layout

        // MouseListener to draw shapes on mouse click
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                selectedShape = (String) cb.getSelectedItem();
                System.out.println(selectedShape);
                // Create a new shape based on the selected shape and color, and add it to the list
                if ("Circle".equals(selectedShape)) {
                    Circle circle = new Circle(50, new Point(e.getX(), e.getY()), currentColor);
                    System.out.println("Circle pressed");
                    shapes.add(circle);
                }if ("Square".equals(selectedShape)) {
                    Square square = new Square(new Point(e.getX(), e.getY()), 50, currentColor);
                    System.out.println("square pressed");
                    shapes.add(square);
                }if ("Rectangle".equals(selectedShape)) {
                    System.out.println("Rectangle pressed");
                    Rect rect = new Rect(new Point(e.getX(), e.getY()), 50, 70, currentColor);
                    shapes.add(rect);
                }

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

    public void setCurrentColor(Color color) {
        this.currentColor = color;
    }

    public void clear() {
        shapes.clear();
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }
}
