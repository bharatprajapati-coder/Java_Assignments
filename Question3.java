import java.util.*;

interface  PizzaOrderSystem{
    abstract void placeOrder(String pizzaType , int quantity);
    abstract String checkOrderStatus(int orderId);
    abstract boolean cancelOrder(int orderId);
    abstract double calculateOrderCos(int orderId);
    void listAvailablePizza();
}

class pizzaOrderProcessor implements PizzaOrderSystem{
    private List<Order> orders = new ArrayList<>();
    private int nextOrderId = 1;
    public void placeOrder(String pizzaType , int quantity)
    {
        int orderId = nextOrderId++;
        Order order = new Order(orderId , pizzaType , quantity);
        orders.add(order);
        System.out.println("Order with ID" + orderId  + " and type " + pizzaType + "with Quantity " + quantity + "places successfully");
    }

    public String checkOrderStatus(int orderId)
    {
            Order  order = findOrderById(orderId);
            if(order!= null)
            {
                return "Your order with orderID"  + orderId +  "is in progress";
            }
            return  " Order not found ";
    }
    public boolean cancelOrder(int orderID)
    {
        Order order = findOrderById(orderID);
        if(order != null)
        {   orders.remove(order);
            System.out.println("Your order with orderId" +orderID + "hase been cancelled");
            return true;

        }
        else{
            System.out.println("Order not found , could not be canceled");
            return false;
        }
    }
    public double calculateOrderCos(int orderID)
    {
        Order order = findOrderById(orderID);
        if(order!= null)
        {
            return 100 * order.getQuantity();
        }
        return 0.0;

    }
    public void listAvailablePizza()
    {
               System.out.println("Available Pizza Options:");
        System.out.println("1. Margherita Pizza");
        System.out.println("2. Pepperoni Pizza");
        System.out.println("3. Veggie Pizza");
 
    }

    private Order findOrderById(int orderId)
    {
        for(Order order : orders)
        {
            if(order.getOrderId() == orderId)
            {
                return order;
            }
        }
        return null;

    }

}

class Order{
    private int orderId;
    private String pizzaType;
    private int quantity;
    public Order(int orderId , String pizzaType , int quantity)
    {
        this.orderId = orderId;
        this.pizzaType = pizzaType;
        this.quantity = quantity;
    } 
    public int getOrderId()
    {
        return orderId;
    }
    public String getpizzaType()
    {
        return pizzaType;
    }
    public int getQuantity()
    {
        return quantity;
    }
}


public class Question3{
    public static void main(String args[])
    {
      System.out.println("Bharat Prajapati \n Roll no : 3058" );
PizzaOrderSystem pizza = new pizzaOrderProcessor();
        pizza.listAvailablePizza();

        Scanner scanner = new Scanner(System.in);
        int numberOfOrders;

        do {
            System.out.print("Enter the number of orders (0 to exit): ");
            numberOfOrders = scanner.nextInt();

            for (int i = 1; i <= numberOfOrders; i++) {
                System.out.print("Enter pizza type for order " + i + ": ");
                String pizzaType = scanner.next();
                System.out.print("Enter quantity for order " + i + ": ");
                int quantity = scanner.nextInt();

                pizza.placeOrder(pizzaType, quantity);
            }

            for (int i = 1; i <= numberOfOrders; i++) {
                String orderStatus = pizza.checkOrderStatus(i);
                System.out.println(orderStatus);

                double orderCost = pizza.calculateOrderCos(i);
                System.out.println("Order " + i + " Cost: " + orderCost);

                boolean isOrderCanceled = pizza.cancelOrder(i);
                if (isOrderCanceled) {
                    System.out.println("Order " + i + " canceled successfully.");
                } else {
                    System.out.println("Order " + i + " could not be canceled.");
                }
            }
        } while (numberOfOrders > 0);

        scanner.close();
    }}