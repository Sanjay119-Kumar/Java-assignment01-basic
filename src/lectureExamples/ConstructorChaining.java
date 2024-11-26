package lectureExamples;

/* Example: Demonstrating Constructor Chaining in Java */
public class ConstructorChaining {
    private String name;
    private int age;
    private long phone;

    // Default (no-argument) constructor
    public ConstructorChaining() {
        System.out.println("Constructor: Parent class (no-argument)");
    }

    // Parameterized constructor with one argument
    public ConstructorChaining(int n) {
        System.out.println("Constructor: Parent class (int n)");
    }

    // Parameterized constructor with two arguments
    public ConstructorChaining(int x, int y) {
        this(); // Calls the default constructor in the same class
        System.out.println("Constructor: Parent class (int x, int y)");
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
class EmployeeChain extends ConstructorChaining {
    private double salary;
    private String role;

    // Default constructor
    // Calls the parameterized constructor of the same class using this()
    public EmployeeChain() {
        this(10); // Calls EmployeeChain(int k)
        System.out.println("Constructor: Child class (no-argument)");
    }

    // Parameterized constructor with one argument
    // Calls the parent class parameterized constructor using super()
    public EmployeeChain(int k) {
        super(20); // Calls ConstructorChaining(int n)
        System.out.println("Constructor: Child class (int k)");
    }

    // Parameterized constructor with two arguments
    // Calls the parent class parameterized constructor with two arguments
    public EmployeeChain(int x, int y) {
        super(10, 20); // Calls ConstructorChaining(int x, int y)
        System.out.println("Constructor: Child class (int x, int y)");
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

// Main class to test constructor chaining
class TestConstructorsChaining {
    public static void main(String[] args) {
        System.out.println("Creating EmployeeChain with default constructor:");
        EmployeeChain e1 = new EmployeeChain(); // Calls EmployeeChain()

        System.out.println("\nCreating EmployeeChain with one argument:");
        EmployeeChain e2 = new EmployeeChain(100); // Calls EmployeeChain(int k)

        System.out.println("\nCreating EmployeeChain with two arguments:");
        EmployeeChain e3 = new EmployeeChain(5, 10); // Calls EmployeeChain(int x, int y)
    }
}
//Subclass constructors always call the parent class constructor first.