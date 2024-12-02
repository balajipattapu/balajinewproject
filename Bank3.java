import java.util.*;
class Normal
{ 
  int currentBalance=500;

 public void getcustomer()
 {
  System.out.println("wellcome to the customer");
 }
 public void balance(int amount)
 {
  Ssytem.out.println("curret balance is:"+ currentbalance);
 }
 public void deposite(int amount)
 { 
  currentbalace =currentBalance+amount;
  System.out.println("deposite is sucessfully:"+currentbalace);
  }
  public void widthdraw(int amount)
  {
   currenbalance= currentBalance-amount;
   Sytem.out.println("widthdraw is successfully:"+currenbalance);
  }
}
  
  class Bank3
 {
  public static void main(String args[])
 {
  Normal n=new Normal();
   n.getcustomer();
   n.balance(1000);
   n.deposite(400);
   n.widthdraw(200);
 }
}
     
 