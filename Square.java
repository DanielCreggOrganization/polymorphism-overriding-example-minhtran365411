public class Square extends TwoDShape {

    public Square(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    public double findArea() {
        double area = getWidth() * getHeight();
        return area;
    }
}
