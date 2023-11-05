import java.util.Arrays;
import java.util.Scanner;


class Bill{
    private int billId;
    private int totalNumberOfItems;
    private int[] itemPrice  = new int[totalNumberOfItems];
    private int totalAmount;
    // int sum = 0;
    public Bill(int billId, int totalNumberOfItems  , int[] itemPrice )
    {
        this.billId = billId;
        this.totalNumberOfItems = totalNumberOfItems;
        this.itemPrice = itemPrice;
       
    }
    public String toString()
    {
    return "The Bill id is " + billId + "\n"
            +"The total number of items you have enter " + totalNumberOfItems +"\n"
            + "The item price is "+ Arrays.toString(itemPrice);
    }
    public void calculatTotalAmout()
    {
        for(int i = 0;i<totalNumberOfItems ;i++)
        {
          totalAmount += itemPrice[i];
        }

        System.out.println("Total Amount is " + totalAmount);
    }

}

public class Question12{
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        try{
            System.out.println("Enter the Bill Id :");
            int billId = sc.nextInt();
            System.out.println("Enter the total Number of items");
            int totalNumberOfItems = sc.nextInt();
            System.out.println("Enter the Price for the items");
            int[] itemPrice = new int[totalNumberOfItems];
                for(int i = 0;i<totalNumberOfItems;i++)
                {
                        itemPrice[i] = sc.nextInt();
                }
                Bill b1 = new Bill(billId, totalNumberOfItems, itemPrice);
                System.out.println(b1.toString());
                b1.calculatTotalAmout();
            }
        catch(Exception e)
        {
            System.out.println("An error occured");
        }
    }
}