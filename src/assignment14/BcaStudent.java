/*

                    */
/*        Assignment - 14 - Access Modifiers  *//*


package assignment14;

public class Assignment14 {

    */
/* QUESTION - 1- Define a java class person with private instance variables name and age
                     Demonstrate how can access instance variables of person from main class.

    *//*

      static class Person{
        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        private String name;
        private int age;
    }


}

*/
// BcaStudent.java
package assignment14;

public class BcaStudent {

    // Private: Only this class can access this data
    private String personalEmail = "student123@personalmail.com";

    // Default (Package-private): Accessible within the same package
    String collegeId;

    // Protected: Accessible within the same package or by subclasses in other packages
    protected String department = "Computer Applications";

    // Public: Accessible from anywhere
    public String name;

    // Constructor to set up the student's info (public so anyone can create a student)
    public BcaStudent(String name, String collegeId) {
        this.name = name;
        this.collegeId = collegeId;
    }

    // Public method: Any class can call this to get the student’s name
    public String getStudentName() {
        return "Student Name: " + name;
    }

    // Protected method: Accessible by classes in the package and subclasses in other packages
    protected String getDepartment() {
        return "Department: " + department;
    }

    // Private method: Only the BcaStudent class can access this
    private String getPersonalEmail() {
        return "Personal Email: " + personalEmail;
    }

    // Default (Package-private): Accessible within the college package
    void showCollegeId() {
        System.out.println("College ID: " + collegeId);
    }

    // Method to display all info for internal use
    public void displayStudentInfo() {
        System.out.println(getStudentName());
        System.out.println(getDepartment());
        System.out.println("College ID: " + collegeId);
        // Accessing private method within the class
        System.out.println(getPersonalEmail());
    }
}


