import java.util.*;
class Tests
{
public static void main(String args[])
{
System.out.println("enter any value");

Scanner Sc=new Scanner(System.in);
int n =Sc.nextInt();


if(n <= 35)
{
System.out.println("grade e");
}

else if(n<=36 && n>=50)
{
System.out.println("grade d");
}
else if(n<=51 && n<=60) 
{
System.out.println("grade c");
}
else if(n<=61 && n<=70)
{
System.out.println("grade b");
}
else
{
System.out.println("grade a");
}
}}