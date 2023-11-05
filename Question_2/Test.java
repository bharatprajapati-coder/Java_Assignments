
import MyPackage.Person;
import MyPackage.Student;
import MyPackage.Employee;

 public class Test  {
    public static void main(String[] args) {
       Student s1 = new Student("Prajapati", "vraj", 11, 1066, "Goa", 75.00);
       s1.display();

       Employee e1 = new Employee("Patel", "Annirudh", 21, 3053, "Developer", 50000);
       e1.display();
       
    }
}
