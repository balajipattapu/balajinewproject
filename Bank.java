import java.util.*;
public class Bank
{
int Balance=10000;

public void greetCustomer()
{
System.out.println("welcome to the bank sector");
}
			//2000
public void deposit(int amount)
{			
System.out.println("enter the amount");
Balance=Balance+amount;//Balance=10000+2000
System.out.println("deposit successfully"+Balance);
}
			   //2000
public void withdrawal(int money)
{
Balance=Balance-money;//Balance=10000-2000
System.out.println("Widrwal success fully"+Balance);
}
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
Bank obj= new Bank();
obj.greetCustomer();
obj.deposit(sc.nextInt());
obj.withdrawal(sc.nextInt());
}
}
 