import java.util.Scanner;

abstract class Amazon_item{
    public  int item_id;
    public String product_type;
    public String item_name;
    public int display_price;
    public Amazon_item(int item_id , String product_type , String item_name , int display_price)
    {
        this.item_id = item_id;
        this.product_type  = product_type;
        this.item_name = item_name;
        this.display_price = display_price;
    }
    public abstract void  display_price(int displayprice);
    public  abstract  void net_price(int displayprice);
    public void display(){
          System.out.println("The item id is " + item_id);
        System.out.println("The product type is " + product_type);
        System.out.println("The item name is " + item_name);
        System.out.println("The display price is" + display_price);
    }


}

class Cloth_item extends Amazon_item{
    private String texture_type;
    public Cloth_item(int item_id , String product_type , String item_name ,  String texture_type ,int display_price )
    {
        super(item_id , product_type , item_name , display_price);
        this.texture_type = texture_type;
       
        
    }
    public void display_price(int display_price)
    {
        System.out.println(display_price);
    }
    public void net_price(int display_price)
    {
       if(display_price > 5000)
       {
            System.out.println("The net price is " + (display_price -(display_price * 15)/100));
       }
       else if(display_price >= 4000 && display_price <= 5000)
       {
            System.out.println("The net price is " + (display_price -(display_price * 10)/100));
       
       }
         else if(display_price >= 3000 && display_price <= 4000)
       {
            System.out.println("The net price is " + (display_price -(display_price * 5)/100));
       
       }
       else{
        System.out.println("The net price is " + display_price);
       }
    }
    public void display()
    {
          System.out.println("The item id is " + item_id);
        System.out.println("The product type is " + product_type);
        System.out.println("The item name is " + item_name);
        System.out.println("The display price is" + display_price);
        System.out.println("The texture type is " + texture_type);
         net_price(display_price);
        
    }
}

public class Question10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        Amazon_item[] obj = new Cloth_item[2];
        for(int  i = 0;i<2;i++)
        {
                System.out.println("Enter the Item id ");
                int item_id = sc.nextInt();
                System.out.println("Enter the product type ");
                String product_type = sc.next();
                 System.out.println("Enter the product name ");
                String item_name = sc.next();
                 System.out.println("Enter the texture type");
                 String texture_type = sc.next();
                  System.out.println("Enter the Display Price");
                 int display_price = sc.nextInt();
                
                 obj[i] = new Cloth_item(item_id, product_type, item_name, texture_type, display_price);
                obj[i].display();
        }
            
        }
        catch(Exception e )
        {
                System.out.println(e);
        }

    }
}