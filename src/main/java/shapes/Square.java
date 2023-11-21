package shapes;

import shapes.Rect;

import java.awt.*;

public class Square extends Rect {

    public Square(Point point, int width, Color color) {
        super(point,width,width,color);
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(point.x, point.y, width,width);
    }
}