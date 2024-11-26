package lectureExamples;

import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = "My Name is Demo";// s1,s2 point same object
        String s2 = "My Name is Demo";

        String s3 = new String("My Name is Demo"); // s3 point new object
        System.out.println("Result =" + s1==s2); 
        System.out.println("Result" + s1==s3);
        System.out.println(s1.equals(s3));

        String s4 = new String( "Demo ");

        /*String Methods - String object immutable so it can not change only manipulate it all methods return some values according
         *  to its own functionality you need to hold return value
         */

        //  1. -->toUpperCase()
        String upperCase = s1.toUpperCase(); // return krta hai capital string you need to hold it a new string reference
        System.out.println("Uppercase = " + upperCase);

        // 2. --> toLowerCase()
        String lowerCase = s1.toLowerCase();
        System.out.println("Lowercase = " + lowerCase);

        // 3. --> equals()
        boolean equals = s1.equals(s3); // return boolean value with case-sensitive compassion
        System.out.println("equlas method = " + equals);

        // 4. --> equalsIgnoreCase()
        boolean b = s1.equalsIgnoreCase(s3); //return boolean value with no case-sensitive compassion
        System.out.println( b);

        // 5. --> compareTo()
        int i = s1.compareTo(s3); // return integer value string same = 0
        System.out.println(i);
        int i1 = s3.compareTo(s4);
        System.out.println(i1);

        // 6. --> indexOf()
        int characterIndex1 = s3.indexOf(4); // character index ke liye
        System.out.println(" characterIndex1 = " + characterIndex1);

        // 7. --> indexOf()
        int characterIndex2 = s2.indexOf(3, 7);
        System.out.println("characterIndex2= " +characterIndex2);


        // 7. --> indexOf() // string index ke liye
        int stringIndex1 = s3.indexOf("is");
        System.out.println("stringIndex1 =" + stringIndex1);

        // 8. --> indexOf() // string index ke liye
        int stringIndex2 = s3.indexOf("Demo", 2);
        System.out.println("stringIndex1 = " + stringIndex2);

        // 9. --> lastIndexOf()
        int characterLastIndex1 = s2.lastIndexOf(5);
        System.out.println("characterLastIndex1 = " + characterLastIndex1);

        // 10. --> lastIndexOf()
        int characterLastIndex2 = s1.lastIndexOf(2, 5);
        System.out.println("characterLastIndex2 = " + characterLastIndex2);

        // 11. --> lastIndexOf()
        int stringLastIndex1 = s2.lastIndexOf("is");
        System.out.println("stringLastIndex1 = " + stringLastIndex1);

        // 12. --> lastIndexOf()
        int stringLastIndex2 = s2.lastIndexOf("is" , 2);
        System.out.println("stringLastIndex2 = " + stringLastIndex2);

        // 13. --> charAt()
        int charAt = s2.charAt(3);
        System.out.println("Character  = " + charAt);

        // 14. --> subString()
        String subString1 =  s2.substring(3);
        System.out.println("subString1  = " + subString1);

        // 15. --> subString()
        String subString2 =  s2.substring(3,7);
        System.out.println("subString2  = " + subString2);

        // 16.--> replace()
        String replace = s1.replace('M', 'N');
        System.out.println("Character replaced = " + replace);

        // 17. --> trim()
        String trim = s4.trim();
        System.out.println("Trim leading spaces from Demo word = " + trim );

        // 18. --> length()
        int length = s1.length();
        System.out.println("Length = " + length);

        // 19. --> toString()
        String string = s4.toString();
        System.out.println("toString = " + string);
        
        // 20. --> toCharArray()
        char[] charArray = s1.toCharArray();
        System.out.println("Character array = " + Arrays.toString(charArray));


    }
}
