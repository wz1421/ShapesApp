import drawingUI.DrawingUIController;
import drawingUI.ShapeSelector;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 600);
        DrawingUIController drawingcontroll = new DrawingUIController();
        frame.add(drawingcontroll.getMainPanel());


        frame.addWindowListener(new WindowAdapter() {// Ends program if close window is clicked
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
        // Make the window visible

        frame.setVisible(true);
    }
}
