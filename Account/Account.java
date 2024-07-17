public class Account
{
    private java.util.Date dateCreate;

 private int id = 0 ;
 private double balance = 0.0;
 static double  annuallnterestRate = 0;

 private java.util.Date getDateCreated()    
{
     return dateCreate;
    }
     public Account()    
   {
      dateCreate = new java.util.Date(); //Delete this

   }
    public Account ( int id , Double balance)
    {
        this(); // OR   dateCreate = new java.util.Date(); 
        this.id = id ;
        this.balance = balance ;
        

    }

    public int getId()
    {
        return this.id;
    }  
     public double getBalance()
    {
        return this.balance;
    }
    public void SetID(int id)
    {
        this.id = id;
    }
      public void SetBalance(double balance)
    {
        this.balance = balance;
    }

  static void annuallnterestRate(double annuallnterestRate)
    {
         Account.annuallnterestRate = annuallnterestRate;
    }

    public void CalcMonthRate()
    {
        this.balance = balance + ((balance * annuallnterestRate)/12);
    }
    public void Deposit(double amount )
    {
        this.balance = balance + amount;
    }
    public void withDraw(double amount)
{
    this.balance=balance-amount;
}

public static void main(String[] args) {

  Account.annuallnterestRate(annuallnterestRate);
  Account ob1 = new Account(11200,3000.0);
  Account ob2 = new Account (11300,2000.0);

  System.out.println(ob1.getBalance()+" "+ob2.getBalance());
  ob1.CalcMonthRate();
  ob2.CalcMonthRate();
    System.out.println(ob1.getBalance()+" "+ob2.getBalance());





    
}









}