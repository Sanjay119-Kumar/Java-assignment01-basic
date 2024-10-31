package assignment14;
/*QUESTION - 4 - Define a class Employee with default accessibility of instance variables
                 empid name and salary. Provide setter and getter in the class. Also define
                 main class in the same package to access Employee class
 */

// default Employee class which means it only access withing the package
class Employee {
    int empid;
    String name;
    float salary;

    public int getEmpid() {
        return empid;
    }

    public String getName() {
        return name;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }


}
public class TestMain{
    public static void main(String[] args) {

        // instantiation of Employee class
        Employee employee1 = new Employee();
        employee1.setEmpid(101); // set values in default data members by setter method
        employee1.setName("Demo");
        employee1.setSalary(12000.0f);

        System.out.println("**************Employees Details************" + "\n"
                + "Employee id = " + employee1.getEmpid() + "\n"
                + "Employee name = " + employee1.getName() + "\n"
                + "Employee salary = " + employee1.getSalary() + "\n"

        );
        System.out.println(employee1.getClass());

    }
}
