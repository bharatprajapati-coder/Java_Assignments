import MCA.Subject;

import java.util.Scanner;

import MCA.Student;


public class Question8  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{

             System.out.println("Enter Student Information:");
            System.out.print("Student ID: ");
            int student_id = sc.nextInt();
            sc.nextLine();  // Consume the newline character
            System.out.print("Student Name: ");
            String student_name = sc.nextLine();
            System.out.print("Address: ");
            String address = sc.nextLine();
            System.out.print("Marks for 3 subjects (comma-separated): ");
            String marksStr = sc.next();
            int[] marks = parseMarks(marksStr);
            Student student = new Student(student_id, student_name, address, marks);
            
            System.out.println("Enter Subject Information:");
            System.out.print("Subject ID: ");
            int subject_id = sc.nextInt();
            sc.nextLine();  // Consume the newline character
            System.out.print("Subject Name: ");
            String subject_name = sc.nextLine();
            System.out.print("Is it an elective subject? (true/false): ");
            boolean elective = sc.nextBoolean();

            Subject subject = new Subject(student_id, student_name, address, marks, subject_id, subject_name, elective);
            System.out.println("\nStudent and Subject Information:\n" + subject);
            
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
        }
    

    private static int[] parseMarks(String marksStr) {
        String[] marksArray = marksStr.split(",");
        int[] marks = new int[3];
        for (int i = 0; i < 3; i++) {
            marks[i] = Integer.parseInt(marksArray[i]);
        }
        return marks;
    }

}
