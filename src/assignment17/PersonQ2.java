package assignment17;

/*
    QUESTION - 2 - Define a class Person with name and age as instance variables.
                   Define three overloaded versions of setPerson() in the class as instance methods.
                   The first version takes name only, the second version takes age only,
                   and the third version takes both.
*/

public class PersonQ2 {

    // Instance variables for name and age
    private String name;
    private int age;

    // Overloaded method to set the person's name
    public void setPerson(String name){
        this.name = name;
    }

    // Overloaded method to set the person's age
    public void setPerson(int age){
        this.age = age;
    }

    // Overloaded method to set both the person's name and age
    public void setPerson(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Overriding the toString() method to print the person's details
    @Override
    public String toString() {
        return "Person {name = " + name + ", age = " + age +"}";
    }
}
class IdentifyPerson {
    public static void main(String[] args) {
        // Create the first Person object and set the name
        PersonQ2 p1 = new PersonQ2();
        p1.setPerson("Demo");
        System.out.println(p1);

        // Create the second Person object and set the age
        PersonQ2 p2 = new PersonQ2();
        p2.setPerson(22);
        System.out.println(p2);

        // Create the third Person object and set both name and age
        PersonQ2 p3 = new PersonQ2();
        p3.setPerson("Bhai", 20);
        System.out.println(p3);
    }
}
