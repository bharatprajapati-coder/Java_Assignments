package MyPackage;
import MyPackage.Person;

public class Student extends Person{
    private int rollNo;
    private String address;
    private double percentage;

    public Student(String firstName , String lastName  , int age , int rollNo , String address , double percentage)
    {
        super(firstName, lastName, age);
            this.rollNo = rollNo;
            this.address = address;
            this.percentage = percentage;

    }

    public int getrollNo()
    {
        return rollNo;
    }
    public void setrollNo(int rollNo)
    {

        this.rollNo = rollNo;
    }
    public String getAddress()
    {
        return address;
    }
    public void setAddress(String address)
    {
        this.address= address;
    }

    public double getpercentage()
    {
        return percentage;
    }
    public void setpercentage(double percentage)
    {
        this.percentage = percentage;
    }

    public void display()
    {
        System.out.println("First Name of the Student is " + getfirstName());
        System.out.println("Last Name of the Student is " + getlastName());
        System.out.println("Age of the Student is " + getage());
        System.out.println("ID of the Student is " + getrollNo());
        System.out.println("Designation of the Student is " + getAddress());
        System.out.println("salary of the Student is " + getpercentage());
        
    }

    public void setage(int age) {
        try {
            super.setage(age);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid age for a student: " + e.getMessage());
        }
    }
}



