package MyPackage;

public class Person{
    private String firstName;
    private String middleName;
    private String lastName;
    private String  address;
    private int age;

    public String getfirstName()
    {
        return firstName;
    }
    public void setfirstName(String firstName)
    {
            this.firstName = firstName;

    }
     public String getmiddleName()
    {
        return middleName;
    }
    public void setmiddleName(String middleName)
    {
            this.middleName = middleName;

    }

     public String getlastName()
    {
        return lastName;
    }
    public void setlastName(String lastName)
    {
            this.lastName = lastName;

    }
      public String getaddress()
    {
        return address;
    }
    public void setaddress(String address)
    {
            this.address =  address;

    }
       public int getage()
    {
        return age;
    }
    public void setage(int age)
    {
            this.age =  age;
    }
    public String  toString()
    {
      return "First name of person is " + getfirstName() +"\n"
         + "Middle name of person is " + getmiddleName() +"\n"
          + "last name of person is " + getlastName() + "\n"
           + "Address of person is " + getaddress() +"\n"
             + "Age  of person is " + getage();
    }

    
    
}