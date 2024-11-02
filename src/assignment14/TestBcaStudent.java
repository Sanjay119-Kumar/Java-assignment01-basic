package assignment14;

public class TestBcaStudent {
    public static void main(String[] args) {
        BcaStudent student = new BcaStudent("Sanjay Kumar", "BCA2024");

        // Accessing public, default, and protected methods
        System.out.println(student.getStudentName()); // Public method
        student.showCollegeId();                      // Default access within package
        System.out.println(student.getDepartment());   // Protected access within package

        // Displaying all student info (including private access internally)
        student.displayStudentInfo();
    }
}
