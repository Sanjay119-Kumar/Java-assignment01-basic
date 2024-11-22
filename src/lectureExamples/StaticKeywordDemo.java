package lectureExamples;

public class StaticKeywordDemo {
   // static private int k; // by default value =0

   // final static private int k; // compile time error

   // final static private int k = 10; // 10 --> during Declaration+initialization final static variable

    final static private int k;//100

    // initialize final static variable using static block
    static
    {
        k=100;
    }


    public static void printK(){
        System.out.println("K=" + k);
    }
}
class CheckStaticFinalK{
    public static void main(String[] args) {
        StaticKeywordDemo.printK();
    }
}