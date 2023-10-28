package MyPackage;

import MyPackage.Person;

public class Employee  extends Person{
    private int empId;
    private String designation;
    private double salary;

    public Employee(String firstName , String lastName  , int age , int empId , String designation , double salary)
    {
        super(firstName, lastName, age);
            this.empId = empId;
            this.designation = designation;
            this.salary = salary;

    }

    public int getempId()
    {
        return empId;
    }
    public void setempId(int empId)
    {

        this.empId = empId;
        
    }
    public String getdesignation()
    {
        return designation;
    }
    public void setdesignation(String designation)
    {
        this.designation= designation;
    }

    public double getsalary()
    {
        return salary;
    }
    public void setsalary(double salary)
    {
        this.salary = salary;
    }

    public void display()
    {
        System.out.println("First Name of the Employee is " + getfirstName());
        System.out.println("Last Name of the Employee is " + getlastName());
        System.out.println("Age of the Employee is " + getage());
        System.out.println("ID of the Employee is " + getempId());
        System.out.println("Designation of the employee is " + getdesignation());
        System.out.println("salary of the employee is " + getsalary());
        
    }
}
