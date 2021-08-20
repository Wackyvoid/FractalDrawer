//Written by Ruth Mesfin (mesfi020) and Namita Nair (nair0025)
import java.lang.Math;
import java.awt.*;

public class Circle {
    double xPos;
    double yPos;
    double radius;
    Color cshape;

    public Circle(double x, double y, double rad) {
        this.xPos = x;
        this.yPos = y;
        this.radius = rad;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public double calculateArea() {
        return Math.PI * (Math.pow(radius, 2));
    }

    public void setColor(Color cshape) {
        this.cshape = cshape;

    }

    public void setPos(double x, double y) {
        this.xPos = x;
        this.yPos = y;
    }

    public void setRadius(double rad) {
        this.radius = rad;
    }

    public Color getColor () {
        return cshape;
    }
    public double getXPos () {
        return xPos;
    }
    public double getYPos () {
        return yPos;
    }
    public double getRadius () {
        return radius;
    }
}
