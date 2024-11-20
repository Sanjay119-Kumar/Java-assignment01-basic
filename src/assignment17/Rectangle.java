package assignment17;

/* QUESTION - 3 - Define a Rectangle class with length, breadth, and border colour as instance
                  variables. Provide instance methods setLength(), setBreadth(), setColour(),
                  getLength(), getBreadth(), getColour(), and printRectangleColour(). Create
                  a subclass FilledRectangle of rectangle class with colour (inside region of rectangle)
                  as instance variable. Provide setters and getters along with overridden method
                  printRectangleColour() to display border colour as well as filled colour.
*/

// Class Rectangle
public class Rectangle {

    // Private instance variable for length
    private double length;

    // Private instance variable for breadth
    private double breadth;

    // Private instance variable for border colour
    private String borderColour;

    // Getter method for length
    public double getLength() {
        return length;
    }

    // Setter method for length
    public void setLength(double length) {
        this.length = length;
    }

    // Getter method for breadth
    public double getBreadth() {
        return breadth;
    }

    // Setter method for breadth
    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    // Getter method for border colour
    public String getBorderColour() {
        return borderColour;
    }

    // Setter method for border colour
    public void setBorderColour(String borderColour) {
        this.borderColour = borderColour;
    }

    // Method to print border colour
    public void printRectangleColour() {
        System.out.println("Border colour: " + borderColour);
    }

    // Method to calculate the perimeter of the rectangle
    public double getPerimeter() {
        return 2 * (length + breadth);
    }

    // Method to calculate the area of the rectangle
    public double getArea() {
        return length * breadth;
    }
}

// Subclass FilledRectangle of Rectangle
class FilledRectangle extends Rectangle {

    // Private instance variable for region colour
    private String regionColour;

    // Getter method for region colour
    public String getRegionColour() {
        return regionColour;
    }

    // Setter method for region colour
    public void setRegionColour(String regionColour) {
        this.regionColour = regionColour;
    }

    // Overridden method to print border and filled colours along with perimeter and area
    @Override
    public void printRectangleColour() {
        System.out.println("Border colour: " + getBorderColour());
        System.out.println("Filled Colour: " + regionColour);
        System.out.println("Perimeter (border colour): " + getPerimeter());
        System.out.println("Area (region colour): " + getArea());
    }
}

// Test class to demonstrate functionality
class TestRectangle {
    public static void main(String[] args) {

        // Creating an instance of FilledRectangle
        FilledRectangle r1 = new FilledRectangle();

        // Setting the length of the rectangle
        r1.setLength(10.00);

        // Setting the breadth of the rectangle
        r1.setBreadth(5.00);

        // Setting the border colour of the rectangle
        r1.setBorderColour("Red");

        // Setting the region colour of the rectangle
        r1.setRegionColour("Yellow");

        // Printing the length and breadth of the rectangle
        System.out.println("Length: " + r1.getLength() + "\n" +
                "Breadth: " + r1.getBreadth());

        // Printing the colours, perimeter, and area
        r1.printRectangleColour();
    }
}
