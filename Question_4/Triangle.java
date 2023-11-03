package MyPackage;
import MyPackage.Shape;

public class Triangle extends Shape{
    private double breadth;
    private double height;
    private double area = 0.0;

    public Triangle(double breadth , double height)
    {
        this.breadth  = breadth;
        this.height = height;
        
    }
   public void area()
    {
        try{
            if(breadth <= 0 || height <= 0)
            {
                throw new IllegalArgumentException("Height and Width must be Greater than 0.");
            }
            area = 0.5 *( breadth *height);
        }catch(IllegalArgumentException e)
        {
            System.out.println("Invalid Input");
        }
        finally{
            System.out.println("The area of the triangle is" + area);
        }

    }
    public String toString()
    {
        
       
        return "Height of Triangel is " + " " + height + "Width of Triangel is " + " " + breadth;
    }
}
