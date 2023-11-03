
package Shape;

import java.util.Scanner;

import Geometry.Circle;
import Geometry.Figure;
import Shape.Rectangle;

public class Test {
    public static void main(String[] args) {
        System.out.println("Enter the values max 4");
        Scanner sc=  new Scanner(System.in);
        try{
        for(int  i = 0;i<4;i++)
        {
        System.out.println("Press 'C' for Calculating stuff of circle");
        System.out.println("Press 'R' for Calculating stuff of Rectangle");
    
        char choice = sc.next().charAt(0);
            if(choice != 'C' && choice != 'R')
            {
                throw new IllegalArgumentException("Please Enter valid input");
            }
        switch (choice) {
            case 'C':
                System.out.println("Enter the radius for circle");
                double radius = sc.nextDouble();
                    Figure circle = new Circle(radius);
                    circle.area();
                    circle.perimeter();
                break;

             case 'R':
               System.out.println("Enter the length for circle");
                double length = sc.nextDouble();
                  System.out.println("Enter the width for circle");
                double width = sc.nextDouble();
                Figure rectangle = new Rectangle(length , width);
                rectangle.area();
                rectangle.perimeter();
                break;
        
            default:
                break;
        }
        }
    }
    catch(IllegalArgumentException e)
    {
        System.out.println("Invalid Input ,Please Enter valid input");
    }
    finally{
      
        sc.close();
    }
    }
}
