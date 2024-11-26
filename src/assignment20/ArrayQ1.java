package assignment20;

import java.util.Scanner;

/*
    QUESTION - 1: Write a Java program to take N integers as input, store them in an array of size N,
                  and display them.
*/

public class ArrayQ1 {
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
        System.out.print("Array elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + arr[i]); // Print each element of the array
        }
    }


}
