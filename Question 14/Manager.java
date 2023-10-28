package MyPackage;
import MyPackage.Employee;

public class Manager extends Employee{
    public Manager(String name , double salary)
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
      System.out.println(currentsalary + 5000);
    }
    public void displayData() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
