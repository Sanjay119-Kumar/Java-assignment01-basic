package lectureExamples;

public class ObjectClassDemo {
    private int real;
    private int image;

    public void setComplex(int r, int i){
        real=r;
        image=i;
    }
    public void showComplex(){
        System.out.println("Real= " +real + " image= " + image);
    }
    public String toString(){
        return " " +real +" " +image +"i";
    }
    public boolean equals(ObjectClassDemo c){
        if (real==c.real && image==c.image)
            return true;
        return false;
    }
}


class CheckComplex{
    public static void main(String[] args) {
        ObjectClassDemo complexNumber1 = new ObjectClassDemo();
        ObjectClassDemo complexNumber2 = new ObjectClassDemo();
        complexNumber1.setComplex(4,6);
        complexNumber2.setComplex(4,6);
        //complexNumber.showComplex();

        //Example of toString()-Object class meth0d
        System.out.println(complexNumber1);// so here implicitly call Object class toString() jiske karn its return some string value

        //Example of equals() use for compare objects references -Object class meth0d
        System.out.println(complexNumber1.equals(complexNumber2)); // its given random answer so do not trust it equal() So override it own your quirnment

        //Example of getClass() / getName() - Object class meth0d
        System.out.println(complexNumber1.getClass()); // return class name
        System.out.println(complexNumber1.getClass().getName()); // return class only

        // Example of finalize() --> its just like a destructor - when object is garbage block eligible then its executed its also a Object class method

    }
}