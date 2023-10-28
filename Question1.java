// Program Description:
// You are tasked with creating a Java program for a car rental system. The
// program should model different types of vehicles using the Vehicle,
// Car, and SportsCar classes.
// Requirements:
// 1. Vehicle Class:
// • Create a Vehicle class with the following properties:
// • name (String): The name of the vehicle.
// • manufacturer (String): The manufacturer of the
// vehicle.

// • Implement a method startEngine() that prints a
// message indicating that the vehicle's engine is started.

// 2. Car Class:
// • Create a Car class that extends Vehicle with the following
// additional property:
// • numDoors (int): The number of doors in the car.
// • Implement a method honkHorn() to simulate the car
// honking its horn.
// 3. SportsCar Class:
// • Create a SportsCar class that extends Car with the
// following additional property:
// • topSpeed (int): The top speed of the sports car.
// • Implement a method activateTurbo() to simulate
// activating the turbo mode of the sports car.

// 4. Main Program:
// • In the main program, create instances of Vehicle, Car, and
// SportsCar to represent different types of vehicles.
// • Demonstrate the use of methods and properties of these
// classes by starting the engine, honking the horn, and
// activating the turbo (for sports cars).

// • Display relevant information about each vehicle, such as its
// name, manufacturer, number of doors (for cars), and top
// speed (for sports cars).



class Vehical{
    public String name ;
    public String manufacturer;
    public Vehical(String name ,String  manufacturer)
    {
        this.name = name ;
        this.manufacturer  = manufacturer;
    }
    public void Display()
    {
        System.out.println("The Name of the vehicle is:" + name );
        System.out.println("The manufacturer of this vehicle is:" + manufacturer);
    }
    public void startEngine()
    {
        System.out.println("The car Engine has been Started wHuorm whuourm whourm... ");
    }
}
class Car extends Vehical{
    public int numberofdoors;
     public Car(String name ,String manufacturer ,  int numberofdoors)
     {
        super(name , manufacturer);
        this.numberofdoors  = numberofdoors;
    }
    public void Display()
    {
         System.out.println("The Name of the car is:" +  name );
         System.out.println("The manufacturer of the Car is : " + manufacturer);
            System.out.println("The number of doors of this car are :" + numberofdoors);
    }
    public void honkHorn()
    {
        System.out.println("Honking : Peeep Peep peeeeeeeeeeeeee.");
    }

}

class SportsCar extends Car{
   public int speed;
   public SportsCar(String name ,String manufacturer ,  int numberofdoors,int speed)
   {
    super(name , manufacturer , numberofdoors);
    this.speed = speed;
   }
public void startEngine()
{
    System.out.println("The Sports car engine has started");
}
    public void honkHorn(){
        System.out.println("side please ");
    }

   public void topSpeed()
   {
    System.out.println("The Top spped of the  car is :" + speed);
   }
   public void activateTurbo()
   {
    System.out.println("Activating the Turbomode");
   }
}

class Question1{
    public static void main(String args[])
    {
        System.out.println("Bharat Prajapati \n Roll no : 3058" );
        Vehical v1 = new Vehical("Car" ,"Maruti Suzuki");
       v1.Display();
       v1.startEngine();
       
System.out.println();
       Car funti = new Car("Alto800" ,"Maruti Suzuki", 4);
       funti.Display();
       funti.honkHorn();
System.out.println();           
       SportsCar supra = new SportsCar("Supra" , "Toyota" , 2 , 400);
       supra.startEngine();
        supra.honkHorn();
       supra.topSpeed();
       supra.activateTurbo(); 


    }
}