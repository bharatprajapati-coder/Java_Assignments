package MCA;

public class Student{
    private int Student_id;
    private String Student_name;
    private String address;
    int[] marks = new int[3];
    private String Grade;
    public Student(int Student_id , String Student_name , String address , int[] marks )
    {
        this.Student_id = Student_id;
        this.Student_name = Student_name;
        this.address = address;
        this.marks = marks;
        Cal_grade();
    }
    public void Cal_grade()
    {
        double average = marks[0] + marks[1] + marks[2] /3.0;
        if (average > 90) {
            Grade = "A+";
        } else if (average > 80) {
            Grade = "A";
        } else if (average > 70) {
            Grade = "B+";
        } else if (average > 60) {
            Grade = "B";
        } else if (average > 50) {
            Grade = "C";
        } else {
            Grade = "C";
        }
    }

    public String toString() {
        return "Student ID: " + Student_id +
               "\nStudent Name: " + Student_name +
               "\nAddress: " + address +
               "\nGrade: " + Grade;
    }



    
}