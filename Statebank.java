class Bank
{
 int CurrentBalance=1000;
 int amount=300;
   
 public void Customer()
  {
   System.out.println("Well come to thecustomer");
  }
 public void balance(int amount)
 { 
  System.out.println("current balance is sucessfully:"+CurrentBalance);
 }
 public void Deposite(int amount)
 {
  CurrentBalance=CurrentBalance+amount;
  System.out.println("deposite is sucessfully:"+CurrentBalance);
 }
 public void Widthdraw(int amount)
 {
  CurrentBalance=CurrentBalance-amount;
  System.out.println("widthdraw is sucessfully:"+CurrentBalance);
 }
 public void GetCurrentBalance()
 {
  System.out.println("current balance is:"+CurrentBalance);
 }
}
class Statebank
 {
  public static void main(String args[])
 {
   Bank b=new Bank();
      b.Customer();
      b.balance(1000);
      b.Deposite(500);
      b.Widthdraw(100);
      b.GetCurrentBalance();
   }  
}

 
   
  