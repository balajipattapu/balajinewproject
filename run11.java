import java.util.*;
class Employee
{
 String company_nammes;
 String empname;
double empsalary;
int empage;
String empdesig;

void print(int x)
{
System.out.println("Employyee name is="+company_nammes);
System.out.println("Employyee name is="+empname);
System.out.println("Employee salary="+empsalary);
System.out.println("Employee age="+empage);
System.out.println("Employee designation="+empdesig);
System.out.println("**********************************************");
}
}



public class run11
{
public static void main(String args[])
{
Employee emp=new Employee();


emp.company_nammes="Dell";
emp.empname="sairam";
emp.empsalary=30000;
emp.empage=23;
emp.empdesig="manager";
 
Employee emp1=new Employee();


emp1.company_nammes="hp";
emp1.empname="prudhvi";
emp1.empsalary=30000;
emp1.empage=23;
emp1.empdesig="manager";

emp.print(10);
emp1.print(10);
}
}



