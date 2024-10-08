public class Assignment04 {
    /* Q.1. Write a program to check whether a given number is divisible by 5 or not*/
    public static boolean p1(int number){
        if (number%5==0){
            return true;
        }
        else {
            return false;
        }
    }

    /* Q.2. Write a program to check whether a given number is even  or odd number*/
    public static boolean p2(int number){
        if (number%2==0){
            return true;
        }
        else {
            return false;
        }
    }

    /* Q.3. Write a program to check whether a given number is even  or odd number without modulo operator*/
    public static boolean p3(int number){
        if ((number/2)*(2)==number){
            return true;
        }
        else {
            return false;
        }
    }
    /* Q.4. Write a program to check whether a given number is positive  or non-positive number*/
    public static boolean p4(int number){
        if (number>0){
            return true;
        }
        else {
            return false;
        }
    }
    /* Q.5. Write a program to print greater between two numbers */
    public static void p5(int number1, int number2){
        if (number1>number2){
            System.out.println(number1 + " greater than " + number2);
        } else if (number1<number2) {
            System.out.println(number2 + " greater than " + number1);
        } else {
            System.out.println(" both are equal ");
        }
    }
    /* Q.6. Write a program to check whether given number positive , negative or zero */
    public static String p6(int num){
        if (num>0){
            return "Positive number";
        } else if (num<0) {
            return "Negative number";
        }
        else {
            return "Number is Zero";
        }
    }
    /* Q.7. Write a program to print greater among three numbers */
    public static String p7(int n1, int n2, int n3){
        if (n1>=n2 && n1>=n3){
            return n1 + " Greater  ";
        } else if (n2>=n1 && n2>=n3) {
            return n2 + " Greater  " ;
        }
        else {
            return n3 + " Greater  ";
        }
    }

    /* Q.8. Write a program to check whether a  character alphabet , digit  or some other character */
    public static String p8(char character){
        if (character >= 65 && character<=90 || character>=97 && character<=122){
            return "Alphabets";
        }
        else if (character >= 48 && character <=57){
            return "Digits";
        }
        else {
           return "others characters";
        }
    }
    /* Q.9. Write a program to check whether a  given number three digit or not */
    public static boolean p9(int num){
         return num>=100 && num<=999;
        }

    /* Q.10. Write a program to check whether a  given number divisible by 5 or 7 */
    public static String p10(int num){
        if (num%5==0 && num%7 ==0){
            return "Divisible by both 5 or 7";
        } else if (num % 5 == 0) {
            return "Divisible by 5";
        } else if (num % 7 ==0) {
            return "Divisible by 7";
        }
        else {
            return " NOT divisible by 5 or 7";
        }
    }
}
