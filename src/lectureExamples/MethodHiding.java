package lectureExamples;

public class MethodHiding {
    public static void m1(){
        System.out.println("Super Class Method ");
    }
}
class Derive extends MethodHiding{
    public static void m1(){
        System.out.println("Child class Method");
    }
}
class CheckHiding{
    public static void main(String[] args) {
        Derive.m1();
        MethodHiding.m1();

    }
}