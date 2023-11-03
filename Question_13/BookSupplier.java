package GTU;
import GTU.Supplier;

public class BookSupplier extends Supplier {
    private int discount;
    private int totalPrice;

    public BookSupplier(int supId , String supName , String supAddress , String[] procutNames , int[] productPrice , int discount)
    {
        super(supId, supName, supAddress, procutNames, productPrice);
        this.discount = discount;
    }
    public void totalPrice()
    {
        int price1 = productPrice[0] - (productPrice[0] * discount)/100;
        int price2  = productPrice[1] -(productPrice[1] * discount)/100;
        int price3 = productPrice[2 ] -(productPrice[2]  * discount)/100;
        totalPrice = price1 + price2 + price3;
        System.out.println(totalPrice);
    }
}
