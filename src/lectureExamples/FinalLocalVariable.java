package lectureExamples;

import java.util.Scanner;

public class FinalLocalVariable {
    final private int x;
    final static private int p;

    // how to take input from user for final instance variable
    public FinalLocalVariable(int m){
        x=m;
    }
    public void printX(){
        System.out.println("X=" + x);
    }

    // how to take input from user for static variables
    static
    {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        p= sc.nextInt();
    }
    public void printP(){
        System.out.println("P=" + p);
    }

    // for final local variables
    public void printValue(){
        int x=1;
        final int y=10;
        System.out.println("x=" + x + " Y=" +y);
        x++;
        // y++; // this error cose final local variable value never change!!
        System.out.println("x="+ x + " y=" +y);
    }
}
class TestFinalLocalVariables{
    public static void main(String[] args) {
        FinalLocalVariable f1 = new FinalLocalVariable(27);
        f1.printP();
        f1.printX();
        f1.printValue();
    }


}