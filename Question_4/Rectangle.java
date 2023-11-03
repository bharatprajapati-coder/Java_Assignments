package MyPackage;
import MyPackage.Shape;



public class Rectangle  extends Shape {
    private double length;
    private double width;
    double area =0;

    public Rectangle(double length , double width)
    {
        this.length = length;
        this.width = width;

    }
    public void area()
    {
        try{
            if(length <= 0 || width <= 0)
            {
                throw new IllegalArgumentException("length and  width must be Greater than 0.");
            }
            area = length *width;
        }catch(IllegalArgumentException e)
        {
            System.out.println("Invalid Input");
        }
        finally{
            System.out.println("The area of the Rectagnle is" + area);
        }
    }
    public String toString()
    {
        return "The Length is" + " "+ length + "The Width is" + " " + width;
    }

}
