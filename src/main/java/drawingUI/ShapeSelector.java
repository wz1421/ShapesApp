package drawingUI;

import javax.swing.*;

  public class ShapeSelector extends JPanel {
    JRadioButton bCirc = new JRadioButton("Circle");
    JRadioButton bRect = new JRadioButton("Rectangle");
    JRadioButton bSquare = new JRadioButton("Square");
    ButtonGroup buttonGroup = new ButtonGroup();

    public ShapeSelector() {
      buttonGroup.add(bCirc);
      bCirc.setSelected(true);
      buttonGroup.add(bRect);
      buttonGroup.add(bSquare);
      add(bCirc);
      add(bRect);
      add(bSquare);
    }

    public int getCurrentShape() {
      if (bCirc.isSelected()) {
        return 1; // Circle
      } else if (bRect.isSelected()) {
        return 2; // Rectangle
      } else if (bSquare.isSelected()) {
        return 3; // Square
      } else {
        return 1; // Default or no selection
      }
    }
  }
