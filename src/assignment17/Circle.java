
                                /* Assignment - 17 - Overloading and Overriding */

package assignment17;

/*
    QUESTION - 1 - Define a java class Circle with radius as instance variable and setRadius()
                   getRadius(), getArea() as instance methods. Define a class ThickCircle as a
                   subclass of Circle with thickness as instance variable and getThickness(),
                   setThickness() as instance methods. Provide an overridden method getArea()
                   to calculate area of thick portion of circle.
*/

public class Circle {

    // Private instance variable for radius
    private double radius;

    // Getter method for radius
    public double getRadius() {
        return radius;
    }

    // Setter method for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate and return the area of the circle
    public double getArea() {
        return (Math.PI * radius * radius);
    }
}
class ThickCircle extends Circle {

    // Private instance variable for thickness
    private double thickness;

    // Getter method for thickness
    public double getThickness() {
        return thickness;
    }

    // Setter method for thickness
    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    // Method to calculate and return the outer radius
    public double getOuterRadius() {
        return thickness + getRadius();
    }

    // Method to calculate and return the total area of the thick circle
    public double totalAreaOfCircle() {
        return Math.PI * getOuterRadius() * getOuterRadius();
    }

    // Overridden method to calculate the area of the thick portion of the circle
    @Override
    public double getArea() {
        double outerArea = totalAreaOfCircle();
        double innerArea = super.getArea();
        return outerArea - innerArea;
    }
}
class TestCircle {
    public static void main(String[] args) {
        // Create a ThickCircle object
        ThickCircle c1 = new ThickCircle();

        // Set radius and thickness
        c1.setRadius(2.0);
        c1.setThickness(1.0);

        // Print the radius, outer radius, total area, and thick portion area
        System.out.println("Radius = " + c1.getRadius() + "\n" +
                "Outer Radius = " + c1.getOuterRadius() + "\n" +
                "Total Area = " + c1.totalAreaOfCircle() + "\n" +
                "Thick Portion Area = " + c1.getArea() // Area of thick portion
        );
    }
}
