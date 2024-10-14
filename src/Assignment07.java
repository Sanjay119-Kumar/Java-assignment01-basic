

                      /*Assignment - 07 - Classes and Objects*/

/*
   Question.01.-> Define a class Complex to represent a complex number. Declare instance member variables
   to store real and imaginary part of a complex number,also define instance member function / methods to
   set values of complex number and print values of complex number.

*/

                      import java.util.TreeMap;

                      public class Assignment07 {

     static class ComplexNumber {
        private int realNumber;
        private int imaginaryNumber;

        //set values imaginary and real
        public void setComplexNumbers(int r, int i){
            realNumber = r;
            imaginaryNumber = i;
        }
        public void printComplexNumber(){
            System.out.println("Complex number " + realNumber + " "+ imaginaryNumber + "i");
        }

    }


    /*

   Question.02.-> Define a class Time to represent Time like(3 hr , 45 min , 20 sec). Declare appropriate number instance member
   variables and also define instance member function / methods to set values for time and display of time.

   */

    static class Time{
        private int timeHours;
        private int timeMinutes;
        private int timeSecond;

        public void setTimeValue(int h, int m, int s){
            if ((h < 0) ||  (m < 0) || (m >= 60) || (s < 0) || (s >= 60)){
                System.out.println("Invalid input! Please enter the valid input");
            }
            else {
                timeHours = h;
                timeMinutes = m;
                timeSecond = s;
            }

        }
        public void displayTime(){
            System.out.println("Time = " + timeHours + " hr " + timeMinutes + " min " + timeSecond + " sec");
        }

    }


    /*

   Question.03.-> Define a class Cuboid with  member variables to store length of its sides. Also define setter getter and
   member function / methods to calculate volume and surface area of cuboid.

   -->FORMULA volume of cuboid = length * width * height
   -->FORMULA surface area of cuboid = 2((length * width) + (height*length) + (width * height))

   */

    static class Cuboid{
        private int cuboidLength;
        private int cuboidWidth;
        private int cuboidHeight;
        int volumeOfCuboid;
        int surfaceArea;


        //Getter methods
        public int getCuboidLength(){
            return cuboidLength;
        }
        public int getCuboidWidth(){
            return cuboidWidth;
        }
        public int getCuboidHeight(){
            return cuboidHeight;
        }

        //Setter methods
        public void setCuboidLength(int cuboidLength){
            this.cuboidLength=cuboidLength;
        }
        public void setCuboidWidth(int cuboidWidth){
            this.cuboidWidth=cuboidWidth;
        }
        public void setCuboidHeight(int cuboidHeight){
            this.cuboidHeight=cuboidHeight;
        }

        //Instance functions for calculating volume of cuboid and surface of area
        public int calculateVolumeOfCuboid(){
           
           return volumeOfCuboid = cuboidLength*cuboidWidth*cuboidHeight;

        }
        public int calculateSurfaceAreaOfCuboid(){
            
           return surfaceArea = 2*((cuboidLength*cuboidWidth) + (cuboidHeight*cuboidLength) + (cuboidWidth*cuboidHeight) );

        }

        void printVolume(){
            System.out.println("Length = " + cuboidLength);
            System.out.println("Width = " + cuboidWidth);
            System.out.println("Height = " + cuboidHeight);
            System.out.println("Volume of Cuboid = " + calculateVolumeOfCuboid());
            System.out.println("*******************************************************");

        }

        void printSurfaceArea(){
            System.out.println("Length = " + cuboidLength);
            System.out.println("Width = " + cuboidWidth);
            System.out.println("Height = " + cuboidHeight);
            System.out.println("Surface area of Cuboid = " + calculateSurfaceAreaOfCuboid());
        }

    }


    /*

   Question.04.-> Define a class Employee with properties empId , name salary, and define setters and getters.

   */

    static class Employee{
        private int empId;
        private float salary;
        private String name;

        //Getters method

        public int getEmpId(){
            return empId;
        }
        public float getSalary(){
            return salary;
        }
        public String getName(){
            return name;
        }

        //Setters method
        public void setEmpId(int empId){
            this.empId=empId;
        }
        public void setSalary(float salary){
            this.salary=salary;
        }
        public void setName(String name){
            this.name = name;
        }
    }

    /*

   Question.05.-> Define a class Contact with fields  id , firstName , lastName, mobileNo , emailId provide  setters and getters.

   */

    static class Contact{
        private int id;
        private String firstName;
        private String lastName;
        private long mobileNo;
        private String emailId;

        //Getters methods--> return values of instance variables / Getter returns the current value of a instance variable.
        public int getId(){
            return id;
        }
        public String getFirstName(){
            return firstName;
        }
        public String getLastName(){
            return lastName;
        }
        public long getMobileNo(){
            return mobileNo;
        }
        public String getEmailId(){
            return emailId;
        }

        //Setters method-->assigns a new value to a variable using the this keyword to refer to the current object’s field.

        public void setId(int id1){
            this.id=id1;
        }
        public void setFirstName(String firstName1){
            this.firstName=firstName1;
        }
        public void setLastName(String lastName1){
            this.lastName=lastName1;
        }
        public void setMobileNo(long mobileNo1){
            this.mobileNo=mobileNo1;
        }
        public void setEmailId(String emailId1){
            this.emailId=emailId1;
        }
    }


    /*

   Question.06.-> Define a class Question with fields  queNo , optionA , optionB, optionC , optionD provide methods to set question
    and display questions

   */

    static class Question{
        private int queNu;
        private String questions;
        private String optionA, optionB, optionC, optionD;

        public void setQuestions(int questionsNumber,
                                 String allQuestions,
                                 String A,
                                 String B,
                                 String C,
                                 String D){
            queNu =questionsNumber;
            questions=allQuestions;
            optionA=A;
            optionB=B;
            optionC=C;
            optionD=D;
        }
        void displayQuestion(){
            System.out.println("Enter the Question No. -> " + queNu + "\n" +
                    "Write the question -> " + questions + "\n" +
                    " Choose Correct Option " + "\n" +
                    " A  " + optionA +
                    " B  " + optionB +
                    " C  " + optionC +
                    " D  " + optionD

            );
        }
    }

    /*

   Question.07.-> Define a class Course with fields  courseId , courseName , duration, fee. provide  setters and getters.


   */

    static class Course{
        private int courseId;
        private String courseName;
        private String duration;
        private float courseFee;

        //Getter methods
        public int getCourseId(){
            return courseId;
        }
        public String getCourseName(){
            return courseName;
        }
        public String getDuration(){
            return duration;
        }
        public float getCourseFee(){
            return courseFee;
        }

        //Setters methods
        public void setCourseId(int courseId1){
            this.courseId=courseId1;
        }
        public void setCourseName(String courseName1){
            this.courseName=courseName1;
        }
        public void setDuration(String duration1){
            this.duration=duration1;
        }
        public void setCourseFee(float courseFee1){
            this.courseFee=courseFee1;
        }
    }

     /*

    Question.08.-> Define a class Distance with fields  km , m , cm. provide methods to set distance and display distance. Also
    define a member function to add two distances.


   */

     static class Distance{
         private float kiloMeter;
         private float meter;
         private float centiMeter;

         public void setDistance(float km, float m, float cm){
             kiloMeter=km;
             meter =m;
             centiMeter=cm;
         }
         void displayDistance(){
             System.out.println("KM =" + kiloMeter);
             System.out.println("M =" + meter);
             System.out.println("CM =" + centiMeter);
         }

            Distance addDistance(Distance other){

             Distance result = new Distance();

             float calculateDistancesInCentimeter = (this.kiloMeter * 100000 +
                     this.meter * 100 + this.centiMeter) +
                     (other.kiloMeter * 100000 + other.meter * 100 + other.centiMeter);

             //convert it again km, m, cm
                result.kiloMeter =calculateDistancesInCentimeter/100000;  // return km
                calculateDistancesInCentimeter%=100000;// Remenders for meter in cm
                result.meter = calculateDistancesInCentimeter/100; // calculate actual meter
                result.centiMeter = calculateDistancesInCentimeter%100; // calculate actual cm


                return result;


         }
     }

     /*

    Question.09.-> Define a class Circle with radius as member variable. provide methods to set radius value.
    calculate area and calculate circumference.


   */

      static class Circle{
          private float radius;

          public void setRadius(float radius1){
              this.radius=radius1;
          }
          float calculateAreaOfCircle(){
              return (float) Math.PI*radius*radius;
          }
          float calculateCircumference(){
              return (float) (2 * Math.PI *radius);
          }
          void printAreaOfCircle(){
              System.out.println("Area = " + calculateAreaOfCircle());
          }
          void printCircumferenceOfCircle(){
              System.out.println("circumference of circle = " + calculateCircumference());
          }
      }

       /*

    Question.10.-> Define a class Book with  member variables bookId , title, price , and author . provides setters and getters methods


   */

    static class Book{
        private int bookId;
        private float bookPrice;
        private String bookAuthor;

        //setters methods
        public void setBookId(int bookId1){
            this.bookId=bookId1;
        }
        public void setBookPrice(float bookPrice1){
            this.bookPrice=bookPrice1;
        }
        public void setBookAuthor(String bookAuthor1){
            this.bookAuthor=bookAuthor1;
        }

        //getters methods
        public int getBookId(){
            return bookId;
        }
        public float getBookPrice(){
            return bookPrice;
        }
        public String getBookAuthor(){
            return bookAuthor;
        }
    }

}
