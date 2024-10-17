

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
        public String customerName;
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
            float p=1000;
            return (float) (Math.PI * p * time * rateOfInterest);

        }
        void displaySI(){
            System.out.println("Simple interest = " + calculateSimpleInterest(2f));
        }
    }
}
