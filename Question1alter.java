class Vehical {

    private String name;
    private String manufacturer;

    public Vehical(String name, String manufacturer) {
        this.name = name;
        this.manufacturer = manufacturer;

    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void Display() {
        System.out.println("Name of this vehicle is :" + name);
        System.out.println("manufacturer of this vehicle is: " + manufacturer);
    }

    public void startEngine() {
        System.out.println(" ****    The Engine is Starting   **** ");
    }
}

class Car extends Vehical {
    private int numberofdoors;

    public Car(String name, String manufacturer, int numberofdoors) {

        super(name, manufacturer);
        this.numberofdoors = numberofdoors;
    }

    public void Display() {
        System.out.println("The name of this car is :" + super.getName());
        System.out.println("manufacturer of this car: " + super.getManufacturer());
    }

    public void NumberOfDoors() {
        System.out.println("The number of doors this car have are: " + numberofdoors);
    }

    public void honkHorn() {
        System.out.println("Honking the horn");
    }

}
// class SportsCar extends Car{

//     public start()
//     {

//     }
// }

public class Question1alter {
    public static void main(String args[]) {
        Vehical v1 = new Vehical("car", "Tata");
        v1.Display();
        v1.startEngine();

        Car supCar = new Car("supra", "Toyota", 2);
        supCar.Display();
        supCar.NumberOfDoors();
        supCar.honkHorn();

    }
}
