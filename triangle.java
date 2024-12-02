import java.util.*;
class triangle
{
public static void main(String args[])
{
System.out.println("enter how many rows you need");
Scanner Sc=new Scanner(System.in);
int n=Sc.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=n;j>=i;j--)
{
System.out.print("*");
}
System.out.println(" ");
}
}
}