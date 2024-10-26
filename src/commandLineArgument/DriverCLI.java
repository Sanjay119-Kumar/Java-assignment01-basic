package commandLineArgument;

import java.util.Scanner;

public class DriverCLI {
    public static void main(String[] args) {

/*
        //Q.1
        if (args.length<2){
            System.out.println("Enter the two number as a arguments ");
        }
        try{
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            Assignment10.Addition obj = new Assignment10.Addition();
            obj.setValue(num1,num2);
            obj.add();

        }
        catch (NumberFormatException e){
            System.out.println("Enter the valid numbers");


            int fact = 1, sum =0 , n;
            System.out.println("Enter the number");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            for (int i = 1; i<=n; i++){
                fact = fact*i;
                sum = fact+sum;
            }
            System.out.println(sum);
        }

 */

/*
        //Q.2
        Assignment10.AdditionNNumber obj2 = new Assignment10.AdditionNNumber();
        obj2.setNNumber(5);
        obj2.calculateNNumbers(args);
        obj2.printAddNNumber();

        for (int i = 0; i<=args.length; i++){
            System.out.println(args[i]);
        }
*/

/*      Q.3
        Assignment10.PrintAllSuppliedStringByCommandLine obj3 = new Assignment10.PrintAllSuppliedStringByCommandLine();
        obj3.count(args);
*/

/*
        //Q.4
        if (args.length<2){
            System.out.println("Enter a number for LCM calculating trough command line arguments");
        }

        try {
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);

            Assignment10.LCM lcmObj = new Assignment10.LCM();


            int output = lcmObj.calculateLCM(n1, n2);
            System.out.println("LCM = " + output);

        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
*/



/*
            //Q.5
        Assignment10.PrimeNumberCalculate calculateObj = new Assignment10.PrimeNumberCalculate();
        int num = Integer.parseInt(args[0]);
        calculateObj.checkPrime(num);
*/



/*      Q.6
        // Check if at least one argument is provided
        if (args.length < 1) {
            System.out.println("Please provide a number as a command line argument.");
            return; // Exit the program if no arguments are provided
        }

        try {

        int N = Integer.parseInt(args[0]);

        Assignment10.FilterPrimeNumber filterPrimeNumberObj = new Assignment10.FilterPrimeNumber();


            filterPrimeNumberObj.calculateAllPrime(N);

        }catch (NumberFormatException e){

        }


 */


        //Q.7
       /* try {
            Assignment10.CalculateFactorial calculateFactorialObj = new Assignment10.CalculateFactorial();// instantiation
            int N = Integer.parseInt(args[args.length-1]);// convert string args to int
            System.out.println("Factorial = " +calculateFactorialObj.calculateFactorialOfANumber(5)); // call + print factorial

        } catch (Exception e) {
            throw new RuntimeException(e);// handle exception
        }


        */


/*        //Q.8
        int num = Integer.parseInt(args[0]); // covert String to int

        Assignment10.SumOfDigitOfNumber obj = new Assignment10.SumOfDigitOfNumber(); // instantiation

      try {
          obj.setNum(num); // call and pass the value in setNum Method
          obj.calculateSum(); // call calculate method
          obj.PrintNumAndDigitSum(); // call the print......
      } catch (Exception e) {
          throw new RuntimeException(e); // handle exception............
      }


      */


    }
}
