package assignment16;

/*
 QUESTION.4.-> Define a java class Circle with radius as instance variable. Provide setters and
               getters. Also define methods to calculate area of circle. Create a ThickCircle
               as a subclass of Circle with instance variable thickness. Define method to calculate
               thickness area of circle and hollow space area of circle
 */
public class Circle {
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }


    // setters getters for private instance modification
    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    //define methods to calculate area of circle.
    public float calculateAreaOfCircle(){
        return (float) (Math.PI * radius * radius);
    }

    //define methods to Show area of circle.
    public void showAreaOfCircle(){
        System.out.println("Area Of Circle = " + calculateAreaOfCircle());
    }
}

class CheckCircle{
    public static void main(String[] args) {
        ThickCircle thickCircle1 = new ThickCircle(5.0f,2.0f);
        System.out.println("Radius = " +  thickCircle1.getRadius() + "\n" +
                "Thickness of circle = " + thickCircle1.getThickNess() + "\n" +
                "Outer Radius = " + thickCircle1.getOuterRadius() + "\n" +
                "area of inner area = " + thickCircle1.calculateAreaOfCircle()+ "\n" +
                "Calculate total area = " + thickCircle1.calculateTotalAreaOfOuterCircle() + "\n" +
                "Calculate hollowSpace between circles = " + thickCircle1.calculateHollowSpace()

        );


    }
}