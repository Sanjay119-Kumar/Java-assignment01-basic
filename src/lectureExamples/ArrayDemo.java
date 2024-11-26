package lectureExamples;

public class ArrayDemo {
    public static void main(String[] args) {
        // 1-D ARRAY

        //Ways to create arrays in java
        // --1-->
         int[] arr1 = new int[5];

        //--2-->
        int[] arr2 = new int[]{10,20,30};

        //--3-->
       int[] arr; // blank-- local reference variable
       arr = new int[5];
       for (int i =0; i<arr1.length; i++){
           System.out.println(arr[i]);
       }

    }




}
