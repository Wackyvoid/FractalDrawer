//Written by Ruth Mesfin (mesfi020)
import java.awt.*;

public class Rectangle{
  double xPos;
  double yPos;
  double width;
  double height;
  Color cshape;

  public Rectangle(double x, double y, double wid, double hei){
    this.xPos = x;
    this.yPos = y;
    this.width = wid;
    this.height = hei;
  }

  public double calculatePerimeter(){
    return (2 * width) + (2 * height);
  }

  public double calculateArea(){
    return width * height;
  }

  public void setColor(Color cshape){
    this.cshape = cshape;
  }

  public void setPos(double x, double y){
    this.xPos = x;
    this.yPos = y;
  }

  public void setHeight(double hei){
    this.height = hei;
  }

  public void setWidth(double wid){
    this.width = wid;
  }

  public Color getColor(){
    return cshape;
  }

  public double getXPos(){
    return xPos;
  }

  public double getYPos(){
    return yPos;
  }

  public double getHeight(){
    return height;
  }

  public double getWidth(){
    return width;
  }
}
