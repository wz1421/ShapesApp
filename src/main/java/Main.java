import drawingUI.DrawingUIController;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import shapes.Drawing;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 600);
        DrawingUIController drawingcontroll = new DrawingUIController();
        frame.add(drawingcontroll.getMainPanel());
        //Drawing drawing = new Drawing();
        // Set the default close operation (exit when the window is closed)
        frame.addWindowListener(new WindowAdapter() {// Ends program if close window is clicked
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
        // Make the window visible
        frame.setVisible(true);
        frame.getContentPane().add(drawingcontroll.getMainPanel());
        //adding Mouse Listener
        //drawing.addMouseListener(new MouseListener(){
    }
}
