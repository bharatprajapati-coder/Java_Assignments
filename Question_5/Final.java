

// Interface Exam
interface Exam {
    boolean pass(int mark);
}

// Interface Classify
interface Classify {
    String division(int average);
}

// Class Result implementing both Exam and Classify
public class Final implements Exam, Classify {
    private int marks;
    private int average;

    public Final(int marks, int average) {
        this.marks = marks;
        this.average = average;
    }

    // Getters and Setters
    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    // Implementing the pass method from Exam interface
    @Override
    public boolean pass(int mark) {
        if (mark >= 50) {
            return true;
        } else {
            return false;
        }
    }

    // Implementing the division method from Classify interface
    @Override
    public String division(int average) {
        if (average >= 60) {
            return "First";
        } else if (average >= 50 && average < 60) {
            return "Second";
        } else {
            return "No division";
        }
    }

    // Override the toString() method
    @Override
    public String toString() {
        return "Result [marks=" + marks + ", average=" + average + "]";
    }

    public static void main(String[] args) {
        try {
            Final result = new Final(65, 55);

            // Using pass method
            boolean isPass = result.pass(result.getMarks());
            System.out.println("Pass: " + isPass);

            // Using division method
            String division = result.division(result.getAverage());
            System.out.println("Division: " + division);

            // Using toString method
            System.out.println(result);
        } catch (IllegalArgumentException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

