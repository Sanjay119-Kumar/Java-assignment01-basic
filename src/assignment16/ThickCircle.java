package assignment16;

public class ThickCircle extends Circle{
    private float thickNess;

    public ThickCircle(float radius, float thickNess){
        super(radius);
        this.thickNess=thickNess;
    }

    public float getThickNess() {
        return thickNess;
    }

    public void setThickNess(float thickNess) {
        this.thickNess = thickNess;
    }

    // calculate thickness of circle
    public float getOuterRadius(){
        return (float) getRadius() + thickNess;
    }

    // Calculate Total area of outer Circle
    public float calculateTotalAreaOfOuterCircle(){
        float outerArea = getOuterRadius();
        return (float) (Math .PI * outerArea * outerArea);
    }

    //calculate Hollow Space between outer and inner areas of circles
    public float calculateHollowSpace(){
        float innerArea = calculateAreaOfCircle();
        float outerArea = calculateTotalAreaOfOuterCircle();
        return outerArea-innerArea;
    }



}
