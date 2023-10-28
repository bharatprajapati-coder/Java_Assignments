 abstract class Thali{
    
    private double price = 0.0 ;
    abstract void addSabji(double price);
    abstract void addDal(double price);
    abstract void addRice(double price);
     abstract void addRoti(double price);
    void makeThali()
    {
        System.out.print("Veg Thali will be ready in 30 minutes");
        System.out.println("We appericiate your patience");
    }
    public double getPrice()
    {
        return price ;
    }
    protected void  setPrice(double price)
    {
            this.price += price;
    }
}
class GujaratiThali extends Thali {
    // private Thali t1;
        void addSabji(double price)
        {
            System.out.println("The price for Gujarati thali's the Sabji is :" + price);
            setPrice(price);
        }
            void addDal(double price)
        {
            System.out.println("The price for Gujarati thali's  the Dal is :" + price);
            setPrice(price);
        }
            void addRice(double price)
        {
            System.out.println("The price for Gujarati thali's  the Rice is :" + price);
            setPrice(price);
        }
            void addRoti(double price)
        {
            System.out.println("The price for Gujarati thali's the Roti is :" + price);
            setPrice(price);
        }
        
    //    super.getPrice();

        

}
class PunjabiThali extends Thali {
        void addSabji(double price)
        {
            System.out.println("The price for Punjabi thali's the Sabji is :" + price);
               setPrice(price);
        }
            void addDal(double price)
        {
            System.out.println("The price for Punjabi thali's  the Dal is :" + price);
               setPrice(price);
        }
            void addRice(double price)
        {
            System.out.println("The price for Punjabi thali's  the Rice is :" + price);
               setPrice(price);
        }
            void addRoti(double price)
        {
            System.out.println("The price for Punjabi thali's the Roti is :" + price);
               setPrice(price);
        }
}

abstract class BaseThali{
    GujaratiThali ganesh  = new GujaratiThali();
    PunjabiThali harman = new PunjabiThali();
    abstract void createGujaratiThali();
    abstract void createPunjabiThali();

 }

 class ThaliRestaurant extends BaseThali{
        public void createGujaratiThali()
        {
            ganesh.addDal(50);
            ganesh.addRice(40);
            ganesh.addRoti(40);
            ganesh.addSabji(60);
        }
        public void totalOfGujarati()
        {
            System.out.println("The total Price of the Gujarati Thadi is:" + ganesh.getPrice());
        }
        public void createPunjabiThali()
        {
            harman.addDal(70);
            harman.addRice(60);
            harman.addRoti(40);
            harman.addSabji(30);

        }
        public void totalOfPunjabi()
        {
            System.out.println("The total Price for the Punjabi Thali is :" + harman.getPrice());
        }
 }

public class Question2 {
  public static void main(String args[])
  {
    System.out.println("\t Name : BHARAT PRAJAPATI \n Roll no : 3058");

                ThaliRestaurant baseThali = new ThaliRestaurant();
                baseThali.createGujaratiThali();
                baseThali.ganesh.makeThali();
                double gtprice =  baseThali.ganesh.getPrice();
                System.out.println("The total price for your gujarati thali is : "+ gtprice + "only.");
            System.out.println();
                baseThali.createPunjabiThali();
                baseThali.harman.makeThali();
                double ptprice = baseThali.harman.getPrice();
                System.out.println("The total price for your punjabi thali is :" + ptprice + "only.");



  }     
}
