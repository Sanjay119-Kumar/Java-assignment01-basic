package assignment20;

import java.util.Scanner;

/*
    QUESTION - 2: Write a Java method to find the greatest number stored in an array of size
*/
class ArrayOperations{
    public int greatestElement(int[] arr){
        int GreatestElement = arr[0]; // Assume kr lo first index highest element hai
        for(int great : arr){ // use for each loop check kiya array ka sabi element ko
            if ( great>GreatestElement) // compare kiya first array element ko before update
                GreatestElement=great; // update kiya highest element ko
        }
        return GreatestElement;
    }

/*
   QUESTION - 3 - Write a Java method to find the smallest number stored in an array of size N.
*/

    // Method to find the smallest number in an array
    public int smallestNumber(int[] arr) {
        // Assume the first element is the smallest
        int sn = arr[0];
        // Iterate through each element in the array
        for (int small : arr) {
            // If a smaller element is found, update the smallest value
            if (small < sn) {
                sn = small;
            }
        }
        // Return the smallest number
        return sn;
    }

/*
   QUESTION - 4 - Write a Java method to calculate sum of numbers stored in an array of size N.
*/

    public int sumOfArrayNumbers(int[] arr){
        int sum=0;
        for (int sumTemp:arr){
            sum+=sumTemp;
        }
        return sum;
    }

/*
   QUESTION - 5 - Write a Java method to calculate Average of numbers stored in an array of size N.
*/
public double averageOfArrayNumbers(int[] arr){
    int sum = sumOfArrayNumbers(arr);
    return (double) sum /arr.length;
}

}


public class CheckArray {

    /*
    QUESTION - 1: Write a Java program to take N integers as input, store them in an array of size N,
                  and display them.
*/
    public static void main(String[] args) {

        // Initialize a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Ask user for the size of the array
        System.out.println("Enter the size of array");
        int size = sc.nextInt(); // Read the size of the array

        // Declare and initialize an array of integers of specified size
        int[] arr = new int[size];

        // Prompt user to input array elements
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            System.out.println("Index: " + i); // Indicate the current index being input
            arr[i] = sc.nextInt(); // Store input at the current index
        }

        // Display the array elements
        System.out.println("Array elements: ");
        for (int i = 0; i < size; i++) {
            System.out.println(" " + arr[i]); // Print each element of the array
        }

        ArrayOperations arrayOperations = new ArrayOperations();
        int GreatestNumber = arrayOperations.greatestElement(arr);
        System.out.println("Greatest Number = " + GreatestNumber);

        System.out.println("_________________________________________________");

        int smallestNumber = arrayOperations.smallestNumber(arr);
        System.out.println("Smallest Number = " + smallestNumber);

        System.out.println("_________________________________________________");

        int sumOfNumbers = arrayOperations.sumOfArrayNumbers(arr);
        System.out.println("sum of numbers = " + sumOfNumbers);


        System.out.println("_________________________________________________");

        double averageOfNumber = arrayOperations.averageOfArrayNumbers(arr);
        System.out.println("average of numbers = " + averageOfNumber);




    }


}
