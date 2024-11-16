package assignment16.onlinelearningplatform;

public class CheckUsers {
    public static void main(String[] args) {
        // Creating a Learner object
        Learners l1 = new Learners(1, "Sanjay", "example@gmail.com", "Java");

        // Testing the login functionality
        l1.loginUser();

        // Testing the study functionality
        l1.study();

        // Testing the logout functionality
        l1.logoutUser();

        // Displaying learner details
        l1.showLearnerDetail();
    }
}
