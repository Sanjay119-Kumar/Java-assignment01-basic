package assignment20;

/*
    QUESTION - 2: Write a Java method to find the greatest number stored in an array of size
*/
public class ArrayQ2 {

    public int greatestElement(int[] arr){
        int GreatestElement = arr[0]; // Assume kr lo first index highest element hai
         for(int great : arr){ // use for each loop check kiya array ka sabi element ko
            if ( great>GreatestElement) // compare kiya first array element ko before update
                GreatestElement=great; // update kiya highest element ko
        }
        return GreatestElement; 
    }

}
class CheckGreatestNumber{
    public static void main(String[] args) {

       int[] arr= new int[]{200, 38, 48, 59, 69};
       ArrayQ2 greatestNumber = new ArrayQ2();
        int i = greatestNumber.greatestElement(arr);
        System.out.println( "Greatest Element : " + i);


    }
}