
                                /* Assignment - 12 - User Input-1 */


package assignment12;
import java.util.Scanner;
public class Assignment12 {

    /*QUESTION-1 -- Write a java program to print N natural numbers*/
    void printNNaturalNumber(){
        int N;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        N = sc.nextInt();
        for(int i = 1; i<= N; i++){
            System.out.println(i);
        }
    }

    /*QUESTION-2 -- Write a java program to print N natural numbers in reverse order*/
    void printNNaturalNumberInReverseOrder(){
        int N;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        N = sc.nextInt();
        for(int i = N; i>=1; i--){
            System.out.println(i);
        }
    }

    /*QUESTION-3 -- Write a java program to print odd natural numbers*/
    void printFirstNOddNaturalNumber(){
        int N;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        N = sc.nextInt();
        for(int i = 1; i<= N; i++){
            System.out.println((i*2)-1);
        }
    }

    /*QUESTION-4 -- Write a java program to print N odd natural numbers in reverse order*/
    void printNOddNaturalNumberInReverseOrder(){
        int N;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        N = sc.nextInt();
        for(int i = N; i>=1; i--){
            System.out.println((i*2)-1);
        }
    }

    /*QUESTION-5 -- Write a java program to print N even natural numbers*/
    void printFirstNEvenNaturalNumber(){
        int N;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        N = sc.nextInt();
        for(int i = 1; i<= N; i++){
            System.out.println((i*2));
        }
    }


    /*QUESTION-6 -- Write a java program to print first N even natural numbers in Reverse order*/
    void printFirstNEvenNaturalNumberInReverseOrder(){
        int N;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        N = sc.nextInt();
        for(int i = N; i>=1; i--){
            System.out.println((i*2));
        }
    }

    /*QUESTION-7 -- Write a java program to print square first N  natural numbers */
    void printSquareOfFirstNNaturalNumber(){
        int N;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        N = sc.nextInt();
        for(int i = 1; i<=N; i++){
            System.out.println((i*i));
        }
    }

    /*QUESTION-8 -- Write a java program to print cubes first N  natural numbers */
    void printCubesOfFirstNNaturalNumber(){
        int N;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        N = sc.nextInt();
        for(int i = 1; i<=N; i++){
            System.out.println((i*i*i));
        }
    }

    /*QUESTION-9 -- Write a java program to print table of N*/
    void printTableOfNumber(){
        int N;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        N = sc.nextInt();
        for(int i = 1; i<= 10; i++){
            System.out.println(N + " x " + i + " = " + N*i);
        }
    }

}
