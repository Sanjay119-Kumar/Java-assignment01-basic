package assignment16.onlinelearningplatform;

/*
    QUESTION.3.-> Define two classes Learner and Admin to represent users of an online learning platform.
                  Implement the concept of generalization and introduce a superclass of Learner and Admin.
                  Take the liberty to decide the number of members of the classes.
 */

public class Users {
    // Private instance variables, accessible only within this class
    private int userId;
    private String userName;
    private String userEmail;

    // Constructor for initializing instance members
    public Users(int id, String name, String email) {
        this.userId = id; // Initialize user ID
        this.userName = name; // Initialize user name
        this.userEmail = email; // Initialize user email
    }

    // Getters and setters methods to access and modify private instance variables
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    // Public methods for user login and logout on the platform
    public void loginUser() {
        System.out.println(getUserName() + " successfully logged in.");
    }

    public void logoutUser() {
        System.out.println(getUserName() + " logged out successfully.");
    }
}
// Subclass of Users
class Learners extends Users {
    private String courseEnrolled; // Private variable for the course the learner is enrolled in

    // Constructor to initialize superclass and subclass instance variables
    public Learners(int id, String name, String email, String courseEnrolled) {
        super(id, name, email); // Call to the superclass constructor
        this.courseEnrolled = courseEnrolled; // Initialize the courseEnrolled variable
    }

    // Getters and setters methods to access and modify private instance variables
    public String getCourseEnrolled() {
        return courseEnrolled;
    }

    public void setCourseEnrolled(String courseEnrolled) {
        this.courseEnrolled = courseEnrolled;
    }

    // Public method for learners to study a course
    public void study() {
        System.out.println(getUserName() + " is studying " + courseEnrolled);
    }

    // Public method to show learner details
    public void showLearnerDetail() {
        System.out.println("--------------------Learner Details--------------" + "\n" +
                "Learner ID: " + getUserId() + "\n" +
                "Name: " + getUserName() + "\n" +
                "Email: " + getUserEmail() + "\n" +
                "Enrolled Course: " + courseEnrolled
        );
    }
}
class Admin extends Users {
    private String adminRole; // Private variable for the admin's role

    // Constructor to initialize superclass and subclass instance variables
    public Admin(int id, String name, String email, String adminRole) {
        super(id, name, email); // Call to the superclass constructor
        this.adminRole = adminRole; // Initialize the adminRole variable
    }

    // Getters and setters methods to access and modify private instance variables
    public String getAdminRole() {
        return adminRole;
    }

    public void setAdminRole(String adminRole) {
        this.adminRole = adminRole;
    }

    // Public method for admins to manage the platform
    public void managePlatform() {
        System.out.println(getUserName() + " is managing the platform perfectly as " + adminRole);
    }
}
