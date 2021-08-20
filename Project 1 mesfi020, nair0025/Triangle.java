//Written by Namita Nair (nair0025)
import java.awt.*;

public class Triangle {
    double xPos;
    double yPos;
    double width;
    double height;
    Color cshape;

    public Triangle(double x, double y, double w, double h) {
        this.xPos = x;
        this.yPos = y;
        this.width = w;
        this.height = h;
    }

    public double calculatePerimeter() {
        double side = Math.sqrt(.5 * width);
        return (2 * side + width);
    }

    public double calculateArea() {
        return (.5 * width * height);
    }

    public void setColor(Color cshape) {
        this.cshape = cshape;
    }

    public void setPos(double x, double y) {
        this.xPos = x;
        this.yPos = y;
    }

    public void setHeight(double h) {
        this.height = h;
    }

    public void setWidth(double w) {
        this.width = w;
    }

    public Color getColor() {
        return cshape;
    }

    public double getXPos() {
        return xPos;
    }

    public double getYPos() {
        return yPos;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}
