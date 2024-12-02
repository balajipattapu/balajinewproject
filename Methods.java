import java.util.*;
public class Methods {
	int Balance=50000;
	public void greetCustomer ()
	{
	System.out.println("helo customer welcome to the customer ");
	}
	public void deposit (int amount)
	{  
                 Balance =Balance+amount;
		System.out.println("amount deposit successfully:"+Balance);
		
	}
	public void withdrawal (int money)
	{   
                Balance =Balance-money;
		System.out.println("amount withdrawal successfully:"+Balance);
			
	}
	public static  void main(String args[])
	{       
                Scanner sc =new Scanner(System.in);
		Methods obj= new Methods();
		obj.greetCustomer();
                System.out.println( "available balance:"+obj.Balance);
                System.out.println("enter the deposit amount:");
		obj.deposit(sc.nextInt());
                System.out.println("enter the withdrawal amount:");
		obj.withdrawal(sc.nextInt());
		sc.close();
		
		
		
			}
}
