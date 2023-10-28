package MyPackage;
import MyPackage.Person;


public class Employee extends Person{
    //id da hra netsalary
    private int id;
    private double DA;
    private double HRA;
    private double netSalary;

    public int getId()
    {
        return id;
    }
    public void setId(int  id)
    {
            this.id = id;

    }
     public double getDA()
    {
        return DA;
    }
    public void setDA(double DA)
    {
            this.DA = DA;

    }

     public double getHRA()
    {
        return HRA;
    }
    public void setHRA(double HRA)
    {
            this.HRA = HRA;

    }
     public double getnetSalary()
    {
        return netSalary;
    }
    public void setnetSalary(double netSalary)
    {
            this.netSalary = netSalary;

    }
    public String  toString()
    {
        System.out.println("FirstName of the Employee is " + super.getfirstName());
        System.out.println("MiddleName of the Employee is " + super.getmiddleName());
        System.out.println("LastName of the Employee is " + super.getlastName());
        System.out.println("Address of the Employee is " + super.getaddress());
        System.out.println("Age of the Employee is " + super.getage());
        return "ID of Employee is " + getId() +"\n"
            + "DA of Employee is " + getDA() +"\n"
            + "HRA  of Employee is " + getHRA() + "\n"
            + "Net salary of Employee in " + getnetSalary();

    }
}
