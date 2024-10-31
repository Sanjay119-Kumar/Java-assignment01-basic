package assignment14;

/* QUESTION - 5
   - Define a box class with private member variables length, breadth, and height.
   - Also define protected member variables volume and surfaceArea.
   - Provide setter and getters.
   - Provide methods to calculate volume and surface area.
   - Write main class in the same package to access Box class and display area and volume of a box.
   - Volume = Length × Width × Height
   - Surface area = 2(lw+wh+lh)
*/

public class Box {
    // Private member variables
    private float length, breadth, height;

    // Protected member variables
    protected float volume, surfaceArea;

    // Getter for length
    public float getLength() {
        return length;
    }

    // Getter for breadth
    public float getBreadth() {
        return breadth;
    }

    // Getter for height
    public float getHeight() {
        return height;
    }

    // Getter for volume
    public float getVolume() {
        return volume;
    }

    // Getter for surfaceArea
    public float getSurfaceArea() {
        return surfaceArea;
    }

    // Setter for length
    public void setLength(float length) {
        this.length = length;
    }

    // Setter for breadth
    public void setBreadth(float breadth) {
        this.breadth = breadth;
    }

    // Setter for height
    public void setHeight(float height) {
        this.height = height;
    }

    // Setter for volume
    public void setVolume(float volume) {
        this.volume = volume;
    }

    // Setter for surfaceArea
    public void setSurfaceArea(float surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    // Method to calculate volume
    public void calculateVolume(){
        this.volume = length * breadth * height;
    }

    // Method to calculate surface area
    public void calculateSurfaceArea(){
        this.surfaceArea = 2 * (length * breadth + breadth * height + height * length);
    }

    // Method to display box details
    public void displayBoxDetails(){
        System.out.println(
                "Length = " + length + "\n" +
                        "Breadth = " + breadth + "\n" +
                        "Height = " + height + "\n"
        );
    }

    // Method to print calculated results
    public void printResult(){
        System.out.println("Volume of box = " + volume + "\n" +
                "Surface area = " + surfaceArea + "\n"
        );
    }
}

// Main class to test Box class
class Main {
    public static void main(String[] args) {
        // Creating an instance of Box
        Box box1 = new Box();

        // Setting dimensions of the box
        box1.setLength(1.0f);
        box1.setBreadth(2.0f);
        box1.setHeight(3.0f);

        // Calculating volume and surface area
        box1.calculateVolume();
        box1.calculateSurfaceArea();

        // Displaying box details and calculated results
        box1.displayBoxDetails();
        box1.printResult();
    }
}
