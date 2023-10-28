package Geometry;
import Geometry.Figure;

public class Circle extends Figure{
    public double radius;
    public Circle(double radius)
    {
        this.radius= radius;
    }
    public void area()
    {
        System.out.println("The area of circle is "+ (pi *radius *radius));
    }
    public void perimeter()
    {
        System.out.println("The perimeter of the circle is " + (2*(pi *radius)));
    }
}
