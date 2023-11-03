
package MyPackage;
import MyPackage.Exam;
import MyPackage.Classify;

public class Result im Exam , Classify{
    private int marks ;
    private int average;
    public Result(int marks , int average)
    {
        this.marks  = marks;
        this.average = average;
    }
    public int getmarks()
    {
        return marks;

    }
    public void setmarks(int marks)
    {
        this.marks = marks;
    }
    public int getaverage()
    {
        return marks;

    }
    public void setaverage(int average)
    {
        this.average = average;
    }
    public boolean pass(int marks)
    {
        if(marks >= 50)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public String Division(int average)
    {
        if(average >= 60)
        {
            return "First";
        }
        else if(average >= 50 && average < 60)
        {
            return "Second";
        }
        else{
            return "No division";
        }
    }
    public String toString()
    {
     return "Result [marks= " + marks + ", average =" + average + "]";    
    }


    public static void main(String[] args)
    {
        try{
            Result  res = new Result(65, 51);
            boolean isPass = res.pass(res.getmarks());
            System.out.println("Pass = true/Fail = False :==: " + isPass);
            String division = res.Division(res.getaverage());
            System.out.println("Division: " + division);

            System.out.println(res);
    }catch(IllegalArgumentException e)
    {
        System.out.println("An error occured" + e.getMessage());
    }
    }
}
