package MyPackage;
import MyPackage.Person;

public class Student  extends Person{
    //rollno division dob
    private int rollNo;
    private char division;
    private String dob;
   

    public int getrollNo()
    {
        return rollNo;
    }
    public void setrollNo(int  rollNo)
    {
            this.rollNo = rollNo;

    }
     public char getdivision()
    {
        return division;
    }
    public void setdivision(char division)
    {
            this.division = division;

    }

     public String getdob()
    {
        return dob;
    }
    public void setdob(String dob)
    {
            this.dob = dob;

    }
    
    public String  toString()
    {       
        System.out.println("FirstName of the student is :" + super.getfirstName());
        System.out.println("MiddleName of the student is :" + super.getmiddleName());
        System.out.println("LastName of the student is :" + super.getlastName());
        System.out.println("Address of the student is :" + super.getaddress());
        System.out.println("Age of the student is :" + super.getage());
        return "RollNo of Student is :" + getrollNo() +"\n"
            + "Division of Student is :" + getdivision() +"\n"
            + "D.O.B of Student is :" + getdob();
            
    }
    public int compareTo(Student other) {
        return Integer.compare(this.rollNo, other.rollNo);
    }

    
    
}
