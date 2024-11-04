package assignment15;

/*  QUESTION - 04 - Define a class Time with private instance variables hr, min and sec.
                    Provide three constructors in the class:
                    first one takes no arguments,
                    second takes one argument as seconds, and
                    third takes three arguments: hours, minutes, and seconds
 */

public class Time {
    // Private instance variables for hours, minutes, and seconds
    private int hr, min, second;

    // Getter method for hours
    public int getHr() {
        return hr; // Returns the hours
    }

    // Setter method for hours
    public void setHr(int hr) {
        this.hr = hr; // Sets the hours
    }

    // Getter method for minutes
    public int getMin() {
        return min; // Returns the minutes
    }

    // Setter method for minutes
    public void setMin(int min) {
        this.min = min; // Sets the minutes
    }

    // Getter method for seconds
    public int getSecond() {
        return second; // Returns the seconds
    }

    // Setter method for seconds
    public void setSecond(int second) {
        this.second = second; // Sets the seconds
    }

    // No-argument constructor
    public Time() {
        // No initialization, default values (0, 0, 0)
    }

    // Single-argument constructor to initialize using total seconds
    public Time(int second) {
        this.hr = second / 3600; // Convert seconds to hours
        this.min = (second % 3600) / 60; // Convert remaining seconds to minutes
        this.second = second % 60; // Remaining seconds
    }

    // Three-argument constructor to initialize hours, minutes, and seconds
    public Time(int hr, int min, int second) {
        this.hr = hr; // Sets the hours
        this.min = min; // Sets the minutes
        this.second = second; // Sets the seconds
    }
}
