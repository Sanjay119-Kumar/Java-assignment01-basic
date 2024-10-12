 public class Assignment06{
    //Q.1.

     /*

     *
     * *
     * * *
     * * * *
     * * * * *

*/
     public static void p1(){
         for (int i = 1; i<5; i++){
             for (int j = 1; j<=i; j++){
                 System.out.print("*");
             }
             System.out.println();
         }
     }

     //Q.2.

     /*

          *
        * *
      * * *
    * * * *
  * * * * *

      */
     public static void p2(){
         for(int i = 1; i<=5; i++){
             for (int j = 0; j<=5-i; j++){
                 System.out.print(" ");
             }
             for (int k = 1; k<=i; k++){
                 System.out.print("*");
             }
             System.out.println();
         }
     }

     //Q.3.

     /*

      * * * * *
      * * * *
      * * *
      * *
      *

      */
     public static void p3(){
         for (int i =5; i>=1; i--){
             for (int j =1; j<=i; j++){
                 System.out.print("*");
             }
             System.out.println();
         }
     }

     //Q.4.

     /*

      * * * * *
        * * * *
          * * *
            * *
              *

      */

     public static void p4(){
         for (int i =5; i>=1; i--) {
             for (int j =1; j<=5-i; j++){
                 System.out.print(" ");
             }
             for (int j =1; j<=i; j++){
                 System.out.print("*");
             }
             System.out.println();
         }
     }

     //Q.5.

     /*

      1
      1 2
      1 2 3
      1 2 3 4
      1 2 3 4 5

      */

     public static void p5(){
         for (int i = 1; i<5; i++){
             int k =1;
             for (int j = 1; j<=i; j++){
                 System.out.print(k++);
             }
             System.out.println();
         }
     }

     //Q.6.

     /*

      1
      2 1
      3 2 1
      4 3 2 1


      */

     public static void p6(){
         for (int i = 1; i<5; i++){

             for (int j = i; j>=1; j--){
                 System.out.print(j);


             }
             System.out.println();


         }
     }

     //Q.7.

     /*

      A B C D E
        A B C D
          A B C
            A B
              A


      */

     public static void p7(){
         for (char i =5; i>=1; i--) {
             char a = 'A';
             for (int j =1; j<=5-i; j++){
                 System.out.print(" ");
             }
             for (int j =1; j<=i; j++){
                 System.out.print(a);
                 a++;
             }
             System.out.println();
         }
     }

     //Q.8

     /*

      1
      2 3
      4 5 6
      7 8 9 10


      */

     public static void p8(){
         int flag = 1;
         for (int i = 1; i<5; i++){

             for (int j = i; j>=1; j--){
                 System.out.print(flag++);

             }
             System.out.println();


         }
     }


     //Q.9.

     /*

      A B C D E
        B C D E
          C D E
            D E
              E


      */

     public static void p9(){
        for (int i = 1; i<=5; i++){
          for (int space = 1; space<i; space++){
            System.out.print(" ");
          }
            for (char j = (char) ('A' + i); j<='E'; j++){
                System.out.print(j);
            }
            System.out.println();

        }

     }

     //Q.10.

     /*

      * * * * * *
      *         *
      *         *
      *         *
      * * * * * *

      */
     public static void p10(){
         for (int i =1; i<=6; i++){
             for (int j =1; j<=6; j++){
                 if (i==1 || j==1 || j==6 || i==6){
                     System.out.print("*");
                 }
                 else {
                     System.out.print(" ");
                 }


             }
             System.out.println();

         }
     }



 }