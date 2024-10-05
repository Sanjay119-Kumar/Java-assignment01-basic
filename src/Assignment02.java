public class Assignment02 {
    public static void p1(){
        int number = 118;
        int unitDigit = number%10;
        System.out.println(unitDigit);
    }
    public static int p2(){
        int number = 119;
        return number/10;
    }
    public static void p3(){
        int a = 5, b = 10;
        int temp = a;
        a=b;
        b=temp;
        System.out.println("a= " + a + " b= " + b);
    }
    public static void p4(){
        int a = 5, b = 10;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a= " + a + " b= " + b);
    }
    /* Q.5. how to identify value type variable or nullable type variable
       ANS->

        Value type variable = primitive data types
        Nullable type variable = objects , short , string , wrapper classes, string etc, references

     */
    public static void p6(){
        //float x = 3.4; by default double cose higher prisidense
        float x = 3.4f;

    }
    public static void p7(){
        int num1 = 35;
        int num2 = 83;
        int output = num1 & num2;
        System.out.println("AND= " + output);
    }
    public static void p8(){
        int num1 = 47;
        int num2 = 29;
        int output = num1 | num2;
        System.out.println("OR= " + output);
    }
    public static void p9(){
        int num1 = 76;
        int num2 = 108;
        int output = num1 ^ num2;
        System.out.println("XOR= " + output);
    }
    public static void p10(){
        int num = 576;
        int lastNumber =  (num % 10);
        int removeLastNumber = num/10;
        int outPut = lastNumber * 100 +removeLastNumber;
        System.out.println(outPut);
    }

}
