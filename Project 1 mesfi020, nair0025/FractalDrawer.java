//Written by Ruth Mesfin (mesfi020) and Namita Nair (nair0025)
// FractalDrawer class draws a fractal of a shape indicated by user input
import org.w3c.dom.css.Rect;

import java.awt.Color;
import java.util.Scanner;

public class FractalDrawer {
    private double totalArea=0;  // member variable for tracking the total area
    static String userShape;
    Canvas myCanvas;
    static Color[] colorArray;
    static FractalDrawer newDrawing;

    public FractalDrawer(String shape) {
        this.userShape = shape;
    }  // constructor


    //TODO:
    // drawFractal creates a new Canvas object
    // and determines which shapes to draw a fractal by calling appropriate helper function
    // drawFractal returns the area of the fractal
    public double drawFractal(String userShape) {
        if (userShape.equals("triangle")) {
            myCanvas = new Canvas(1000,1000);
            drawTriangleFractal(300, 400, 350, 830, colorArray, myCanvas, 7, 0);
            System.out.println("The total area of your " + userShape + " fractal is: ");
        } else if (userShape.equals("circle")) {
            myCanvas = new Canvas(1000,1000);
            drawCircleFractal(150,500, 450, colorArray, myCanvas,7, 0);
            System.out.println("The total area of your " + userShape + " fractal is: ");
        } else if (userShape.equals("rectangle")) {
            myCanvas = new Canvas(1000,1000);
            drawRectangleFractal(200, 300, 300,325, colorArray, myCanvas,7, 0);
            System.out.println("The total area of your " + userShape + " fractal is: ");
        } else {
            System.out.println("Please type triangle, circle, or rectangle");
            Scanner newScanner = new Scanner(System.in);
            userShape = newScanner.nextLine();
            drawFractal(userShape);
        }
        return totalArea;
    }


    //TODO:
    // drawTriangleFractal draws a triangle fractal using recursive techniques
    public void drawTriangleFractal(double width, double height, double x, double y, Color[] c, Canvas can, int level, int arrayIndex){
        Triangle myTriangle = new Triangle(x, y ,width, height);
        myTriangle.setColor(c[arrayIndex]);
        can.drawShape(myTriangle);
        totalArea += myTriangle.calculateArea();
        if (level == 0) {
            return;
        } else {
            drawTriangleFractal(width/2, height/2, x + width/2 - .25 * width, y - height, c, myCanvas, level - 1, arrayIndex + 1);
            drawTriangleFractal(width/2, height/2, x - width/2, y, c, myCanvas, level - 1, arrayIndex + 1);
            drawTriangleFractal(width/2, height/2, x + width, y, c, myCanvas, level - 1, arrayIndex + 1);
        }
    }


    // TODO:
    // drawCircleFractal draws a circle fractal using recursive techniques
    public void drawCircleFractal(double radius, double x, double y, Color[] c, Canvas can, int level, int arrayIndex) {
        Circle myCircle = new Circle(x, y, radius);
        myCircle.setColor(c[arrayIndex]);
        can.drawShape(myCircle);
        totalArea += myCircle.calculateArea();
        if (level == 0) {
            return;
       } else {
            drawCircleFractal(radius/2, x + (1.5 * radius), y, c, myCanvas, level - 1, arrayIndex + 1);
            drawCircleFractal(radius/2, x - (1.5 * radius), y, c, myCanvas, level - 1, arrayIndex + 1);
            drawCircleFractal(radius/2, x, y + (1.5 * radius), c, myCanvas, level - 1, arrayIndex + 1);
            drawCircleFractal(radius/2, x, y - (1.5 * radius), c, myCanvas, level - 1, arrayIndex + 1);
        }
    }


    //TODO:
    // drawRectangleFractal draws a rectangle fractal using recursive techniques
    public void drawRectangleFractal(double width, double height, double x, double y, Color[] c, Canvas can, int level, int arrayIndex) {
        Rectangle myRect = new Rectangle(x, y, width, height);
        myRect.setColor(c[arrayIndex]);
        can.drawShape(myRect);
        totalArea += myRect.calculateArea();
        if (level == 0) {
            return;
        } else {
            drawRectangleFractal(width / 2, height / 2, x + width, y - (height / 2), c, myCanvas, level - 1, arrayIndex + 1);
            drawRectangleFractal(width / 2, height / 2, x - (width / 2), y - (height / 2), c, myCanvas, level - 1, arrayIndex + 1);
            drawRectangleFractal(width / 2, height / 2, x + width, y + height, c, myCanvas, level - 1, arrayIndex + 1);
            drawRectangleFractal(width / 2, height / 2, x - (width / 2), y + height, c, myCanvas, level - 1, arrayIndex + 1);
        }
    }

    //TODO:
    // main should ask user for shape input, and then draw the corresponding fractal.
    // should print area of fractal
    public static void main(String[] args){
        colorArray = new Color[]{Color.cyan, Color.magenta, Color.yellow, Color.green, Color.black, Color.pink, Color.orange, Color.blue};
        System.out.println("What shape would you like to draw (triangle, circle or rectangle)?");
        Scanner myScanner = new Scanner(System.in);
        userShape = myScanner.nextLine();
        newDrawing = new FractalDrawer(userShape);
        System.out.println(newDrawing.drawFractal(userShape));
    }
}
