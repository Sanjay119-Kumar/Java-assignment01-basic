                /* Assignment-10 Command Line Arguments */


/* Question->1Write a Java program to add two numbers. Numbers are provided trough command line.*/



package commandLineArgument;

public class Assignment10 {
    static class Addition{
        private int num1;
        private int num2;

        public void setValue(int n1 , int n2){
            num1=n1;
            num2=n2;

        }
        public void add(){
            System.out.println("Addition of two number by command line Arguments " + (num1+num2));
        }
    }



    /* Question->2 Write a Java program to add N numbers. Numbers are provided trough command line.*/

    static class AdditionNNumber{
        private int nNumber;
        private int sum=0;

        public void setNNumber(int nNumber1){
            nNumber=nNumber1;
        }
        public void calculateNNumbers(String[]args){
            for (String arg : args){
                sum+=Integer.parseInt(arg);
            }
        }
        public void printAddNNumber(){
            System.out.println("Addition of N Numbers " + sum);
        }
    }

    /* Question->3 Write a Java program to print all the strings supplied trough command line.*/

    static class PrintAllSuppliedStringByCommandLine{
        private int num;

        public void setValue(int Nnum){
            num=Nnum;
        }
        public void count(String[] args){
            for (String all : args){
                System.out.println(all);
            }
        }
    }


    /* Question->4 Write a Java program to calculate LCM of two numbers. Numbers are provided trough command line.*/

    static class LCM{
       /* private int a;
        private int b;*/

        public int gcd(int a1, int b1){ //        // Method to calculate GCD using the Euclidean algorithm
            while (b1!=0){
                int temp = b1;
                b1=a1%b1;
                a1=temp;
            }
            return a1;
        }
        public int calculateLCM(int a, int b){// Method to calculate LCM using the formula: (a * b) / GCD(a, b)
            return (a/ gcd(a,b))*b;
        }


    }

    /* Question->5 Write a Java program to calculate whether a given number prime or not. Number are provided trough command line.*/

    static class PrimeNumberCalculate{
        int i;
        public void checkPrime(int num){
            for ( i =2; i<=num; i++){
                if (num%i==0)
                    break;
            }
            if (i==num){
                System.out.println("prime number");
            }
            else {
                System.out.println("Not prime");
            }
        }
    }

    /* Question->6 Write a Java program to filter and print numbers which are prime . Number are provided trough command line.*/

    static class FilterPrimeNumber{
        private int i;

        public void calculateAllPrime(int N){
            for (int num = 2; num<=N; num++){
                boolean isPrime = true;
                for (int i = 2; i<=Math.sqrt(num); i++){
                    if (num%i==0){
                        isPrime=false;
                        break;
                    }
                }
                if (isPrime){
                    System.out.println(num);
                }
            }
        }
    }


    /* Question->7 Write a Java program to  calculate factorial of a number . Number are provided trough command line.*/

   static class CalculateFactorial{

       int sum=0, fact=1;// declare or initialize variables fact and sum
       public int calculateFactorialOfANumber(int num){// create methods for calculate factorial
           for (int i =1; i<=num; i++){
               fact*=i;
           }
           return sum+=fact;// return output
       }

   }


    /* Question->8 Write a Java program to  calculate sum of digit of a given numbers . Numbers are provided trough command line. Print
      all the numbers and sum of digits


    */
    static class SumOfDigitOfNumber{
        private int num;
        private int sumOfDigit=0;

        void setNum(int num1){
            num=num1;   // set value
        }

        void calculateSum(){
            int temp = num;  // use temporary variable to safe my original value
           while (temp!=0){

               int lastDigit=temp%10; // find last digit
               sumOfDigit+=lastDigit; // sum last digit
               temp/=10; // remove last digit
           }

        }
        void PrintNumAndDigitSum(){
            System.out.println("Number is " + num);
            System.out.println("Digit sum = " + sumOfDigit);
        }
    }




}
