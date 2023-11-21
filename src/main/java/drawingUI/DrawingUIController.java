package drawingUI;
import java.awt.*;
import javax.swing.*;

import shapes.Circle;
import shapes.Drawing;
import java.awt.event.*;

public class DrawingUIController{
    JPanel controlsPanel = new JPanel();
    JPanel mainPanel = new JPanel();

    Drawing drawing = new Drawing();

    Point p = new Point();

    public DrawingUIController() { //can't do anything without a method
        mainPanel.setBackground(Color.BLUE);
        controlsPanel.setBackground(Color.RED);
        mainPanel.add(drawing);
        mainPanel.add(controlsPanel);
        controlsPanel.setLayout(new GridLayout(3, 1));
        mainPanel.setLayout(new GridLayout(2, 1));
        controlsPanel.setVisible(true);
        mainPanel.setVisible(true);

        //System.out.println("ran");
    }

    public JPanel getMainPanel(){
        return mainPanel;

    }
}
