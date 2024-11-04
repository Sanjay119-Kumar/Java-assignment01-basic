
package lectureExamples;

// Singleton Class Example
public class BodyGuard {

    private String name;

    // Static variable for single object
    private static BodyGuard guard;

    // Getter for the guard's name
    public String getGuard() {
        return name;
    }

    // Setter for the guard's name
    public void setGuard(String guard) {
        this.name = guard;
    }

    // Private constructor
    private BodyGuard(String n) {
        name = n;
    }

    // Create method for getting the singleton class instance
    public static BodyGuard getInstance() {
        if (guard == null) {
            guard = new BodyGuard("Shera");
        }
        return guard;
    }
}

class TestExample {
    public static void main(String[] args) {
        BodyGuard instance = BodyGuard.getInstance();
        System.out.println("Start wala guard: " + instance.getGuard());

        instance.setGuard("Bahadur");

        System.out.println("Singleton Object = " + instance + "\nName of updated guard: " + instance.getGuard());
    }
}

