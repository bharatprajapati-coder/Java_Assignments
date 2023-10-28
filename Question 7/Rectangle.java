package Shape;
import Geometry.Figure;


public class Rectangle extends Figure{
    public double length;
    public double width;
    public Rectangle(double d , double  e)
    {
        this.length = d;
        this.width = e;
    }
    public void area()
    {
        System.out.println("Area of Rectangle is"+ (length * width));
    }
     public void perimeter()
    {
        System.out.println("Perimeter of Rectangle is"+ (2*(length + width)));
    }
    
}
