package lectureExamples;

/* Example: Define a class Person and Subclass Employee.
   Create constructors in both the classes to demonstrate inheritance. */
public class ConstructorInInheritance {
    private String name;
    private int age;
    private long phone;

    // Default (no-argument) constructor
    public ConstructorInInheritance() {
        System.out.println("Constructor: Parent class (no-argument)");
    }

    // Parameterized constructor
    public ConstructorInInheritance(int n) {
        System.out.println("Constructor: Parent class (int n)");
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }
}

// Subclass
class EmployeeAll extends ConstructorInInheritance {
    private double salary;
    private String role;

    // Default constructor
    // Explicitly calls the parent class's default constructor using super()
    public EmployeeAll() {
        super(); // Call parent class default constructor
        System.out.println("Constructor: Child class (no-argument)");
    }

    // Parameterized constructor
    // Explicitly calls the parent class's parameterized constructor using super()
    public EmployeeAll(int k) {
        super(10); // Call parent class parameterized constructor
        System.out.println("Constructor: Child class (int k)");
    }

    // Getters and setters
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

// Main class to test constructors
class TestConstructors {
    public static void main(String[] args) {
        // Create an Employee object with the parameterized constructor
        EmployeeAll e1 = new EmployeeAll(5);
        // Output:
        // Constructor: Parent class (int n)
        // Constructor: Child class (int k)
    }
}
