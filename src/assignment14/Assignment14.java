
                    /*        Assignment - 14 - Access Modifiers  */

package assignment14;

public class Assignment14 {

    /* QUESTION - 1- Define a java class person with private instance variables name and age
                     Demonstrate how can access instance variables of person from main class.

    */
      static class Person{
        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        private String name;
        private int age;
    }


}

