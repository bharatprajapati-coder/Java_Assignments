package GTU;


public class Supplier{
    private int supId;
    private String supName;
    private String supAddress;
    public  String[] procutNames = new String[3];
    public int[] productPrice = new int[3];
    private int totalPrice ;

    public Supplier(int supId , String supName , String supAddress , String[] procutNames , int[] productPrice)
    {
        this.supId = supId;
        this.supName = supName;
        this.supAddress = supAddress;
        this.procutNames  = procutNames;
        this.productPrice = productPrice;
        
    }
    public void totalPrice()
    {
        totalPrice = productPrice[0] + productPrice[1] + productPrice[2];
        System.out.println("Total price of the products is: " + totalPrice);
    }
    
}