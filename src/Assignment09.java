
                      /*Assignment - 09 - Wrapper classes*/

/*
   Question.01.-> Define a class Circle with member variable radius. Provide methods like
   setRadius, getRadius , getArea , getCircumference. Use wrapper classes instead of primitives.

*/
public class Assignment09 {
    static class Circle{
        private Float radius;


        //getter methods
        public Float getRadius() {
            return radius;
        }

        public void setRadius(Float radius) {
            if (radius==null || radius<=0){
                throw new  IllegalArgumentException("Radius Must Be Positive");
            }
            this.radius = radius;
        }

        public Float CalculateArea(){
            return (3.14f * radius * radius);
        }
        public void showArea(){
            System.out.println("Area = " + CalculateArea());
        }
        public Float CalculateCircumference(){
            return (2 * 3.14f * radius);
        }
        public void showCircumference(){
            System.out.println("Circumference = " + CalculateCircumference());
        }

    }

    /*
   Question.02.-> Define a class MarkSheet with properties to hold marks of five subjects
   (like - physics, mathematics, chemistry, English , and Hindi). Provide setter and getter methods
   Use wrapper classes instead of primitives.

*/
    static class MarkSheet{
        private Float physicsMarks;
        private Float mathematicsMarks;
        private Float chemistryMarks;
        private Float EnglishMarks;
        private Float HindiMarks;

        //setter methods
        public void setPhysicsMarks(Float physicsMarks){
            this.physicsMarks=physicsMarks;
        }
        public void setMathematicsMarks(Float mathematicsMarks){
            this.mathematicsMarks=mathematicsMarks;
        }
        public void setChemistryMarks(Float chemistryMarks){
            this.chemistryMarks=chemistryMarks;
        }
        public void setEnglishMarks(Float englishMarks){
            this.EnglishMarks=englishMarks;
        }
        public void setHindiMarks(Float hindiMarks){
            this.HindiMarks=hindiMarks;
        }

        //Getter Methods
        public Float getPhysicsMarks(){
            return physicsMarks;
        }
        public Float getMathematicsMarks(){
            return mathematicsMarks;
        }
        public Float getChemistryMarks(){
            return chemistryMarks;
        }
        public Float getEnglishMarks(){
            return EnglishMarks;
        }
        public Float getHindiMarks(){
            return HindiMarks;
        }
        public void showAllSubjectMarks(){
            System.out.println(" MarkSheet Of Student " + "\n" +
                    "Physics = " + physicsMarks + "\n" +
                    "Mathematics = " + mathematicsMarks + "\n" +
                    "Chemistry = " + chemistryMarks + "\n" +
                    "English = " + EnglishMarks + "\n" +
                    "Hindi = " + HindiMarks + "\n"
                    );
        }

        /*

          Q.3 In Question 2 , provide a method to find maximum marks

         */

        public Float findMaxMark(){
          Float  max=physicsMarks;
            if (mathematicsMarks != null && mathematicsMarks > max){
                max = mathematicsMarks;
            }

             if(chemistryMarks != null && chemistryMarks >max){
                max=chemistryMarks;
            }
             if(EnglishMarks!=null && EnglishMarks>max){
                max=EnglishMarks;
            }  if (HindiMarks!=null && HindiMarks>max) {
                max=HindiMarks;

            }

            return max;
        }

        // Q.3 Provide a method to find average of marks in all subjects
        public Float findAverage(){
            return   (physicsMarks + mathematicsMarks + chemistryMarks +  EnglishMarks + HindiMarks)/5;


        }


        
        //Q.5 Provide a method to find result as pass or fail. passing marks is taken as argument
        public String passOrFail(Integer passingMarks){

            // validate marks
            if (passingMarks == null || passingMarks <0){
                return "Invalid Passing Marks";
            }

            // track valid marks
            boolean marksAvailable = false;

            //check every marks of a subject with passing marks
            if ((physicsMarks != null && physicsMarks < passingMarks) ||
                    (mathematicsMarks != null && mathematicsMarks < passingMarks) ||
                    (chemistryMarks != null && chemistryMarks < passingMarks) ||
                    (EnglishMarks != null && EnglishMarks < passingMarks) ||
                    (HindiMarks != null && HindiMarks < passingMarks)
            ){
                return "Fail Hai";
            }

            // check if atleast one subject marks is not null than true the available marks
            if(( physicsMarks != null) || (mathematicsMarks != null) || (chemistryMarks !=null) || (EnglishMarks != null) || (HindiMarks != null )){
                marksAvailable = true;
            }

            // check if marks not available
            if (!marksAvailable){
               return  "MArks not available !!!!!!!!!";
            }


            return "Pass Hai---------";

        }
    }


    }



