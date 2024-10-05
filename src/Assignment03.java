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

}
