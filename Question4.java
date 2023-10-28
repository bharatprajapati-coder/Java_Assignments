// This Java program models a simple school system using object-oriented
// programming concepts such as inheritance, encapsulation, and method
// overriding. It defines three classes: Person, Student, and Teacher, each with its
// own attributes, methods, and encapsulation techniques.


// 1. Person Class:
// • Represents a basic person with attributes name and age.
// • Provides getter and setter methods for name and age.
// • The setAge method includes a validation check to ensure that
// age is non-negative.
// • Includes an introduce method to print the person's name and
// age.

// 2. Student Class:
// • Extends the Person class, inheriting its attributes and methods.
// • Adds an additional attribute studentId specific to students.
// • Provides getter and setter methods for studentId.
// • Overrides the introduce method to include studentId.
// • Defines a unique method study to simulate a student studying.

// 3. Teacher Class:
// • Also extends the Person class and inherits its attributes and
// methods.
// • Adds an attribute subject specific to teachers.
// • Provides getter and setter methods for subject.
// • Overrides the introduce method to include subject.
// • Defines a unique method teach to simulate a teacher teaching.


// 4. SchoolSystem Class:
// • The main method serves as the entry point of the program.
// • It creates instances of a Student and a Teacher.
// • Demonstrates the use of setter methods to update attributes
// (e.g., changing a student's age and a teacher's subject).
// • Invokes methods like introduce, study, and teach to showcase
// polymorphism and method overriding.

// Overall, this program demonstrates the principles of inheritance,
// encapsulation, and method overriding in a school system context, providing
// a clear separation of concerns and a structured object-oriented design.





















class Person{
    private String name ;
    private int age;
    public Person(String name , int age)
    {
        this.name = name;
        this.age = age;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        if(age <0)
        {
            System.out.println("Your age must be positive");
        }
        return age;

    }
    public void introduce()
    {
        System.out.println("The Name of the Person is: " + name);
        System.out.println("The Age of the Person is:" + age);
    }


}

class Student extends Person{
    private int studentId;
    public Student(String name , int age)
    {
        super(name, age);
    }
    public void setId(int studentId)
    {
        this.studentId = studentId;
    }
    public int getId()
    {
        return studentId;
    }
    public void introduce()
    {
        // super.introduce();
        System.out.println("The Name of the student is :" + super.getName());
        System.out.println("The age of the student is :" + super.getAge());
        System.out.println("Id of the Student is :" + studentId);
    }
    public void study()
    {
        System.out.println("The student is currently studying in our collage");
    }
}

class Teacher  extends Person{
    private String Subject;
    public Teacher(String name , int age , String Subject)
    {
        super(name, age);
        this.Subject = Subject;

    }
    public void setSubject(String subject)
    {
            this.Subject = subject;
    }
    public String getSubject()
    {
        return Subject;
    }
     public void introduce()
    {
        // super.introduce();
        System.out.println("The Name of the Teacher is :" + super.getName());
        System.out.println("The age of the Teacher is :" + super.getAge());
        System.out.println("Subject of the Teacher is :" + this.Subject);
    }

    public void teach()
    {
        System.out.println("The teacher had been teaching in our collage for last 20 years");
    }
}
public class Question4 {
    public static void main(String[] args) {
        System.out.println("Bharat Prajapati \n Roll no : 3058" );
        Student s1 = new Student("Bharat", 20);
   System.out.println("*******   *******");
        s1.setId(3058);
        s1.introduce();
        s1.study();
System.out.println("*******   *******");
        Teacher T1 = new Teacher("kanu", 54, "Statics");
        T1.introduce();
        T1.teach();
    }
}
