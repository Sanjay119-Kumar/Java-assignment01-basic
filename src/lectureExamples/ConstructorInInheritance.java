package lectureExamples;

/* example - Define a class Person and Subclass Employee. Create constructors both the classes */
public class ConstructorInInheritance {
    private String name;
    private int age;
    private long phone;

    // non-parameterized constructor
    public ConstructorInInheritance(){
        System.out.println("Constructor : Parent class ");
    }
    // parameterized constructor
    public ConstructorInInheritance(int n){
        System.out.println("Constructor : Parent class(int n) ");
    }


    // getters and setters
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

//SubClass
class EmployeeAll extends ConstructorInInheritance{
    private double salary;
    private String role;

    // provide default constructor jo call krta hai parent ke default or no argument wale constructor ko??

    // create manually default constructor jo call krega parent class ke default constructor ko by super()
    public EmployeeAll(){
        super(); // always write in first line
        System.out.println("Constructor : Child class");

    }
    // parameterized constructor jo call krega parent class ke parameterized or non parameterized base on super()
    // if pass agr in super then parameterized constructor call of parent class if no pass any argument
    // then simple call default constructor of parent class constructor ko by super()
    public EmployeeAll(int k){
        super(10); // always write in first line
        System.out.println("Constructor : Child class(int k)");

    }


    // getters and setters
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

//main class
class TestConstructors{
    public static void main(String[] args) {
        EmployeeAll e1 = new EmployeeAll(5);

    }
}