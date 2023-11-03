
import GTU.Supplier;

import java.util.Scanner;

import GTU.BookSupplier;


public class Question13{
    public static void main(String[] args) {
        
        try{
    Scanner sc = new Scanner(System.in);

        String[] procutNames = new String[3];
         int[] productPrice = new int[3];
        System.out.println("Enter the Supplier id");
        int supId = sc.nextInt();
        System.out.println("Enter the Supplier Name");
        String supName = sc.next();
        System.out.println("Enter the Supplier Address");
        String supAddress = sc.next();
        System.out.println("Enter the Product Names");
        for(int i= 0;i<3;i++)
        {
            procutNames[i] = sc.next();

        }
        System.out.println("Enter the Product price");
        for(int i= 0;i<3;i++)
        {
            productPrice[i] = sc.nextInt();
            
        }
        
        Supplier bk =  new Supplier(supId, supName, supAddress, procutNames, productPrice);
        bk.totalPrice();
    }
    catch(Exception e)
    {
        System.out.println("An Error occured");
    }
}
}