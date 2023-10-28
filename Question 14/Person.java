package MyPackage;


 public abstract class Person{
    public String name;
    public double salary;
    public Person()
    {
        System.out.println("The Person Object is created");
    }
    public Person(String name , double salary)
    {
            this.name = name ;
            this.salary  = salary;
    }
 
   
    public abstract void hikeSalary(double percentage);
    public abstract void displayData();

}