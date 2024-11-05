package lectureExamples;

// Class definition for DefaultConstructor
class DefaultConstructor {
    String studentName; // Instance variable for student name, default value is null
    int studentRollNo;  // Instance variable for student roll number, default value is 0
}

// Class definition for TestDefaultConstructor which contains the main method
class TestDefaultConstructor {
    public static void main(String[] args) {
        // Creating an instance of DefaultConstructor class
        DefaultConstructor s1 = new DefaultConstructor(); // Default constructor is called automatically

        // Printing the default values of the instance variables
        System.out.println("Student name : " + s1.studentName + "\n" + "Student roll no. : " + s1.studentRollNo);

    }
}
