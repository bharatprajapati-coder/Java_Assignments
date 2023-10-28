import MyPackage.Person;
import MyPackage.Student;
import MyPackage.Employee;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Employee> Employees = new ArrayList<>();
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Enter the First Name of student " + (i + 1));
                String fname = sc.next();
                System.out.println("Enter the Middle Name of student " + (i + 1));
                String mname = sc.next();
                System.out.println("Enter the Last Name of student " + (i + 1));
                String lname = sc.next();
                System.out.println("Enter the Address  of student " + (i + 1));
                String addressos = sc.next();
                System.out.println("Enter the age of student " + (i));
                int ageos = sc.nextInt();
                if (ageos < 0 || ageos > 130) {
                    throw new InvalidAgeException("Age can not be less than 0");
                }
                System.out.println("Enter the RollNo. of student " + (i));
                int rollNo = sc.nextInt();
                System.out.println("Enter the Division of student " + (i));
                char div = sc.next().charAt(0);
                System.out.println("Enter the D.O.B of student " + (i));
                String Dob = sc.next();

                Student s1 = new Student();
                s1.setfirstName(fname);
                s1.setmiddleName(mname);
                s1.setlastName(lname);
                s1.setaddress(addressos);
                s1.setage(ageos);
                s1.setrollNo(rollNo);
                s1.setdivision(div);
                s1.setdob(Dob);

                students.add(s1);

                System.out.println("Do you want to continue ? (Y /N)");
                char ans = sc.next().charAt(0);
                if (ans == 'N' || ans == 'n') {
                    break;
                } else {
                    continue;
                }

            }
       
            students.sort(Student::compareTo);// This line state that sort the students list by using compare to  method of Student class REMeMBer It!.
            System.out.println("Student Details");
            System.out.println();
            System.out.println("\nSorted Students (by Roll No):");
            for (Student student : students) {
                System.out.println(student);
                System.out.println();
            }
            System.out.println();
        } catch (InvalidAgeException e) {
            System.out.println("Age cannot be negative");
        } catch (InputMismatchException e) {
            System.out.println("Your Input is Invalid");
        } catch (Exception e) {
            System.out.println(e);

        }

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Enter the First Name of Employee" + (i + 1));
                String fnameofe = sc.next();
                System.out.println("Enter the Middle Name of Employee " + (i + 1));
                String mnameofe = sc.next();
                System.out.println("Enter the Last Name of Employee " + (i + 1));
                String lnameofe = sc.next();
                System.out.println("Enter the Address  of Employee " + (i + 1));
                String addressofe = sc.next();
                System.out.println("Enter the age of Employee " + (i));
                int ageofe = sc.nextInt();
                if (ageofe < 0 || ageofe > 120) {
                    throw new InvalidAgeException("Age can not be Negative");
                }
                System.out.println("Enter the ID of Employee " + (i));
                int IDofe = sc.nextInt();
                System.out.println("Enter the DA of Employee " + (i));
                double Daofe = sc.nextDouble();
                System.out.println("Enter the HRA of Employee " + (i));
                double HRAofe = sc.nextDouble();
                System.out.println("Enter the Net salary of Employee " + (i));
                double netsalaryofe = sc.nextDouble();

                Employee emps = new Employee();
                emps.setfirstName(fnameofe);
                emps.setmiddleName(mnameofe);
                emps.setlastName(lnameofe);
                emps.setaddress(addressofe);
                emps.setage(ageofe);
                emps.setId(IDofe);
                emps.setDA(Daofe);
                emps.setHRA(HRAofe);
                emps.setnetSalary(netsalaryofe);

                Employees.add(emps);

                System.out.println("Do you want to continue ? (Y /N)");
                char ans = sc.next().charAt(0);
                if (ans == 'N' || ans == 'n') {
                    break;
                } else {
                    continue;
                }

            }

            // Employees.sort(Employee::compareTo);
            Employees.sort((e1, e2) -> Double.compare(e1.getnetSalary(), e2.getnetSalary()));
            System.out.println("Employee Details");
            System.out.println("\nSorted Employee (by net Salary):");
            for (Employee e1 : Employees) {
                System.out.println(e1);
                System.out.println();
            }
            System.out.println();
        } catch (InvalidAgeException e) {
            System.out.println("Age cannot be negative");
        } catch (InputMismatchException e) {
            System.out.println("Your Input is Invalid");
        } catch (Exception e) {
            System.out.println(e);

        }

        for (int i = 0; i < Employees.size(); i++) {
            Employee e1 = Employees.get(i);
            System.out.println("Employee" + " " + (i + 1) + " " + "Details :");
            System.out.println(e1);
            System.out.println();
        }

    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}