
               /* Assignment - 18 - final , this , super ,constructor in inheritance*/

package assignment18;

               import assignment17.PersonQ5;

               /*
                      QUESTION-1- Define a Java class Person with name and age as instance variables. Provide parameterised constructor
                                  with two formal arguments name & age, to initialise instance variables.

               */
public class Person{
    private String name;
    private int age;

    public Person(String n, int a){
        this.name=n;
        this.age=a;
    }
}
