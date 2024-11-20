package assignment17;

/* QUESTION - 4- Define a class Coordinate with x and y as instance variables. Define
                 overloaded version of getDistance(), first with no argument calculating
                 distance from origin, second with one argument of Coordinate type to
                 calculate distance between two coordinates. Also define other methods if
                 required.
*/

public class Coordinate {
    // Instance variables representing the coordinates
    private double x;
    private double y;

    // Constructor to initialize the coordinates
    public Coordinate(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Overloaded method to calculate distance from the origin (0,0).
     * Formula: distance = √(x² + y²)
     */
    public double getDistance() {
        return Math.sqrt(x * x + y * y);
    }

    /**
     * Overloaded method to calculate distance between two points.
     * @param other The other Coordinate object.
     * Formula: distance = √((x2 - x1)² + (y2 - y1)²)
     */
    public double getDistance(Coordinate other) {
        double pointX = other.x - this.x; // Difference in x-coordinates
        double pointY = other.y - this.y; // Difference in y-coordinates
        return Math.sqrt((pointX * pointX) + (pointY * pointY));
    }

    /**
     * Override the toString() method to display coordinates as (x, y).
     */
    @Override
    public String toString() {
        return "(" + x + " , " + y + ")";
    }
}

// Test class to demonstrate functionality
class Test {
    public static void main(String[] args) {
        // Create two coordinate points
        Coordinate p1 = new Coordinate(2, 8); // Point 1 (x1 = 2, y1 = 8)
        Coordinate p2 = new Coordinate(3, 4); // Point 2 (x2 = 3, y2 = 4)

        // Calculate and display distance from the origin for Point 1
        System.out.println("Distance from origin = " + p1.getDistance());

        // Calculate and display distance between Point 1 and Point 2
        System.out.println("Distance between two points = " + p1.getDistance(p2));
    }
}
