
/*                             Assignment - 11 -  Packages And Import                             */



/*QUESTION-01 -  Write a java program to print current date */

package assignment11;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalTime;
import java.util.Random;


public class Assignment01 {


    /*QUESTION-01 -  Write a java program to print current date */

            public static void  printDataAndTimeUsingImportPackage(){
            LocalDateTime currentDate  = LocalDateTime.now();
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            System.out.println("Current Date = " + dateFormatter.format(currentDate));


    }


    /*QUESTION-02 -  Write a java program to print current time */

            public static void printCurrentTimeUsingPackage(){
            LocalTime currentTime = LocalTime.now();
            DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss");
            System.out.println("Current Time = " + timeFormatter.format(currentTime));
        }



    /*QUESTION-03 -  Write a java program to print Random Numbers between 100 - 200  */


            public static void printRandomNumbers(){
            Random randomNumber = new Random();
            int setRandomNumbers = 100 + randomNumber.nextInt(101); //
            System.out.println(" Generate Random Numbers " + setRandomNumbers);
        }


    /*QUESTION-03 -  Write a java program to calculate ROOT of a quadratic equation  */

            public static void calculateQuadraticEquation(int a, int b, int c){
                double D = b*b - (4*a*c);
                double Root1, Root2;
                if (D>0){
                    Root1 = (-b + Math.sqrt(D))/2*a;
                    Root2 = (-b - Math.sqrt(D))/2*a;
                    System.out.println("Roots are real or distinct" + Root1 + Root2);
                }
                else if (D==0) {
                    Root1 = (double) -b /(2*a); // single root / one real root repeated
                    System.out.println("single root / one real root repeated" + Root1);
                }
                else {
                    double realPart = (double) -b /(2*a);
                    double imaginaryPart = Math.sqrt(D)/2*a;
                    System.out.println("Root are real or Imaginary / complex" + realPart + imaginaryPart );
                }
            }




}
