import MyPackage.Person;
import MyPackage.Employee;
import MyPackage.Manager;


public class ApplicationPer {
    public static void main(String[] args) {
        Person[] peoples = new Person[3];
        peoples[0] = new Employee("Bhushan Bhatt" , 40000.00);
        peoples[1] = new Manager("Harshad Mehta" , 100000.00);
        for(Person person : peoples)
        {
            try{
                    person.displayData();
                    person.hikeSalary(10);
            }
            catch(Exception e)
            {
                System.out.println("An error occured");
            }
        }
    }

}
