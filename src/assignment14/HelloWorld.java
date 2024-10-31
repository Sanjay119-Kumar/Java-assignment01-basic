package assignment14;

/* QUESTION - 2 - Create a java file with a main class HelloWorld and another class A1. Also define a
                  java file with class B1 an B2 (both are non public classes). if there is way then 
                  Demonstrate how to access public method or class B1 and B2 from class A1.
                   
*/
public class HelloWorld{
    public static void main(String[] args) {
        System.out.println("This is main");

        //We create A1 instance for access non-public class B1 & B2 and public method b1() and b2()
        A1 obj = new A1();
        obj.callB1Method(); // call B1 method by A1 object
        obj.callB2Method(); // call B2 method by A1 object

    }

    //Class A1 behave as a intermediate class which access B1 and B2 public method (control Non-public class methods)
    static class A1{
        //Create method to access B1 public method
        public void callB1Method(){
            B1 obj = new B1(); // create object B1 class
            obj.b1(); // call B1  method b1() it is public
        }

        //Create method to access B1 public method
        public void callB2Method(){
            B2 obj = new B2(); // create object B2 class
            obj.b2(); // call B2 method b1() it is public
        }

    }

    //non-public class B1 --> default class which mean access only within package
    static class B1 {
        public void b1() { // public method
            System.out.println("Radhe - Radhe -B1-Method-Hai ");
        }
    }

    //non-public class B2 --> default class which mean access only within package
    static class B2{
        public void b2(){ // public method
            System.out.println("Jai Shree Ram -B2-Method-Hai");
        }
    }

}
