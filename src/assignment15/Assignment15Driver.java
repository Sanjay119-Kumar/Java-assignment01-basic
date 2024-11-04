
                               /* Assignment - 15 - Constructor */


package assignment15;

public class Assignment15Driver {
    public static void main(String[] args) {

/*
        Q.1

        Person p1 = new Person(); // no argument constructor and constructor called automatically when we created object
        Person p2 = new Person("Demo Kumar"); // This is contained one argument as string(name). so it is parameterized constructor
        Person p3 = new Person(22);// This is also contained argument as integer(age) so it is parameterized constructor
        Person p4 = new Person("Kalua Bhai", 200);// This is also contained argument as String(name) and integer(age) so it is parameterized constructor




                Q.2

                // Creating Employee objects using different constructors
                Employee e1 = new Employee("Demo Bhaiya", 10000.0f); // using parameterized constructor with name and salary
                Employee e2 = new Employee("Demo", 1110000.0f); // using parameterized constructor with name and salary
                Employee e3 = new Employee(); // using non-parameterized constructor which prompts for input

                // Displaying Employee details
                e1.showEmployeeDetail(); // displays details of Employee e1
                e2.showEmployeeDetail(); // displays details of Employee e2
                e3.showEmployeeDetail(); // displays details of Employee e3



        Q.3

        // Create Box object using single-argument constructor
        Box b2 = new Box(1.0f); // Initializes Box with length = 1.0f, breadth and height default to 0.0f

        // Create Box object using three-argument constructor
        Box b3 = new Box(1.0f, 2.0f, 3.0f); // Initializes Box with length = 1.0f, breadth = 2.0f, height = 3.0f

        // Create Box object using no-argument constructor
        Box b1 = new Box(); // Initializes Box with length, breadth, and height all defaulting to 0.0f

        // Display the details of Box b3
        b3.showBox(); // Calls the method to display length, breadth, and height of Box b3




*/

                // Creating Customer objects using different constructors
                Customer c1 = new Customer(001, "Demo Bhai", 1234567891, "demo123@gmail.com"); // Using four-argument constructor
                Customer c2 = new Customer(002, "Kalua Bhai", 1234567891); // Using three-argument constructor

                // Displaying Customer information
                c1.showCustomerInformationWithFourArguments(); // Display details for Customer c1
                c2.showCustomerInformationWithThreeArguments(); // Display details for Customer c2











    }



}
