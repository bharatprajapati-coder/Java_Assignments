package  MyPackage;
import MyPackage.Shape;


public  class Circle extends  Shape{
    private double radius;
    private double area;

    public Circle(double radius)
    {
        this.radius = radius;
    }
    public void area()
    {
        try{
                if(radius <=0) 
                {
                    throw new IllegalArgumentException("Radius must be positive");
                }

            area = 3.14*radius *radius;
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("Invalid Input");
        }
        finally{
            System.out.println("The area of the circle is " + area);
        }
    }
    public String toString()
    {
        return "The Radius of Circle is" + radius;

    }
}
