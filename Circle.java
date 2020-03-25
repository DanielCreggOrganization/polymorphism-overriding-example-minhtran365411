/**
 * Circle
 */
public class Circle extends TwoDShape {

    public Circle(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

   public double findArea() {
       double radius = getWidth()/2;
       double area = Math.PI * radius * radius;
       return area;
   }

   public double findRadius() {
       double radius = getWidth()/2;
       return radius;
   }
}
