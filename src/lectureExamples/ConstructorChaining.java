package lectureExamples;

public class ConstructorChaining {
    private String name;
    private int age;
    private long phone;

    // non-parameterized constructor
    public ConstructorChaining(){
        System.out.println("Constructor : Parent class ");
    }
    // parameterized constructor
    public ConstructorChaining(int n){
        System.out.println("Constructor : Parent class(int n) ");
    }
    // parameterized constructor
    public ConstructorChaining(int x,int y){
        this();
        System.out.println("Constructor : Parent class(int x , int y) ");
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
class EmployeeChain extends ConstructorChaining{
    private double salary;
    private String role;

    // provide default constructor jo call krta hai parent ke default or no argument wale constructor ko??

    // create manually default constructor jo call krega parent class ke default constructor ko by super()
    public EmployeeChain(){
        this(10); // always write in first line
        System.out.println("Constructor : Child class");

    }
    // parameterized constructor jo call krega parent class ke parameterized or non parameterized base on super()
    // if pass agr in super then parameterized constructor call of parent class if no pass any argument
    // then simple call default constructor of parent class constructor ko by super()
    public EmployeeChain(int k){
         super(20);// always write in first line
        System.out.println("Constructor : Child class(int k)");

    }
    public EmployeeChain(int x,int y){
        super(10,20); // always write in first line
        System.out.println("Constructor : Child class(int x, int y)");

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
class TestConstructorsChaining{
    public static void main(String[] args) {
        EmployeeChain e1 = new EmployeeChain();
        EmployeeChain e3 = new EmployeeChain(100);
        EmployeeChain e2 = new EmployeeChain(5,10);

    }
}

