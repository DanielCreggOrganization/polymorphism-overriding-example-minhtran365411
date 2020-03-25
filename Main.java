
public class Main {
    public static void main(String[] args) {
        // TwoDShape twoDShapeObj1 = new TwoDShape();
        // Square squareObj1 = new Square(3,4);
        // Circle circleObj1= new Circle(5,5);

        TwoDShape twoDShapeObj1 = new TwoDShape();
        TwoDShape squareObj1 = new Square(3,4);
        TwoDShape circleObj1= new Circle(5,5);

        TwoDShape[] twoDShapeArray = {twoDShapeObj1, squareObj1, circleObj1};

        for (TwoDShape twoDShape : twoDShapeArray) {
            System.out.println( twoDShape.findArea() );
            if (twoDShape instanceof Circle) {
                Circle circleObjTemp = (Circle)twoDShape;
                System.out.println( circleObjTemp.findRadius()     );
            }
        }


        // System.out.println( twoDShapeObj1.findArea() );
        // System.out.println( squareObj1.findArea() );
        // System.out.println( circleObj1.findArea() );

       // System.out.println(  ((Circle)circleObj1).findRadius()  );

    }
}