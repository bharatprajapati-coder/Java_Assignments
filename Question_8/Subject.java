package MCA;

import java.util.Scanner;
import MCA.Student;


public class Subject extends Student{
     private int subject_id;
    private String subject_name;
    private boolean elective;

    public Subject(int student_id, String student_name, String address, int[] marks, int subject_id, String subject_name, boolean elective) {
        super(student_id, student_name, address, marks);
        this.subject_id = subject_id;
        this.subject_name = subject_name;
        this.elective = elective;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nSubject ID: " + subject_id +
               "\nSubject Name: " + subject_name +
               "\nElective: " + (elective ? "Yes" : "No");
    }
}
