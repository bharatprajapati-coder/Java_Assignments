package MyPackage;
import MyPackage.Person;

public class Employee extends Person{
    double currentsalary = 0;
    public Employee(String name , double salary)
    {
     super(name , salary);

    }
    public void hikeSalary(double percentage)
    {
        if (percentage < 0) {
            throw new IllegalArgumentException("Percentage cannot be negative");
        }
        currentsalary = salary;
      currentsalary +=  (currentsalary *percentage)/100;
      System.out.println(currentsalary);
    }
    public void displayData() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
   
}
