import java.util.Scanner;

import MyPackage.Supplier;

public class Question9 extends Supplier{
    public Question9(int sup_id, String sup_name, String address, String[] productname, int[] priceofproduct) {
        super(sup_id, sup_name, address, productname, priceofproduct);
        //TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter your supplier id" );
            int sup_id = sc.nextInt();
            System.out.println("Enter  supplier name" );
            String sup_name = sc.next();
            System.out.println("Enter the address" );
            String addrss = sc.next();
            String[] productname = new String[3];
           int[] priceofproduct = new int[3];
    
            System.out.println("Enter the product name");
            for(int  i = 0;i<3;i++)
            {
                productname[i] = sc.next();
            }
             System.out.println("Enter the price of product ");
            for(int  i = 0;i<3;i++)
            {
                priceofproduct[i] = sc.nextInt();
            }
            Supplier s1 = new Supplier(sup_id, sup_name, addrss, productname, priceofproduct);
            System.out.println(s1);

        }
        catch(Exception e){
            System.out.println("An error occured");
        }
        
    }
}
