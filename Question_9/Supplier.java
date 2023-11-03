package MyPackage;
public class Supplier{
    private int sup_id;
    private String sup_name;
    private String address;
    private String[] procductname = new String[3];
    private int[] priceofproduct = new int[3];
    private int totalprice;

    public Supplier(int sup_id , String sup_name  , String address ,String[] procductname  , int[] priceofproduct )
    {
        this.sup_id = sup_id;
        this.sup_name = sup_name;
        this.address = address;
        this.procductname = procductname;
        this.priceofproduct  = priceofproduct;
        calculatePrice();
    }
    public void calculatePrice()
    {
         totalprice = priceofproduct[0] + priceofproduct[1] + priceofproduct[2];
        System.out.println(totalprice);
    }

    public String toString()
    {
return "The Supplier id is " + sup_id +"\n"
        +"The Supplier name is " + sup_name +"\n"
        +"Address is " + address +"\n"
        +"The Supplier id is " + sup_id +"\n"
        + "total price is" + totalprice;

    }
}


