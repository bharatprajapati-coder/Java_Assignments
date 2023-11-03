import MyPackage.Triangle;
import MyPackage.Rectangle;
import MyPackage.Circle;
import MyPackage.Shape;

public class Question4 {
   public static void main(String args[])
    {
        
            // Creating objects from the Shape reference
            Shape triangle = new Triangle(10,10);
            Shape rectangle = new Rectangle(10 ,10 );
            Shape circle = new Circle(0.1);
            triangle.area();
            System.out.println(triangle.toString());

            rectangle.area();
            System.out.println(rectangle.toString());

            circle.area();
            System.out.println(circle.toString());

    }
}
