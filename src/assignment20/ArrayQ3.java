package assignment20;

/*
   QUESTION - 3 - Write a Java method to find the smallest number stored in an array of size N.
*/

import java.util.Scanner;

public class ArrayQ3 {

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
}

class CheckSmallestElementFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for user input

        // Ask the user to input the size of the array
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();

        // Declare an array of the given size
        int[] array = new int[size];

        if (size<=0){
            throw new IllegalArgumentException("Array size must be greater than 0.");
        }

        // Take array elements as input from the user
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("array index: " + i);
            array[i] = sc.nextInt(); // Store each element in the array
        }

        // Print all elements for verification
        System.out.print("All elements: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        // Create an object of the ArrayQ3 class
        ArrayQ3 smallNumber = new ArrayQ3();

        // Call the smallestNumber method and store the result
        int i = smallNumber.smallestNumber(array);

        // Print the smallest number
        System.out.println("Smallest Number: " + i);
    }
}
