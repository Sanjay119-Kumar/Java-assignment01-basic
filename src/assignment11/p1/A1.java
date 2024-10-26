
/*Question-5 Create two java files A1.java and B1.java , A1 is a main class.
  A1 and B1 resides in different packages p1 and p2 respectively
  Define a method in fb1() in B1 class which prints hello. Instantiate
  B1 class in main method of A1 class and invoke fb1() method.

*/

package assignment11.p1;

import assignment11.p2.B1;

public class A1 {
    public static void main(String[] args) {
        B1 b1=new B1();
        b1.fb1();


    }
}
