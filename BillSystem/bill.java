
//?-------------------------------------------------------------------------
//?-------------------------------------------------------------------------
//TODO double limitingAmount
//TODO double currentDebt

//?-------------------------------------------------------------------------
//?-------------------------------------------------------------------------
//TODO Constructor with 1 parameter: limitingAmount. Note that you should initialize 
//TODO the currentDebt as zero.
//?-------------------------------------------------------------------------
//?-------------------------------------------------------------------------

//TODO  boolean check(double amount) is for checking whether the limitingAmount is 
//TODO  exceeded or not.

//?-------------------------------------------------------------------------
//?-------------------------------------------------------------------------
//TODO void add(double amount) is for adding debts to the bill
//?-------------------------------------------------------------------------
//?-------------------------------------------------------------------------
//TODO void pay(double amount) is for paying the bills with the given amount.
//?-------------------------------------------------------------------------
//?-------------------------------------------------------------------------
//TODO void changeTheLimit(double amount) this method is for changing the limiting 
//todo Amount.
//?-------------------------------------------------------------------------
//?-------------------------------------------------------------------------
//todo Getter methods for limitingAmount and currentDebt

//! READ FROM THE page four to the page 10 and start emplement 

package project;

public class bill {


       double limitingAmount = 0;
       double currentDebt = 0;

       bill(double limitingAmount)
       {
              this.limitingAmount = limitingAmount;
       }

       boolean check(double amount)
       {
              return true;
       }

       void add(double amount)
       {

       }
         void pay(double amount)
         {

         }

         void changeTheLimit(double amount)
       {
              
       }


public static void main(String[] args) {
      
       
 }
       






}
