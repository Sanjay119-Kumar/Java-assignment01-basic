package assignment14;

/*QUESTION - 3 - Create a java file with a public class Circle (with private data member radius)
                 Which provides public methods to calculate area and circumference of circle
                 along with setter and getter . Create another java file containing the main
                 class. Create instance of Circle class in the main method and set radius of
                 circle. Display are and circumference of circle.
 */


public class Circle {
    private float radius; // private radius means only access Circle class

    //setter and getters
    public void setRadius(float radius){
        this.radius = radius;
    }
    public float getRadius(){
        return radius;
    }

    // public method to calculate area and circumference of circle
    public float calculateAreaOfCircle(){
        return (float) (Math.PI*radius*radius);
    }
    public float calculateCircumferenceOfCircle(){
        return (float) (2*Math.PI*radius);
    }
    // methods to display out put
    public void displayArea(){
        System.out.println("Area of Circle = " + calculateAreaOfCircle());
    }
    public void displayCircumference(){
        System.out.println("Circumference of Circle = " + calculateCircumferenceOfCircle());
    }
}
class Test{
    public static void main(String[] args) {
        //instantiation of Circle class
        Circle circle1 = new Circle();

        circle1.setRadius(2.0f);//set radius by setter method
        circle1.displayArea();// call public method

        circle1.setRadius(3.0f);
        circle1.displayCircumference();
    }
}