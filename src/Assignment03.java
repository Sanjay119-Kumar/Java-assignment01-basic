public class Assignment03 {
    public static char p1(char ch){

        ch++;
        return ch;
    }
    public static char p2(){
        char x = '+';
        int unicode = x;
        return x;
    }
    public static int p3(int numVar){
        int removeLastDigit = numVar/10;
        return removeLastDigit*10;
    }
    public  static void p4(){
        int num = 199;
        int fn = num%10;
        num /=10;
        int sn = num%10;
        num /=10;
        int tn = num%10;
        
        int storeSum = fn+sn+tn;
        System.out.println(storeSum);
    }

    public static void p5(){
        boolean ex = 5>4 && 4>3;
        System.out.println("result is "+ex);
    }

    public static void p6(){
//        int x = (int)true;
//        System.out.println(x); boolean can not be convert in int

    }
    public static void p7(){
        //int x = !5>-2; it is bad operand type so error
        boolean x = !(5>-2);
        System.out.println(x);
    }
    public static void p8(){
        //int x = 5.5%1.5; error
        int x = (int) (5.5%1.5);
        System.out.println(x);
    }
    public static void p9(){
        int x = 123;
        int i = x % 10;
        System.out.println(i*100 + x/10);
    }
    public static void p10(){
        char ch = (int) (100);
        System.out.println(ch);


    }

}
