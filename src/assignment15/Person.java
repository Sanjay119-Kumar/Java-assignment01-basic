
                                  /* Assignment - 15 - Constructor */


package assignment15;



/*  QUESTION - 01 - Define a class Person with private instance members name and age. Provide four constructors in
                    the class , one with no arguments ,
                    second with name only as an argument ,
                    third with age as an argument and
                    fourth with name and age as an arguments.
 */
public class Person {
    private String name; // private member means accessible within class body
    private int age;

    //Constructor one with no arguments
    public Person(){
        System.out.print("This is first constructor  no argument --> " + "\n");
    }

    //Constructor second with name only as an argument
    public Person(String name){
        this.name=name;// assign instance
        System.out.print("This is second constructor  name only as an argument --> "  + name + "\n");
    }

    //Constructor third with age as an argument
    public Person(int age){
        this.age=age;
        System.out.print("This is constructor third with age as an argument --> "  + age + "\n");
    }

    //Constructor fourth with name and age as an arguments.
    public Person(String name, int age){
        this.name=name;
        this.age=age;
        System.out.print("This is constructor fourth with name and age as an arguments. --> "  + name + " " + age + "\n");
    }
}
