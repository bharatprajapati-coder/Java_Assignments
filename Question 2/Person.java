
package MyPackage;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    
    public Person(String firstName , String lastName  , int age)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        if(age < 0)
        {
            throw new IllegalArgumentException("Age must be positive");
        }
        this.age=  age;
    }
    public String getfirstName()
    {
        return firstName;
    }
    public void setfirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public String getlastName()
    {
        return lastName;
    }
    public void setlastName(String lastName)
    {
        this.lastName= lastName;
    }

    public int getage()
    {
        return age;
    }
    public void setage(int age)
    {
          
            this.age = age;

    }

    public void display()
    {
        System.out.println("First Name of the Person is " + getfirstName());
        System.out.println("Last Name of the Person is " + getlastName());
        System.out.println("Age of the Person is " + getage());
        
    }
}

