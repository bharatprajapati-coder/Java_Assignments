class User{
    private String userName;
    private String email;
       public User(String userName , String email)
       {
        this.userName = userName;
        this.email = email;
       } 
       public String getuserName()
       {
        return userName;
       }
       public String getEmail()
       {
        return email;
       }
}

class Professor extends User{
   private String Department;
   public Professor(String userName , String email , String Department)
   {
        super(userName, email);
        this.Department = Department;

   }
   public String getDepartment()
   {
    return Department;

   } 
}
class Course{
    private int code;
    private String name;
    private int CreditHours;
   public Course(int code , String name , int CreditHours)
   {
    this.code = code;
    this.name = name;
    this.CreditHours = CreditHours;
    
   }
    public int getcode()
    {
        return code; 
    }
    public String  getName()
    {
        return name;
    }
    public int getCreditHours()
    {
        return CreditHours;
    }

}
class Department {
    private String department_name;
    private Professor professor1;
    private Course course1;
    public Department(String department_name  )
    {
        this.department_name =department_name ;
    }
    public void setprofessor1(Professor professor)
    {
        this.professor1 = professor;
    }
    public void  setcourse1(Course course)
    {
        this.course1 = course;
    }
    public String getDepartment()
    {
        return department_name;
    }
    public String getProfessorUsernmae()
    {
        return professor1.getuserName();
    }
    public String getProfessorEmaill()
    {
        return professor1.getEmail();
    }
    public int getCourseCode()
    {
        return course1.getcode();
     }
     public String getCourseName()
     {
        return course1.getName();
     }
     public int getCourseHours()
     {
        return course1.getCreditHours();
     }


}


public class Question5 {
    public static void main(String[] args) {
        System.out.println("Bharat Prajapati \n Roll no : 3058" );
        Professor p1 = new Professor("ksfac120", "ks123@gmail.com", "Computer_science");
        Course c1 = new Course(105, "MSC.IT", 5);
        Department d1 = new Department("Computer_science");
        d1.setprofessor1(p1);
        d1.setcourse1(c1);    

            System.out.println("Department Name is : " + d1.getDepartment());
            System.out.println("Professor's user  name is: "+d1.getProfessorUsernmae());
            System.out.println( "Professor's email is: "+  d1.getProfessorEmaill());
            System.out.println("Course code is:  "+ d1.getCourseCode());
            System.out.println("Course Name is: "+ d1.getCourseName());
            System.out.println("Course credit hours are: "+ d1.getCourseHours());
    }
}
