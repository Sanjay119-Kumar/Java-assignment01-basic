
                        /*Assignment - 13 - USER INPUT -2*/

package assignment13;
import java.util.Scanner;

public class Assignment13 {

    Scanner sc = new Scanner(System.in);// for user input

    /*QUESTION - 1 - Write a java program to check whether a give number even or odd */
    public boolean EvenOddChecker() {
        int number;
        System.out.print("Enter a number : ");
        number = sc.nextInt();
        if (number % 2 == 0)
            return true;
        else
            return false;

    }

    /*QUESTION - 2 - Write a java program to find greatest among three given numbers */
    public String findGreatestNumber() {
        int n1, n2, n3;
        System.out.println("Enter three numbers for checking greatest number");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        if (n1 >= n2 && n1 >= n3) {
            return "n1 bda hai " + n1;
        } else if (n2 >= n1 && n2 >= n3) {
            return "n2 bda hai " + n2;
        }
        return "n3 bda hai " + n3;
    }

    /*QUESTION - 3 - Write a java program to count digits of a given numbers */
    public int countDigits() {
        int number, digitCount = 0, removeLastDigit;
        System.out.print("Enter the number : ");
        number = sc.nextInt();
        int i = 0;
        while (number > i) {
            removeLastDigit = number % 10;
            digitCount++;

            number /= 10;
        }

        return digitCount;
    }

    /*QUESTION - 4 - Write a java program to reverse a numbers */
    public int reverseNumber() {
        int number, removeLastDigit, reverseNum = 0;
        System.out.print("Enter the number :");
        number = sc.nextInt();
        int i = 0;
        while (number > 0) {
            removeLastDigit = number % 10;
            reverseNum = reverseNum * 10 + removeLastDigit;
            number/=10;


        }
        return reverseNum;
    }

    /*QUESTION-5 -- Write a java program to calculate sum of N natural numbers*/
     public int sumOfNNaturalNumber(){
        int N, sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        N = sc.nextInt();
        for(int i = 1; i<= N; i++){
            sum+=i;
        }
        return sum;
    }

    /*QUESTION-6 -- Write a java program to calculate sum of N odd natural numbers*/
    public int sumOfNOddNaturalNumber(){
        int N, oddSum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        N = sc.nextInt();
        for(int i = 1; i<= N; i++){
            oddSum+=(i*2)-1;
        }
        return oddSum;
    }

    /*QUESTION-7 -- Write a java program to calculate sum of N even natural numbers*/
    public int sumOfNEvenNaturalNumber(){
        int N, evenSum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        N = sc.nextInt();
        for(int i = 1; i<= N; i++){
            evenSum+=(i*2);
        }
        return evenSum;
    }

    /*QUESTION-8 -- Write a java program to calculate sum of N square natural numbers*/
    public int sumOfNSquareNaturalNumber(){
        int N, squareSum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        N = sc.nextInt();
        for(int i = 1; i<= N; i++){
            squareSum+=(i*i);
        }
        return squareSum;
    }

    /*QUESTION-9 -- Write a java program to calculate sum of digits of a given number*/
    public int sumOfDigits(){
        int num , digitSum = 0, removeLastDigits;
        System.out.print("Enter a number:");
        num = sc.nextInt();
        int i = 0;
        while (num>0){
            removeLastDigits = num%10;
            digitSum +=removeLastDigits;
            num/=10;

        }
        return digitSum;
    }

    /*QUESTION-10 -- Write a java program to calculate factorial of a given number*/
    public int factorialCalculate(){
        int num, fact = 1, factSum = 0;
        System.out.println("Enter a number for factorial :");
        num = sc.nextInt();
        for (int i = 1; i<=num; i++){
            fact = fact*i;
        }
        return factSum+=fact;
    }


}