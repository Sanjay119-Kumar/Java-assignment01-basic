package lectureExamples;

// Class definition for ParameterizedConstructor
public class ParameterizedConstructor {
    // Instance variables
    String studentName; // Variable to hold the student's name, default value is null
    int studentId; // Variable to hold the student's ID, default value is 0
    String course; // Variable to hold the course name, default value is null

    // Parameterized constructor to initialize instance variables
    public ParameterizedConstructor(String n, int i, String c) {
        this.studentName = n; // Assign the provided name to studentName
        this.studentId = i; // Assign the provided ID to studentId
        this.course = c; // Assign the provided course name to course
    }
}

// Class definition for TestParameterizedConstructor containing the main method
class TestParameterizedConstructor {
    public static void main(String[] args) {
        // Creating an instance of ParameterizedConstructor class using parameterized constructor
        ParameterizedConstructor s1 = new ParameterizedConstructor("Demo Bhai", 01, "BCA");

        // Printing the values of instance variables
        System.out.println("Student Name: " + s1.studentName + "\n" +
                "Student Id: " + s1.studentId + "\n" +
                "Course: " + s1.course);

    }
}
