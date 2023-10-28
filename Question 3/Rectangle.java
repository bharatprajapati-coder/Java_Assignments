package MyPakcage;

public class Rectangle{
    private double length;
    private double width;
    int count = 0;
    public Rectangle()
    {
         count++;
    }
    public Rectangle(double length , double width)
    {
        this.length = length;
        this.width = width;
        count++;
    }
    public Rectangle(Rectangle other)
    {
        this.length = other.length;
        this.width = other.width;
        count++;

    }
    public void area()
    {
        System.out.println("the area of rectangel is" + (length*width));
    }
    static{
        System.out.println("This is static Intializer block ");
    }
    {
        System.out.println("This is intizializer block ");
    }
    public String toString()
    {
        return "The length of Rectangle is" + length + "Width of Rectangel is" + width;
        
    }
    public int totalcount()
    {
        return count;
    }

}