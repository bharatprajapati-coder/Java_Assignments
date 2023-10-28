import MyPakcage.Rectangle;

public class Question3 {
    public static void main(String[] args) {

        try{
        Rectangle r1 = new Rectangle();
        System.out.println(r1);
        r1.area();
        r1.toString();
        Rectangle r2 = new Rectangle(10 , 10);
        System.out.println(r2);
        r2.area();
        r2.toString();
        Rectangle r3 = new Rectangle(r2);
        System.out.println(r3);
        r3.area();
        r3.toString();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
