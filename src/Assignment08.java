

                      /*Assignment - 08 - Static Member*/

/*
   Question.01.-> Define a class Account to represent a bank account. create accountNumber , customerName , balance
   as  instance members and rateOfInterest as static variable provide function for the following operations

     1. Set account Number
     2. Set customer Name
     3. Set rate of interest
     4. Calculate simple interest (take time as an argument)
     5. Get account number
     6. Get balance
     7. Get customer name

*/


public class Assignment08 {
    static class  Account{
        private  long accountNumber;
        private String customerName;
        private float balance;
        public static float rateOfInterest;

        //setter methods
        public void setAccountNumber(long accountNumber1){
            this.accountNumber=accountNumber1;
        }
        public void setCustomerName(String customerName1){
            this.customerName=customerName1;
        }
        public void setBalance(float balance1){
            this.balance=balance1;
        }

        //getter methods
        public long getAccountNumber(){
            return  accountNumber;
        }
        public String getCustomerName(){
            return customerName;
        }
        public float getBalance(){
            return balance;
        }
        public float getRateOfInterest(){
            return rateOfInterest;
        }

        //static setter method
        public  void setRateOfInterest(float rateOfInterest1){
            Account.rateOfInterest=rateOfInterest1;
        }

        float calculateSimpleInterest(float time){
            ;
            return ( balance * time * rateOfInterest/100);

        }

    }

    /*
        Question->2 Define a class SuperCar to represent a super car of the most powerful and richest person
        of the world. This car is specially designed and guaranteed to the only available super car of its kind
        in the world. Make sure only one instance can be created of the SuperCar. Create instance variables like
        ownerName , price , color , brand and provide appropriate setters and getters methods.

     */

    static class SuperCar{
        private String ownerName;
        private float price;
        private String color;
        private String brand;

        private static SuperCar singleInstance;// it is use single ton pattern

        // check only one object create
        public static SuperCar getInstance(){
            if (singleInstance==null){
                singleInstance = new SuperCar();
            }
            return singleInstance;

        }

        //setters methods
        public void setOwnerName(String ownerName){
            this.ownerName=ownerName;
        }
        public void setPrice(float price){
            this.price=price;
        }
        public void setColor(String color){
            this.color=color;
        }
        public void setBrand(String brand){
            this.brand=brand;
        }

        public String getOwnerName() {
            return ownerName;
        }

        public float getPrice() {
            return price;
        }

        public String getColor() {
            return color;
        }

        public String getBrand() {
            return brand;
        }

        public  void showCarDetails(){
            System.out.println("Owner Of Car = " + ownerName + "\n"
                    + "Car Price = " + price + "\n"
                    + "Car Color = " + color + "\n"
                    + "Car Brand = " +  brand

            );
        }


    }


    /*
        Question->3 Define a class Video to represent a video entity for a popular app like
        YouTube Create member variables like videoId, tittle , views , likes and totalVideos
        Provide methods to get and set properties of videos;

     */
     static class Video{
         private long videoId;
         private String videoTittle;
         private long videoViews;
         private long videoLikes;
         private String singerName;
         private static long totalVideo; //track globally all videos


        public long getVideoId() {
            return videoId;
        }

        public String getVideoTittle() {
            return videoTittle;
        }

        public long getVideoViews() {
            return videoViews;
        }

        public long getVideoLikes() {
            return videoLikes;
        }
        public String getSingerName(){
            return singerName;
        }

        public void setVideoId(long videoId) {
            this.videoId = videoId;
        }

        public void setVideoTittle(String videoTittle) {
            this.videoTittle = videoTittle;
        }

        public void setVideoViews(long videoViews) {
            this.videoViews = videoViews;
        }

        public void setVideoLikes(long videoLikes) {
            this.videoLikes = videoLikes;
        }
        public void getSingerName(String singerName){
            this.singerName=singerName;
        }

        public static void setTotalVideo(long totalVideo) {
            Video.totalVideo = totalVideo;
        }

        public static long getTotalVideo() {
            return totalVideo;
        }

        void displayVideoDetails(){
            System.out.println("Video Id = " + videoId + "\n"
                    + "Video title = " + videoTittle + "\n"
                    + "Video likes = " + videoLikes + "\n"
                    + "Video views = " + videoViews + "\n"
                    + "Video likes = " + videoLikes + "\n"
                    + "Singer name = " + singerName
            );
        }
        static void  displayTotalVideo(){
            System.out.println("Total Video = " + totalVideo);
        }

    }

        /*
        Question->4 Define a class Batch for an educational institute with properties batchCode, courseName
        courseStartDate, studentCount , time, days , and total number of batches. Provide appropriate methods
        to access properties.

     */

    static class Batch{
        private int batchCode;
        private String courseName;
        private String courseStartDate;
        private int studentCount;
        private String classTiming;
        private String classesDays;

        //track all batches
        private static int totalNumberOfBatches;


        //Getter methods
        public int getBatchCode() {
            return batchCode;
        }

        public String getCourseName() {
            return courseName;
        }

        public String getCourseStartDate() {
            return courseStartDate;
        }

        public int getStudentCount() {
            return studentCount;
        }

        public String getClassTiming() {
            return classTiming;
        }

        public String getClassesDays() {
            return classesDays;
        }

        public static int getTotalNumberOfBatches() {
            return totalNumberOfBatches;
        }


        //Setters methods
        public void setBatchCode(int batchCode) {
            this.batchCode = batchCode;
        }

        public void setCourseName(String courseName) {
            this.courseName = courseName;
        }

        public void setCourseStartDate(String courseStartDate) {
            this.courseStartDate = courseStartDate;
        }

        public void setStudentCount(int studentCount) {
            this.studentCount = studentCount;
        }

        public void setClassTiming(String classTiming) {
            this.classTiming = classTiming;
        }

        public void setClassesDays(String classesDays) {
            this.classesDays = classesDays;
        }

        public static void setTotalNumberOfBatches(int totalNumberOfBatches) {
            Batch.totalNumberOfBatches = totalNumberOfBatches;
        }
        static void showAllBatches(){
            System.out.println("Total batches  " + totalNumberOfBatches);
        }
        void showCourseDetails(){
            System.out.println(" ____________________Course Details Of Students____________________ " + "\n"
                    + "Batch code = " + batchCode + "\n"
                    + "Batch start date = " + courseStartDate + "\n"
                    + "Student count in JAVA Batch = " + studentCount + "\n"
                    + "Classes timing = " + classTiming + "\n"
                    + "Days of classes = " + classesDays + "\n"

            );
        }
        public void addStudentAuto(){
            studentCount++;
        }



    }


        /*
        Question->5 Define a class Box with length, breath, height, and box count as properties. Provide
        methods to set dimensions and show dimensions. Also define a methods to display box count.

     */

        static class Box{
        private float length , breath, height;
        private static int totalBox;



        // methods for set dimensions
        public void setDimensions(float l, float b, float h){
            length=l;
            breath=b;
            height=h;

        }
        public void showDimensions(){
            System.out.println("Box dimension details "+  length*breath*height);
        }

        public static void PrintBox(){
            System.out.println("Total box created " + totalBox);
        }
        public void displayBoxCount(){
                totalBox++;
        }

    }

}
