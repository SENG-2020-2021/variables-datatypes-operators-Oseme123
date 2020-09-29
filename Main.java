class Main {
  public static void main(String[] args) {
  
  // kindly use appropriate data types for your declaration
   // declare variables days the debtor defaulted, amount the debtor is to pay per day, amount the debtor is to pay and assign values to them

   int daysDefaulted= 6;
   int amountPerDay= 300;
   int amountPaid = 650;
   
   //Declare the variable of the total amount the debtor is to pay, the days the debtor paid for, amount the debtor is left to pay, days the debtor has not payed for

   int numOfDaysPaid;
   int amountToPay;
   int daysToPay;
   int amountLeftToPay;


   // calculate and print total amount the debtor is to pay
   amountToPay= daysDefaulted * amountPerDay;
   System.out.println("The amount to pay is  "+ amountToPay);

   // calculate and print the days the debtor paid for
   numOfDaysPaid = amountPaid / amountPerDay;
   System.out.println("The number of days paid is " + numOfDaysPaid);
  
  // calculate and print the amount whose day was not captured because the amount was incomplete
  int incompleteAmount =amountPaid%amountPerDay;
   System.out.println("The incomplete amount not captured in a day is " + incompleteAmount);


   // calculate and print amount the debtor is left to pay
  amountLeftToPay = amountToPay-amountPaid;
   System.out.println("The amount debtor is left to pay  " + amountLeftToPay);
   // calculate and print days the debtor has not payed for
   daysToPay=daysDefaulted-numOfDaysPaid;
   System.out.println("The number of days debtor has not paid for " + daysToPay);

   //kindly remove the statement below when you are done with the assignment
    
  }
}
  
  
