import java.util.*;
class parameter_call
{
public static void main(String args[])
{
prudhviraj b= new prudhviraj();
b.display();
b.show(b);
}
}
	class balaji
	{
			void display()
				{
				System.out.println("enter hii");	
				}
	}
	 
	class prudhviraj extends balaji
		{

			void show(balaji b)
				{
			System.out.println("hii nerchukora java");
          	     		}

          	   static		
			 {
                 System.out.println("hii ra lanjaa");
         			}
				}